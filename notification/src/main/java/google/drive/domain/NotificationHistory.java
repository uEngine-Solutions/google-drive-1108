package google.drive.domain;

import google.drive.NotificationApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="NotificationHistory_table")
@Data

public class NotificationHistory  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String message;
    
    
    
    
    
    private String userId;


    public static NotificationHistoryRepository repository(){
        NotificationHistoryRepository notificationHistoryRepository = NotificationApplication.applicationContext.getBean(NotificationHistoryRepository.class);
        return notificationHistoryRepository;
    }




    public static void sendNotification(VideoProcessed videoProcessed){

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(videoProcessed.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

        
    }
    public static void sendNotification(FileUploaded fileUploaded){

        /** Example 1:  new item 
        NotificationHistory notificationHistory = new NotificationHistory();
        repository().save(notificationHistory);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(notificationHistory->{
            
            notificationHistory // do something
            repository().save(notificationHistory);


         });
        */

        
    }


}
