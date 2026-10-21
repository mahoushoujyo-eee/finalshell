import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class gt_2 implements di_4 {
   @Override
   public void O(DataInputStream var1, DataOutputStream var2, String var3, String var4) throws IOException {
      var2.writeInt(var3.getBytes().length);
      var2.write(var3.getBytes());
      var2.writeInt(var4.getBytes().length);
      var2.write(var4.getBytes());
   }
}





