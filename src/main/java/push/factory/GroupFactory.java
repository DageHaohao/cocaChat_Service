package push.factory;

import push.bean.db.Group;
import push.bean.db.GroupMember;
import push.bean.db.User;

import java.util.Set;

/**
 * @author 91319
 * @Title: GroupFactory
 * @ProjectName cocaChat_service
 * @Description: TODO 群数据处理类
 * @date 2019/1/3116:57
 */
public class GroupFactory {

    public static Group findById(String groupId) {
        // TODO 查询一个群
        return null;
    }

    public static Group findById(User user, String groupId) {
        // TODO 查询一个群, 同时该User必须为群的成员，否则返回null
        return null;
    }

    public static Set<GroupMember> getMembers(Group group) {
        // TODO 查询一个群的成员
        return null;
    }

}
