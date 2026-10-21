import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class BE implements ActionListener {
   final z2 W;
   private static final String a;

   BE(z2 var1) {
      this.W = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      Object[] var10000 = com.c.a(a);
      Method var4 = com.c.d(517287540690064504L);
      Object[] var11 = var10000;
      Object var8 = null;

      try {
         var10000 = (Object[])var4.invoke(var8, var11);
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }

      var10000 = com.c.a(var10000);
      Method var7 = com.c.d(468188037407298601L);
      var11 = var10000;
      var8 = null;

      try {
         var7.invoke(var8, var11);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "n!Fy!C3@\u001eox\nC\u0015h5bD\n|\u0010^)EK\u0000S\"#\f[c\u0003w\u000fz#Jv%@/;\u001d\u001e9\u001c7\u0007Vbayrh\"y?\u0019MoT\u0013Az^zr4*a\u000fzn#i,n\u000bt"
         .toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 73;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 73;
         var10006 = var0;
      } else {
         var6 = 73;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 73;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 69;
               break;
            case 1:
               var23 = 4;
               break;
            case 2:
               var23 = 103;
               break;
            case 3:
               var23 = 73;
               break;
            case 4:
               var23 = 13;
               break;
            case 5:
               var23 = 76;
               break;
            default:
               var23 = 10;
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





