package GetCheckUserInfo;

public class NotCorrectSex extends Exception{
    public String getMesage() {
        return "Пол указан неверно. Допустимы только 'f' или 'm'";
    }
}
