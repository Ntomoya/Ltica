import com.pi4j.io.serial.*;

public class SerialTest {
    public static void main(String[] args) throws InterruptedException {

        // create an instance of the serial communications class
        final Serial serial = SerialFactory.createInstance();

        // たぶん受信処理
        serial.addListener(new SerialDataListener() {
                @Override
                public void dataReceived(SerialDataEvent event) {
                    // print out the data received to the console
                    System.out.print(event.getData());
                }
            });

        try {
            serial.open(Serial.DEFAULT_COM_PORT, 115200);
            // 送信処理
            try {
                serial.writeln("Hello world!");
            } catch(IllegalStateException ex) {
                ex.printStackTrace();
            }
        } catch(SerialPortException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        serial.shutdown();
    }
}
