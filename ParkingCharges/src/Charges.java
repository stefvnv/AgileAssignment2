public class Charges {
    public double calculateCharges(double hours) throws ChargesExceptionHandler {

        //Invalid
        if (hours < 0) {
            throw new ChargesExceptionHandler("Invalid (low) values");
        }
        if (hours > 24) {
            throw new ChargesExceptionHandler("Invalid (high) values");
        }

        //Valid
        if (hours <= 3) {
            return 2.00;
        }

        if (hours < 18) {
            if (hours < 4){
                return 2.50;
            }
            if (hours < 5){
                return 3.00;
            }
            if (hours < 6){
                return 3.50;
            }
            if (hours < 7){
                return 4.00;
            }
            if (hours < 8){
                return 4.50;
            }
            if (hours < 9){
                return 5.00;
            }
            if (hours < 10){
                return 5.50;
            }
            if (hours < 11){
                return 6.00;
            }
            if (hours < 12){
                return 6.50;
            }
            if (hours < 13){
                return 7.00;
            }
            if (hours < 14){
                return 7.50;
            }
            if (hours < 15){
                return 8.00;
            }
            if (hours < 16){
                return 8.50;
            }
            if (hours < 17){
                return 9.50;
            }
        }

        if (hours < 25) {
            return 10.00;

        }
        throw new ChargesExceptionHandler("Should not reach this line.");
    }

}
