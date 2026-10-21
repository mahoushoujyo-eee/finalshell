import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTextArea;

class ue_4 implements Runnable {
   final String v;
   final dA_3 Z;
   private static final String a;

   ue_4(dA_3 var1, String var2) {
      this.Z = var1;
      this.v = var2;
   }

   @Override
   public void run() {
      ue_4 var10000;
      label42: {
         label43: {
            String[] var1 = dA_3.q();
            var10000 = this;
            if (var1 == null) {
               if ((JTextArea)com.c.c(406171939123952740L).get(com.c.c(264483240089333141L).get(this)) != null) {
                  ((JTextArea)com.c.c(406171939123952740L).get(com.c.c(264483240089333141L).get(this))).append((String)com.c.c(326124367307822784L).get(this));
                  var10000 = (ue_4)com.c.c(264483240089333141L).get(this);
                  Object[] var10001 = com.c.a(com.c.c(406171939123952740L).get(com.c.c(264483240089333141L).get(this)));
                  Method var10003 = com.c.d(545163393621250611L);
                  Object[] var10002 = var10001;
                  var10001 = var10000;
                  Method var4 = var10003;

                  try {
                     var4.invoke(var10001, var10002);
                  } catch (InvocationTargetException var2) {
                     throw var2.getTargetException();
                  }

                  var5 = com.c.c(198290463385639860L).getBoolean(com.c.c(264483240089333141L).get(this));
                  if (var1 != null) {
                     break label43;
                  }

                  if (var5) {
                     ((JTextArea)com.c.c(406171939123952740L).get(com.c.c(264483240089333141L).get(this)))
                        .setCaretPosition(((JTextArea)com.c.c(406171939123952740L).get(com.c.c(264483240089333141L).get(this))).getDocument().getLength());
                  }
               }

               var10000 = this;
            }

            if (var1 != null) {
               break label42;
            }

            var5 = ((String)com.c.c(326124367307822784L).get(var10000)).contains(a);
         }

         if (!var5) {
            return;
         }

         var10000 = this;
      }

      com.c.c(602217905248930587L).setBoolean(com.c.c(264483240089333141L).get(var10000), true);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "LM110\u001eOKD".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 74;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      } else {
         var6 = 74;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 74;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 111;
               break;
            case 1:
               var23 = 105;
               break;
            case 2:
               var23 = 29;
               break;
            case 3:
               var23 = 23;
               break;
            case 4:
               var23 = 27;
               break;
            case 5:
               var23 = 32;
               break;
            default:
               var23 = 108;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





