package com.finalshell.core;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AppendCarriageReturnCRPanel;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class Lj4_2 extends Ln4_2 {
   public String F;
   public HashMap g;
   public boolean w;
   public static int m;
   public static String c;

   public Lj4_2() {
   super();
      int[] var10000 = AppendCarriageReturnCRPanel.Y();
      int[] var1 = var10000;
      HashMap var10001 = new HashMap();
      long var6 = 129501355937067347L;
      HashMap var5 = var10001;
      Ref.s(129501355937067347L, var5, var6);
      Registry.lookupField(350290802122508960L).setBoolean(this, true);
      int var2 = 0;

      while (var2 < Registry.lookupField(216182060077896093L).getInt(null)) {
         Dx4_2 var3 = new Dx4_2();
         String var4 = "#" + (var2 + 1);
         Object var7 = 129501355937067347L;
         ((HashMap)Ref.g(129501355937067347L, var7)).put(var4, var3);
         var2++;
         if (var1 != null) {
            break;
         }
      }
   }

   public String l() {
      Object var1 = 506941294856995211L;
      return (String)Ref.g(506941294856995211L, var1);
   }

   public void w(String var1) {
      long var3 = 506941294856995211L;
      Ref.s(506941294856995211L, var1, var3);
   }

   public Dx4_2 m(String var1) {
      Object var2 = 129501355937067347L;
      return (Dx4_2)((HashMap)Ref.g(129501355937067347L, var2)).get(var1);
   }

   public ArrayList c() {
      AppendCarriageReturnCRPanel.Y();
      Object var14 = 506941294856995211L;
      String var2 = (String)Ref.g(506941294856995211L, var14);
      Pattern var3 = Pattern.compile(c);
      Matcher var4 = var3.matcher(var2);
      Lj4_2 var1 = this;
      ArrayList var5 = new ArrayList();

      while (var4.find()) {
         String var6 = var2.substring(var4.start());
         Pattern var7 = Pattern.compile("]");
         Matcher var8 = var7.matcher(var6);
         if (var8.find()) {
            String var9 = var6.substring(0, var8.start() + 1);
            CS var10 = new CS();
            Object[] var10002 = Registry.packArgs(var4.start());
            long var17 = 506677184002528899L;
            Object[] var16 = var10002;
            Ref.h(506677184002528899L, var16, var17);

            try {
               ;
            } catch (InvocationTargetException var27) {
               throw var27.getTargetException();
            }

            Object[] var10003 = Registry.packArgs(var4.start() + var8.end());
            long var19 = 479743094188790518L;
            Object[] var18 = var10003;
            Ref.h(479743094188790518L, var18, var19);

            try {
               ;
            } catch (InvocationTargetException var26) {
               throw var26.getTargetException();
            }

            int var11 = var9.indexOf(" ");
            String var12 = var9.substring(2, var11);
            Object[] var10004 = Registry.packArgs(var12);
            long var21 = 345084637656236571L;
            Object[] var20 = var10004;
            Ref.h(345084637656236571L, var20, var21);

            try {
               ;
            } catch (InvocationTargetException var25) {
               throw var25.getTargetException();
            }

            String var13 = var9.substring(var11, var9.length() - 1).trim();
            Object[] var10005 = Registry.packArgs(var13);
            long var23 = 500468835809116636L;
            Object[] var22 = var10005;
            Ref.h(500468835809116636L, var22, var23);

            try {
               ;
            } catch (InvocationTargetException var24) {
               throw var24.getTargetException();
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
      Integer var61;
      Integer var63;
      String var10001 = (String)(Registry.emptyArgs());
      long var13 = 547398689030025911L;
      Object var12 = var10001;
      var10001 = Ref.h(547398689030025911L, var12, var13);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var38) {
         throw var38.getTargetException();
      }

      String var3 = var10001;
      AppendCarriageReturnCRPanel.Y();
      ArrayList var10003 = (ArrayList)(Registry.emptyArgs());
      long var15 = 384035338232698498L;
      Object var14 = var10003;
      var10003 = Ref.h(384035338232698498L, var14, var15);

      try {
         var10003 = (ArrayList)var10003;
      } catch (InvocationTargetException var37) {
         throw var37.getTargetException();
      }

      ArrayList var4 = var10003;
      Lj4_2 var2 = this;
      StringBuffer var5 = new StringBuffer();
      Iterator var6 = var4.iterator();

      label130:
      while (true) {
         OJ3 var10002 = var6.hasNext();

         label128:
         while (true) {
            if (var10002 == null) {
               break label130;
            }

            CS var7 = (CS)var6.next();

            for (OJ3 var9 : var1) {
               var10002 = var9;
               var10003 = Registry.emptyArgs();
               long var17 = 257102191814086367L;
               Object var16 = var10003;
               var10003 = Ref.h(257102191814086367L, var16, var17);

               try {
                  var10003 = (String)var10003;
               } catch (InvocationTargetException var36) {
                  throw var36.getTargetException();
               }

               String var10 = var10003;
               JTextField var10004 = Registry.emptyArgs();
               long var19 = 221314680238633888L;
               Object var18 = var10004;
               var10004 = Ref.h(221314680238633888L, var18, var19);

               try {
                  var10004 = (JTextField)var10004;
               } catch (InvocationTargetException var35) {
                  throw var35.getTargetException();
               }

               label136: {
                  String var11 = var10004.getText();
                  if (var2 == null) {
                     String var10005 = Registry.emptyArgs();
                     long var21 = 452972440898270588L;
                     Object var20 = var10005;
                     var10005 = Ref.h(452972440898270588L, var20, var21);

                     try {
                        var10005 = (String)var10005;
                     } catch (InvocationTargetException var34) {
                        throw var34.getTargetException();
                     }

                     boolean var54 = var10005.equals(var10);
                     if (var2 != null) {
                        continue label128;
                     }

                     if (!var54) {
                        break label136;
                     }
                  }

                  Object[] var55 = Registry.packArgs(var11);
                  long var23 = 320383999333942680L;
                  Object[] var22 = var55;
                  Ref.h(320383999333942680L, var22, var23);

                  try {
                     ;
                  } catch (InvocationTargetException var33) {
                     throw var33.getTargetException();
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

      int var39 = 0;
      boolean var40 = false;
      Iterator var41 = var4.iterator();

      while (true) {
         if (var41.hasNext()) {
            CS var42 = (CS)var41.next();
            var40 = true;
            Object var10006 = Registry.emptyArgs();
            long var25 = 522169852020904082L;
            Object var24 = var10006;
            var10006 = Ref.h(522169852020904082L, var24, var25);

            try {
               var63 = (Integer)var10006;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            var3.append(var39.substring((int)var42, var63));
            String var56 = (String)(Registry.emptyArgs());
            long var27 = 197983092181873471L;
            Object var26 = var56;
            var56 = Ref.h(197983092181873471L, var26, var27);

            try {
               var56 = (String)var56;
            } catch (InvocationTargetException var31) {
               throw var31.getTargetException();
            }

            var42.append((String)var56);
            var56 = Registry.emptyArgs();
            long var29 = 537962425760684299L;
            Object var28 = var56;
            var56 = Ref.h(537962425760684299L, var28, var29);

            try {
               var61 = (Integer)var56;
            } catch (InvocationTargetException var30) {
               throw var30.getTargetException();
            }

            var39 = var61;
            if (var2 != null) {
               break;
            }

            if (var2 == null) {
               continue;
            }
         }

         if (!var40) {
            var5.append(var3);
            if (var2 == null) {
               return var5.toString();
            }
         }
         break;
      }

      var5.append(var3.substring(var39));
      return var5.toString();
   }

   public boolean o() {
      return Registry.lookupField(350290802122508960L).getBoolean(this);
   }

   public void f(boolean var1) {
      Registry.lookupField(350290802122508960L).setBoolean(this, var1);
   }

   @Override
   public Ln4_2 B() {
      return null;
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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
            Registry.lookupField(216182060077896093L).setInt(null, (int)var5);
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
               Registry.lookupField(216182060077896093L).setInt(null, (int)var0);
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





