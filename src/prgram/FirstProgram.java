//это расположение нашего шаблона программы
package prgram;


//это класс - шаблон описания обекта
public class FirstProgram {

    public static void calc(int a, char simb, int b){
        switch (simb){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("strange simbols");

        }
    }

    /*
     * это метод - действия для обьекта. Это главный метод прилоения, для щапуска программы
     * public - это модификатор доступа к переменной/методу
     * static - опрееление свойств которые обрабатывает наш метод
     */
    public static void main(String[] args) {
        calc(7, '/',7);

    }
}
