import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class lj_4 extends ln_4 {
   String F;
   HashMap g;
   boolean w;
   public static int m;
   private static final String c;

   public lj_4() {
      int[] var10000 = yB_3.Y();
      super();
      int[] var1 = var10000;
      com.c.c(129501355937067347L).set(this, new HashMap());
      com.c.c(350290802122508960L).setBoolean(this, true);
      int var2 = 0;

      while (var2 < com.c.c(216182060077896093L).getInt(null)) {
         dx_4 var3 = new dx_4();
         String var4 = "#" + (var2 + 1);
         ((HashMap)com.c.c(129501355937067347L).get(this)).put(var4, var3);
         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   public String l() {
      return (String)com.c.c(506941294856995211L).get(this);
   }

   public void w(String var1) {
      com.c.c(506941294856995211L).set(this, var1);
   }

   public dx_4 m(String var1) {
      return (dx_4)((HashMap)com.c.c(129501355937067347L).get(this)).get(var1);
   }

   public ArrayList c() {
      int[] var10000 = yB_3.Y();
      String var2 = (String)com.c.c(506941294856995211L).get(this);
      Pattern var3 = Pattern.compile(c);
      Matcher var4 = var3.matcher(var2);
      int[] var1 = var10000;
      ArrayList var5 = new ArrayList();

      while (var4.find()) {
         String var6 = var2.substring(var4.start());
         Pattern var7 = Pattern.compile("]");
         Matcher var8 = var7.matcher(var6);
         if (var8.find()) {
            String var9 = var6.substring(0, var8.start() + 1);
            CS var10 = new CS();
            Object[] var10001 = com.c.a(var4.start());
            Method var10003 = com.c.d(506677184002528899L);
            Object[] var10002 = var10001;
            CS var22 = var10;
            Method var18 = var10003;

            try {
               var18.invoke(var22, var10002);
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            var10001 = com.c.a(var4.start() + var8.end());
            var10003 = com.c.d(479743094188790518L);
            var10002 = var10001;
            CS var24 = var10;
            Method var19 = var10003;

            try {
               var19.invoke(var24, var10002);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            int var11 = var9.indexOf(" ");
            String var12 = var9.substring(2, var11);
            var10001 = com.c.a(var12);
            var10003 = com.c.d(345084637656236571L);
            var10002 = var10001;
            CS var26 = var10;
            Method var20 = var10003;

            try {
               var20.invoke(var26, var10002);
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            String var13 = var9.substring(var11, var9.length() - 1).trim();
            var10001 = com.c.a(var13);
            var10003 = com.c.d(500468835809116636L);
            var10002 = var10001;
            CS var28 = var10;
            Method var21 = var10003;

            try {
               var21.invoke(var28, var10002);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            var5.add(var10);
         }

         if (var1 != null) {
            break;
         }
      }

      return var5;
   }

   public String u(ArrayList var1) {
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(547398689030025911L);
      Object[] var10002 = var10001;
      lj_4 var38 = this;
      Method var10000 = var10003;

      try {
         var25 = (String)var10000.invoke(var38, var10002);
      } catch (InvocationTargetException var20) {
         throw var20.getTargetException();
      }

      String var3 = var25;
      int[] var26 = yB_3.Y();
      var10002 = com.c.f();
      Method var10004 = com.c.d(384035338232698498L);
      Object[] var62 = var10002;
      lj_4 var54 = this;
      Method var39 = var10004;

      try {
         var10001 = (ArrayList)var39.invoke(var54, var62);
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }

      ArrayList var4 = var10001;
      int[] var2 = var26;
      StringBuffer var5 = new StringBuffer();
      Iterator var6 = var4.iterator();

      label130:
      while (true) {
         boolean var27 = var6.hasNext();

         label128:
         while (true) {
            if (!var27) {
               break label130;
            }

            CS var7 = (CS)var6.next();

            for (oJ_3 var9 : var1) {
               var10001 = com.c.f();
               var10003 = com.c.d(257102191814086367L);
               var10002 = var10001;
               oJ_3 var42 = var9;
               var10000 = var10003;

               try {
                  var29 = (String)var10000.invoke(var42, var10002);
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               String var10 = var29;
               var10001 = com.c.f();
               var10003 = com.c.d(221314680238633888L);
               var10002 = var10001;
               oJ_3 var44 = var9;
               var10000 = var10003;

               try {
                  var31 = (JTextField)var10000.invoke(var44, var10002);
               } catch (InvocationTargetException var17) {
                  throw var17.getTargetException();
               }

               label136: {
                  String var11 = var31.getText();
                  CS var32 = var7;
                  if (var2 == null) {
                     var10001 = com.c.f();
                     var10003 = com.c.d(452972440898270588L);
                     var10002 = var10001;
                     CS var46 = var7;
                     var10000 = var10003;

                     try {
                        var34 = (String)var10000.invoke(var46, var10002);
                     } catch (InvocationTargetException var16) {
                        throw var16.getTargetException();
                     }

                     var27 = var34.equals(var10);
                     if (var2 != null) {
                        continue label128;
                     }

                     if (!var27) {
                        break label136;
                     }

                     var32 = var7;
                  }

                  var10001 = com.c.a(var11);
                  var10003 = com.c.d(320383999333942680L);
                  var10002 = var10001;
                  CS var48 = var32;
                  var10000 = var10003;

                  try {
                     var10000.invoke(var48, var10002);
                  } catch (InvocationTargetException var15) {
                     throw var15.getTargetException();
                  }
               }

               if (var2 != null) {
                  break;
               }
            }

            if (var2 != null) {
               break label130;
            }
            break;
         }
      }

      int var21 = 0;
      boolean var22 = false;
      Iterator var23 = var4.iterator();

      while (true) {
         if (var23.hasNext()) {
            CS var24 = (CS)var23.next();
            var22 = true;
            Object[] var71 = com.c.f();
            Method var10006 = com.c.d(522169852020904082L);
            Object[] var10005 = var71;
            CS var72 = var24;
            var10003 = var10006;

            try {
               var68 = (Integer)var10003.invoke(var72, var10005);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            var5.append(var3.substring(var21, var68));
            var10002 = com.c.f();
            var10004 = com.c.d(197983092181873471L);
            Object[] var69 = var10002;
            CS var60 = var24;
            Method var49 = var10004;

            try {
               var10001 = (String)var49.invoke(var60, var69);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            var5.append((String)var10001);
            var10001 = com.c.f();
            var10003 = com.c.d(537962425760684299L);
            var10002 = var10001;
            CS var52 = var24;
            var10000 = var10003;

            try {
               var37 = (Integer)var10000.invoke(var52, var10002);
            } catch (InvocationTargetException var12) {
               throw var12.getTargetException();
            }

            var21 = var37;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         if (!var22) {
            var5.append(var3);
            if (var2 == null) {
               return var5.toString();
            }
         }
         break;
      }

      var5.append(var3.substring(var21));
      return var5.toString();
   }

   public boolean o() {
      return com.c.c(350290802122508960L).getBoolean(this);
   }

   public void f(boolean var1) {
      com.c.c(350290802122508960L).setBoolean(this, var1);
   }

   @Override
   public ln_4 B() {
      return null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "-[\u001e\u0013<Qr\u0002".toCharArray();
      int var10004 = var10003.length;
      int var4 = 0;
      byte var16 = 68;
      char[] var10002 = var10003;
      int var7 = var10004;
      char[] var20;
      byte var24;
      int var10005;
      char var10006;
      byte var10007;
      if (var10004 <= 1) {
         var20 = var10003;
         var10005 = var4;
         char var10008 = var10003[var4];
         var10007 = 68;
         var10006 = var10008;
         switch (var4 % 7) {
            case 0:
               var24 = 53;
               break;
            case 1:
               var24 = 68;
               break;
            case 2:
               var24 = 42;
               break;
            case 3:
               var24 = 116;
               break;
            case 4:
               var24 = 36;
               break;
            case 5:
               var24 = 113;
               break;
            default:
               var24 = 106;
         }
      } else {
         var16 = 68;
         var7 = var10004;
         if (var10004 <= var4) {
            String var19 = new String(var10003).intern();
            byte var11 = -1;
            c = var19;
            long var6 = 649996851623476809L;
            long var15 = 5712375649803681356L ^ var6;
            var11 = -1;
            long var5 = var15;
            com.c.c(216182060077896093L).setInt(null, (int)var5);
            return;
         }

         var20 = var10003;
         var10005 = var4;
         char var25 = var10003[var4];
         var10007 = 68;
         var10006 = var25;
         switch (var4 % 7) {
            case 0:
               var24 = 53;
               break;
            case 1:
               var24 = 68;
               break;
            case 2:
               var24 = 42;
               break;
            case 3:
               var24 = 116;
               break;
            case 4:
               var24 = 36;
               break;
            case 5:
               var24 = 113;
               break;
            default:
               var24 = 106;
         }
      }

      while (true) {
         var20[var10005] = (char)(var10006 ^ var10007 ^ var24);
         var4++;
         if (var16 == 0) {
            var20 = var10002;
            var10005 = var16;
            char var27 = var10002[var16];
            var10007 = var16;
            var10006 = var27;
            switch (var4 % 7) {
               case 0:
                  var24 = 53;
                  break;
               case 1:
                  var24 = 68;
                  break;
               case 2:
                  var24 = 42;
                  break;
               case 3:
                  var24 = 116;
                  break;
               case 4:
                  var24 = 36;
                  break;
               case 5:
                  var24 = 113;
                  break;
               default:
                  var24 = 106;
            }
         } else {
            if (var7 <= var4) {
               String var18 = new String(var10002).intern();
               byte var9 = -1;
               c = var18;
               long var2 = 649996851623476809L;
               long var14 = 5712375649803681356L ^ var2;
               var9 = -1;
               long var0 = var14;
               com.c.c(216182060077896093L).setInt(null, (int)var0);
               return;
            }

            var20 = var10002;
            var10005 = var4;
            char var26 = var10002[var4];
            var10007 = var16;
            var10006 = var26;
            switch (var4 % 7) {
               case 0:
                  var24 = 53;
                  break;
               case 1:
                  var24 = 68;
                  break;
               case 2:
                  var24 = 42;
                  break;
               case 3:
                  var24 = 116;
                  break;
               case 4:
                  var24 = 36;
                  break;
               case 5:
                  var24 = 113;
                  break;
               default:
                  var24 = 106;
            }
         }
      }
   }
}





