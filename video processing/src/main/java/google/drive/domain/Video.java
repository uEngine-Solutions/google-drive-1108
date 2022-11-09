package google.drive.domain;

import google.drive.domain.VideoProcessed;
import google.drive.VideoProcessingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Video_table")
@Data
public class Video  {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private Long fileId;
    
    private String url;

    @PostPersist
    public void onPostPersist(){

        VideoProcessed videoProcessed = new VideoProcessed(this);
        videoProcessed.publishAfterCommit();

    }

    public static VideoRepository repository(){
        VideoRepository videoRepository = VideoProcessingApplication.applicationContext.getBean(VideoRepository.class);
        return videoRepository;
    }




    public static void processVideo(FileUploaded fileUploaded){

        if("movie".equals(fileUploaded.getType())){
            Video video = new Video();
            
            video.setFileId(fileUploaded.getId());
            //////// video processing //////
            video.setUrl("http://youtube.com/"+fileUploaded.getId());

            repository().save(video);

        }
        
    }


    public static void deleteVideo(FileDeleted fileDeleted){


        /** Example 2:  finding and process        */
        
        repository().findByFileId(fileDeleted.getId()).ifPresent(video->{
            
            repository().delete(video);


         });


        
    }



}
