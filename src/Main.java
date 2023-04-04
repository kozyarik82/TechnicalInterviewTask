public class Main {
    public static void main(String[] args) {
        // Напишите пример перехвата и обработки исключения с использованием собственных исключений
        Login login = new Login(null);
        check(login);
    }

    public static void check(Login login) {
        try {
            if (login == null) ;
            throw new WrongLoginException();
        } catch (WrongLoginException e) {
            System.out.println("Не правильный логин!");
        }
    }
}