import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Ex02 {
    public static void main(String[] args) {
        PythonInterpreter python = new PythonInterpreter();

        // 모듈 로딩
        python.exec("import sys");
        python.exec("print(sys)");

        // 파이썬 변수에 값을 대입
        // python.set("num", 100);
        // python.exec("num = " + 100);

        int num = 100;
        python.exec("num = " + num);
        python.exec("print(num)");
        python.exec("x = 3 + 3");

        // 파이썬 변수를 자바로 가져옴
        PyObject po = python.get("x");
        System.out.println("po: " + x);

        python.close();
    }
}
