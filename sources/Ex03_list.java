import org.python.core.PyList;
import org.python.util.PythonInterpreter;

public class Ex03_list {
    public static void main(String[] args) {
        PythonInterpreter python = new PythonInterpreter();

        python.exec("numbers = list(range(1, 6))");
        PyList pl = (PyList) python.get("numbers");
        System.out.println("list: ", pl);
        System.out.println("size: ", pl.size());

        for (int i = 0; i < pl.size(); i++) {
            System.out.println(pl.get(i));
        }

        python.close();
    }
}
