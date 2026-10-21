import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextArea;

class up_4 implements Runnable {
   final String t;
   final JA j;

   up_4(JA var1, String var2) {
      this.j = var1;
      this.t = var2;
   }

   @Override
   public void run() {
      ((JTextArea)com.c.c(494102270673182678L).get(com.c.c(462620683228684361L).get(this))).append((String)com.c.c(132176917222937444L).get(this) + "\n");
      Method var10000 = (Method)com.c.c(462620683228684361L).get(this);
      Object[] var10001 = com.c.a(com.c.c(494102270673182678L).get(com.c.c(462620683228684361L).get(this)));
      Method var10003 = com.c.d(485337826950019051L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      ((JTextArea)com.c.c(494102270673182678L).get(com.c.c(462620683228684361L).get(this)))
         .setCaretPosition(((JTextArea)com.c.c(494102270673182678L).get(com.c.c(462620683228684361L).get(this))).getDocument().getLength());
   }
}





