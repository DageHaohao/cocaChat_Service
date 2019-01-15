package push.service;
import push.bean.api.account.RegisterModel;
import push.bean.card.UserCard;
import push.bean.db.User;
import push.factory.UserFactory;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author 黄君豪
 * @Title: AccountService
 * @ProjectName cocaChat_service
 * @Description: TODO
 * @date 2019/1/1521:10
 */

@Path("/account")
public class AccountService  {

    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserCard register (RegisterModel model){

        User user = UserFactory.register(model.getAccount(),model.getPassword(),model.getName());
        if(user!=null){
            UserCard card = new UserCard();
            card.setName(user.getName());
            card.setPhone(user.getPhone());
            card.setSex(user.getSex());
            card.setFollow(true);
            card.setModifyAt(user.getUpdateAt());
            return card;
        }

        return null;


    }


  /*  @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public RegisterModel register(RegisterModel model){

        return model;


    }*/




}
