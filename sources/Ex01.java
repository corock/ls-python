import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class Ex01 {
    public static void main(String[] args) {
        // 파이썬 인터프리터 객체
        PythonInterpreter python = new PythonInterpreter();

        // num 변수에 20 할당
        python.set("num", 20);

        // 파이썬 코드 실행
        python.exec("square = a * a");

        // 파이썬 변수를 자바 변수로 변환
        PyInteger square = (PyInteger) python.get("square");

        // 파이썬 객체를 숫자로 변환
        System.out.println("square: " + square.asInt());

        // 파이썬 인터프리터 닫기
        python.close();
    }
}
