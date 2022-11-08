package google.drive.domain;

import google.drive.domain.*;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="videos", path="videos")
public interface VideoRepository extends PagingAndSortingRepository<Video, Long>{

    Optional<Video> findByFileId(Long id);  //  select * from video where fileId=?

}
