package push;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.glassfish.jersey.server.ResourceConfig;
import push.provider.AuthRequestFilter;
import push.provider.GsonProvider;
import push.service.AccountService;

import java.util.logging.Logger;

/**
 * @author 黄君豪
 * @Title: Application
 * @ProjectName cocaChat_service
 * @Description: TODO
 * @date 2019/1/1520:54
 */
public class Application extends ResourceConfig {

    public Application (){
        //注册逻辑处理的包名
        packages(AccountService.class.getPackage().getName());

        // 注册我们的全局请求拦截器
        register(AuthRequestFilter.class);

        // 注册Json解析器
        //register(JacksonJsonProvider.class);
        // 替换解析器为Gson
        register(GsonProvider.class);

        //注册日志
        register(Logger.class);
    }

}
