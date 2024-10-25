package ti1.personalLogin;

import java.util.HashMap;
import java.util.Map;

import spark.Request;
import spark.Response;
import spark.Route;
import ti1.utils.Path;
import ti1.utils.ViewUtil;

public class PersonalLogin {
    public static Route servePersonalLoginPage = (Request request, Response response) -> {
        Map<String, Object> model = new HashMap<>();
        return ViewUtil.render(request, model, Path.Template.PERSONAL_LOGIN);
    };
}
