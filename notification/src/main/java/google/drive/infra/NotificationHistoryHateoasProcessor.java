package google.drive.infra;
import google.drive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class NotificationHistoryHateoasProcessor implements RepresentationModelProcessor<EntityModel<NotificationHistory>>  {

    @Override
    public EntityModel<NotificationHistory> process(EntityModel<NotificationHistory> model) {

        
        return model;
    }
    
}
