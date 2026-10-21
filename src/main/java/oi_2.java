import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

class Oi_2 implements ActionListener {
   final u6_2 p;
   final zM c;
   private static final String a;

   Oi_2(zM var1, u6_2 var2) {
      this.c = var1;
      this.p = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      com.ky_4[] var2 = zM.I();
      Object[] var10000 = com.c.f();
      Method var17 = com.c.d(270389152141252877L);
      Object[] var55 = var10000;
      Object var38 = null;

      try {
         var10000 = (yT_3)var17.invoke(var38, var55);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      if (var2 != null) {
         var38 = com.c.f();
         Method var10003 = com.c.d(163462326892114024L);
         var55 = (Object[])var38;
         var38 = var10000;
         Method var19 = var10003;

         try {
            var10000 = (Object[])var19.invoke(var38, var55);
         } catch (InvocationTargetException var14) {
            throw var14.getTargetException();
         }

         var38 = com.c.f();
         var10003 = com.c.d(133802226692684648L);
         var55 = (Object[])var38;
         var38 = var10000;
         Method var21 = var10003;

         try {
            var22 = (Boolean)var21.invoke(var38, var55);
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (var22) {
            var10000 = (Object[])com.c.c(588461528726846294L).get(this);
            var38 = com.c.f();
            var10003 = com.c.d(164139683561291111L);
            var55 = (Object[])var38;
            var38 = var10000;
            Method var27 = var10003;

            try {
               var10000 = (String)var27.invoke(var38, var55);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            String var3;
            label110: {
               label97: {
                  var3 = var10000;
                  String var29 = var3;
                  if (var2 != null) {
                     var10000 = com.c.a(var3);
                     Method var31 = com.c.d(330094358428833085L);
                     var55 = var10000;
                     var38 = null;

                     try {
                        var32 = (Boolean)var31.invoke(var38, var55);
                     } catch (InvocationTargetException var9) {
                        throw var9.getTargetException();
                     }

                     if (!var32) {
                        break label97;
                     }

                     var29 = (String)com.c.c(149082991182987426L).get(null);
                  }

                  var3 = var29;
                  if (var2 != null) {
                     break label110;
                  }
               }

               File var4 = new File(var3);
               String var33 = var4.getParent();
               if (var2 != null) {
                  if (var33 == null) {
                     break label110;
                  }

                  var33 = var4.getParent();
               }

               var3 = var33;
            }

            JFileChooser var16 = new JFileChooser(var3);
            var16.setDialogTitle(a);
            var16.setFileSelectionMode(0);
            var16.setMultiSelectionEnabled(false);
            var16.setFileFilter(new KE(this));
            int var5 = var16.showOpenDialog(SwingUtilities.getWindowAncestor((zM)com.c.c(156222592412218828L).get(this)));
            if (var5 == 0) {
               File var6 = var16.getSelectedFile();
               var10000 = (Object[])com.c.c(588461528726846294L).get(this);
               var38 = com.c.a(var6.getAbsolutePath());
               var10003 = com.c.d(341017293076740193L);
               var55 = (Object[])var38;
               var38 = var10000;
               Method var35 = var10003;

               try {
                  var35.invoke(var38, var55);
               } catch (InvocationTargetException var8) {
                  throw var8.getTargetException();
               }

               var10000 = (Object[])com.c.c(156222592412218828L).get(this);
               var38 = com.c.a(var6.getAbsolutePath());
               var10003 = com.c.d(138118316736819193L);
               var55 = (Object[])var38;
               var38 = var10000;
               Method var37 = var10003;

               try {
                  var37.invoke(var38, var55);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }
            }

            return;
         }

         var10000 = com.c.f();
         Method var24 = com.c.d(270389152141252877L);
         var55 = var10000;
         var38 = null;

         try {
            var10000 = (yT_3)var24.invoke(var38, var55);
         } catch (InvocationTargetException var12) {
            throw var12.getTargetException();
         }
      }

      var38 = com.c.f();
      Method var67 = com.c.d(248890456776257543L);
      var55 = (Object[])var38;
      var38 = var10000;
      Method var25 = var67;

      try {
         var25.invoke(var38, var55);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "送抗図父斚亢".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 107;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 107;
         var10006 = var0;
      } else {
         var6 = 107;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 107;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 99;
               break;
            case 1:
               var23 = 21;
               break;
            case 2:
               var23 = 102;
               break;
            case 3:
               var23 = 26;
               break;
            case 4:
               var23 = 118;
               break;
            case 5:
               var23 = 63;
               break;
            default:
               var23 = 114;
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





