package push.factory;

import org.hibernate.Session;
import push.bean.db.User;
import push.utils.Hib;

/**
 * @author 黄君豪
 * @Title: UserFactory
 * @ProjectName cocaChat_service
 * @Description: TODO
 * @date 2019/1/1521:09
 */
public class UserFactory {

    public static User register(String account, String password, String name){

        User user = new User();
        user.setName(name);
        user.setPhone(account);
        user.setPassword(password);

        Session session = Hib.session();
        session.beginTransaction();
        try {
            session.save(user);
            session.getTransaction().commit();
            return user;
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
            return null;
        }

    }

}
