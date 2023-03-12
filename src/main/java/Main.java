import controllers.UserController;
import model.FileOperation;
import model.FileOperationImpl;
import model.Repository;
import model.RepositoryFile;
import utils.Validate;
import views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}
