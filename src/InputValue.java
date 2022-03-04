
// Class for check input value type and validation options
public class InputValue {
       private double inputNumber;
//       private String inputMessage;
//       private String inputType;
       private boolean inputInvalid;

       public InputValue(double inputNumber, boolean inputInvalid) {
              this.inputNumber = inputNumber;
//              this.inputMessage = inputMessage;
//              this.inputType = inputType;
              this.inputInvalid = inputInvalid;
       }

       public double getInputNumber() {
              return inputNumber;
       }

       public void setInputNumber(double inputNumber) {
              this.inputNumber = inputNumber;
       }

//       public String getInputMessage() {
//              return inputMessage;
//       }
//
//       public void setInputMessage(String inputMessage) {
//              this.inputMessage = inputMessage;
//       }
//
//       public String getInputType() {
//              return inputType;
//       }
//
//       public void setInputType(String inputType) {
//              this.inputType = inputType;
//       }

       public boolean isInputInvalid() {
              return inputInvalid;
       }

       public void setInputInvalid(boolean inputInvalid) {
              this.inputInvalid = inputInvalid;
       }
}
