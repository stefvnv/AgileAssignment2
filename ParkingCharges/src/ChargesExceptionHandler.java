public class ChargesExceptionHandler extends Exception {
    private String message = "";

    public ChargesExceptionHandler(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}