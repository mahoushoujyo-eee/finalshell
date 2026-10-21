package com.finalshell.ui.model;

import com.finalshell.core.Km2;
import com.finalshell.core.Zv2_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kl4 extends Pl2 {
   public String[] a;
   public ArrayList s;
   public Tf4 E;
   public boolean u;
   public boolean Z;
   public boolean R;
   public int J;
   public Zv2_2 y;
   public static String W;
   public static String V;
   public static String H;
   public static String w;
   public static String e;
   public static String A;
   public static long c;

   public Kl4(boolean var1) {
      ArrayList var10001 = new ArrayList();
      long var4 = 322872004937477371L;
      ArrayList var3 = var10001;
      Ref.s(322872004937477371L, var3, var4);
      Registry.lookupField(603912005139022520L).setBoolean(this, true);
      String var9 = Km2.U$String();
      Registry.lookupField(303009118485182147L).setBoolean(this, false);
      Registry.lookupField(176435474080073820L).setBoolean(this, true);
      String var2 = var9;
      int var10002 = (var1) ? 1 : 0;
      if (var2 == null) {
         Registry.lookupField(603912005139022520L).setBoolean(this, (boolean)var1);
         if (var1) {
            String[] var10 = new String[]{
               (String)Registry.lookupField(120798900280429031L).get(null),
               (String)Registry.lookupField(255728535682922342L).get(null),
               (String)Registry.lookupField(163942508468345506L).get(null),
               (String)Registry.lookupField(186089693526780221L).get(null)
            };
            long var6 = 222207838991232685L;
            String[] var5 = var10;
            Ref.s(222207838991232685L, var5, var6);
            if (var2 == null) {
               return;
            }
         }

         var10002 = (int)c;
      }

      String[] var11 = new String[var10002];
      var11[0] = (String)Registry.lookupField(120798900280429031L).get(null);
      var11[1] = (String)Registry.lookupField(255728535682922342L).get(null);
      var11[2] = (String)Registry.lookupField(163942508468345506L).get(null);
      var11[3] = (String)Registry.lookupField(186089693526780221L).get(null);
      var11[4] = (String)Registry.lookupField(132517039764639145L).get(null);
      var11[5] = (String)Registry.lookupField(505372407712304708L).get(null);
      long var8 = 222207838991232685L;
      String[] var7 = var11;
      Ref.s(222207838991232685L, var7, var8);
   }

   @Override
   public String z(int var1) {
      Object var2 = 222207838991232685L;
      return ((String[])Ref.g(222207838991232685L, var2))[var1];
   }

   public void O(Tf4 var1) {
      Object[] var23;
      Boolean var55;
      Km2.U$String();
      long var8 = 447286965202672841L;
      Ref.s(447286965202672841L, var1, var8);
      Kl4 var2 = this;
      Object var9 = 322872004937477371L;
      ((ArrayList)Ref.g(322872004937477371L, var9)).clear();
      Object var10003 = Registry.emptyArgs();
      long var12 = 490764181082108623L;
      Object var11 = var10003;
      var10003 = Ref.h(490764181082108623L, var11, var12);

      try {
         var55 = (Boolean)var10003;
      } catch (InvocationTargetException var50) {
         throw var50.getTargetException();
      }

      label173: {
         if (this == null) {
            if (var55 == 0) {
               Object var13 = 322872004937477371L;
               ArrayList var10004 = (ArrayList)Ref.g(322872004937477371L, var13);
               List var10006 = (List)(Registry.emptyArgs());
               long var16 = 369380169373911815L;
               Object var15 = var10006;
               var10006 = Ref.h(369380169373911815L, var15, var16);

               try {
                  var10006 = (List)var10006;
               } catch (InvocationTargetException var49) {
                  throw var49.getTargetException();
               }

               var1.addAll(var10006);
               Object var17 = 322872004937477371L;
               ArrayList var62 = (ArrayList)Ref.g(322872004937477371L, var17);
               List var10008 = (List)(Registry.emptyArgs());
               long var20 = 248698316749304686L;
               Object var19 = var10008;
               var10008 = Ref.h(248698316749304686L, var19, var20);

               try {
                  var10008 = (List)var10008;
               } catch (InvocationTargetException var48) {
                  throw var48.getTargetException();
               }

               var1.addAll(var10008);
               if (this == null) {
                  break label173;
               }
            }

            var55 = (Boolean)(Registry.lookupField(234889186655774911L).getInt(this));
         }

         label175: {
            if (this == null) {
               if (var55 == Registry.lookupField(243490669497898236L).getInt(null)) {
                  break label175;
               }

               Object var21 = 322872004937477371L;
               ArrayList var56 = (ArrayList)Ref.g(322872004937477371L, var21);
               List var63 = (List)(Registry.emptyArgs());
               long var24 = 369380169373911815L;
               var23 = var63;
               var63 = Ref.h(369380169373911815L, var23, var24);

               try {
                  var63 = (List)var63;
               } catch (InvocationTargetException var47) {
                  throw var47.getTargetException();
               }

               var1.addAll(var63);
            }

            List var57 = (List)(Registry.emptyArgs());
            long var26 = 248698316749304686L;
            Object var25 = var57;
            var57 = Ref.h(248698316749304686L, var25, var26);

            try {
               var57 = (List)var57;
            } catch (InvocationTargetException var46) {
               throw var46.getTargetException();
            }

            label153: {
               List var3 = var57;
               if (this == null) {
                  Object var27 = 357165895689944471L;
                  if ((Zv2_2)Ref.g(357165895689944471L, var27) != null) {
                     for (Ck4 var5 : var3) {
                        Object var29 = 357165895689944471L;
                        Ref.g(357165895689944471L, var29);
                        Object var10007 = Registry.packArgs(var5);
                        long var32 = 446207516786344140L;
                        Object var31 = var10007;
                        var10007 = Ref.h(446207516786344140L, var31, var32);

                        try {
                           var70 = (Boolean)var10007;
                        } catch (InvocationTargetException var45) {
                           throw var45.getTargetException();
                        }

                        boolean var6 = var70;
                        if (var2 != null) {
                           break label153;
                        }

                        if (var2 == null && var6) {
                           Object var33 = 322872004937477371L;
                           ((ArrayList)Ref.g(322872004937477371L, var33)).add(var5);
                        }

                        if (var2 != null) {
                           break;
                        }
                     }

                     if (var2 == null) {
                        break label153;
                     }
                  }
               }

               Object var35 = 322872004937477371L;
               ((ArrayList)Ref.g(322872004937477371L, var35)).addAll(var3);
            }

            if (var2 == null) {
               break label173;
            }
         }

         List var66 = (List)(Registry.emptyArgs());
         long var38 = 369380169373911815L;
         Object var37 = var66;
         var66 = Ref.h(369380169373911815L, var37, var38);

         try {
            var66 = (List)var66;
         } catch (InvocationTargetException var44) {
            throw var44.getTargetException();
         }

         for (Tf4 var52 : var66) {
            File var71 = (File)(Registry.emptyArgs());
            long var40 = 543633160597441792L;
            Object var39 = var71;
            var71 = Ref.h(543633160597441792L, var39, var40);

            try {
               var71 = (File)var71;
            } catch (InvocationTargetException var43) {
               throw var43.getTargetException();
            }

            File var53 = var71;
            if (var2 != null) {
               return;
            }

            label180: {
               boolean var74 = var53.isDirectory();
               if (var2 == null) {
                  if (!var74) {
                     break label180;
                  }

                  var74 = var53.isFile();
               }

               if (var2 == null) {
                  if (var74) {
                     break label180;
                  }

                  var74 = var53.exists();
               }

               if (var2 == null && var74) {
                  Object var41 = 322872004937477371L;
                  ((ArrayList)Ref.g(322872004937477371L, var41)).add(var52);
               }
            }

            if (var2 != null) {
               break;
            }
         }
      }

      this.fireTableDataChanged();
   }

   public int b(String var1) {
      int var3 = -1;
      int var4 = 0;
      Km2.U$String();
      Object var9 = 322872004937477371L;
      Iterator var5 = ((ArrayList)Ref.g(322872004937477371L, var9)).iterator();
      Kl4 var2 = this;

      int var10001;
      while (true) {
         label63:
         if (var5.hasNext()) {
            Object var6 = var5.next();
            String var7 = null;
            var10001 = (var6.getClass().equals(Tf4.class)) ? 1 : 0;
            if (var2 != null) {
               break;
            }

            label70: {
               label71: {
                  if (var2 == null) {
                     if (var10001 != 0) {
                        Tf4 var17 = (Tf4)var6;
                        String var22 = (String)(Registry.emptyArgs());
                        long var12 = 498856411508641826L;
                        Object var11 = var22;
                        var22 = Ref.h(498856411508641826L, var11, var12);

                        try {
                           var22 = (String)var22;
                        } catch (InvocationTargetException var16) {
                           throw var16.getTargetException();
                        }

                        var7 = var22;
                        break label70;
                     }

                     var18 = var6.getClass();
                     if (var2 != null) {
                        break label71;
                     }

                     var10001 = var18.equals(Ck4.class);
                  }

                  if (var10001 == 0) {
      long var18;
                     break label70;
                  }

                  var18 = var6;
               }

               Ck4 var8 = (Ck4)var18;
               Object var10002 = Registry.emptyArgs();
               long var14 = 605430732347023634L;
               Object var13 = var10002;
               var10002 = Ref.h(605430732347023634L, var13, var14);

               try {
                  var10002 = (String)var10002;
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               var7 = (String)(var10002);
            }

            label48: {
               var10001 = (int)(var7.equals(var1));
               if (var2 == null) {
                  if (var10001 == 0) {
                     break label48;
                  }

                  var10001 = var4;
               }

               var3 = var10001;
               if (var2 == null) {
                  break label63;
               }
            }

            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var10001 = var3;
         break;
      }

      return var10001;
   }

   public void y() {
      Registry.lookupField(303009118485182147L).setBoolean(this, true);
   }

   public void I(Ck4 var1) {
      Object var2 = 322872004937477371L;
      ((ArrayList)Ref.g(322872004937477371L, var2)).add(var1);
      Object var4 = 322872004937477371L;
      int var10003 = ((ArrayList)Ref.g(322872004937477371L, var4)).size();
      Object var6 = 322872004937477371L;
      var10003.fireTableRowsInserted((int)this, ((ArrayList)Ref.g(322872004937477371L, var6)).size());
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      String var3 = Km2.U$String();
      int var10000 = Registry.lookupField(176435474080073820L).getBoolean(this);
      if (var3 == null) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = var2;
      }

      if (var3 == null) {
         if (var10000 == 0) {
            boolean var4 = Registry.lookupField(303009118485182147L).getBoolean(this);
            if (var3 != null) {
               return var4;
            }

            if (var4) {
               Registry.lookupField(303009118485182147L).setBoolean(this, false);
               return true;
            }
         }

         var10000 = 0;
      }

      return (var10000 != 0);
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      super.setValueAt(var1, var2, var3);
   }

   @Override
   public int getRowCount() {
      Object var1 = 322872004937477371L;
      return ((ArrayList)Ref.g(322872004937477371L, var1)).size();
   }

   @Override
   public int getColumnCount() {
      Object var1 = 222207838991232685L;
      return ((String[])Ref.g(222207838991232685L, var1)).length;
   }

   public Object G(int var1) {
      if (var1 > -1) {
         Object var2 = 322872004937477371L;
         return ((ArrayList)Ref.g(322872004937477371L, var2)).get(var1);
      } else {
         return null;
      }
   }

   public void w(Object var1) {
      Object var2 = 322872004937477371L;
      ((ArrayList)Ref.g(322872004937477371L, var2)).remove(var1);
   }

   public void m(int var1) {
      String var10000 = Km2.U$String();
      int var3 = 0;
      String var2 = var10000;

      do {
         Object var4 = 222207838991232685L;
         if (!(0 < ((String[])Ref.g(222207838991232685L, var4)).length)) {
            break;
         }

         this.fireTableCellUpdated(var1, var3);
         var3++;
      } while (var2 == null);
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      Object var4 = 322872004937477371L;
      return ((ArrayList)Ref.g(322872004937477371L, var4)).get(var1);
   }

   @Override
   public String getColumnName(int var1) {
      Object var2 = 222207838991232685L;
      return ((String[])Ref.g(222207838991232685L, var2))[var1];
   }

   public Tf4 V$tf_4() {
      Object var1 = 447286965202672841L;
      return (Tf4)Ref.g(447286965202672841L, var1);
   }

   public void s(Tf4 var1) {
      long var3 = 447286965202672841L;
      Ref.s(447286965202672841L, var1, var3);
   }

   public int V$int() {
      return Registry.lookupField(234889186655774911L).getInt(this);
   }

   public void E(int var1) {
      Registry.lookupField(234889186655774911L).setInt(this, var1);
   }

   public boolean o() {
      return Registry.lookupField(176435474080073820L).getBoolean(this);
   }

   public void Q(boolean var1) {
      Registry.lookupField(176435474080073820L).setBoolean(this, var1);
   }

   public Zv2_2 w() {
      Object var1 = 357165895689944471L;
      return (Zv2_2)Ref.g(357165895689944471L, var1);
   }

   public void C(Zv2_2 var1) {
      long var3 = 357165895689944471L;
      Ref.s(357165895689944471L, var1, var3);
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var23;
      String[] var2 = new String[6];
      int var6 = 0;
      String var5 = "奇尖\u0004侎攠斣閬\u0006畈戮z異戰绗\u0002簛垒";
      int var7 = "奇尖\u0004侎攠斣閬\u0006畈戮z異戰绗\u0002簛垒".length();
      char var4 = 2;
      int var10 = -1;

      label53:
      while (true) {
         byte var10000 = 118;
         String var10001 = var5.substring(++var10, var10 + var4);
         byte var10002 = -1;

         while (true) {
            label48: {
               char[] var28 = var10001.toCharArray();
               int var10004 = var28.length;
               int var8 = 0;
               byte var31 = var10000;
               var23 = var28;
               int var16 = var10004;
               byte var36;
               char[] var40;
               int var10006;
               if (var10004 <= 1) {
                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               } else {
                  var31 = var10000;
                  var16 = var10004;
                  if (var10004 <= var8) {
                     break label48;
                  }

                  var40 = var28;
                  var36 = var10000;
                  var10006 = var8;
               }

               while (true) {
                  char var49 = var40[var10006];
                  byte var50;
                  switch (var8 % 7) {
                     case 0:
                        var50 = 22;
                        break;
                     case 1:
                        var50 = 111;
                        break;
                     case 2:
                        var50 = 35;
                        break;
                     case 3:
                        var50 = 46;
                        break;
                     case 4:
                        var50 = 113;
                        break;
                     case 5:
                        var50 = 101;
                        break;
                     default:
                        var50 = 42;
                  }

                  var40[var10006] = (char)(var49 ^ var36 ^ var50);
                  var8++;
                  if (var31 == 0) {
                     var10006 = var31;
                     var40 = var23;
                     var36 = var31;
                  } else {
                     if (var16 <= var8) {
                        break;
                     }

                     var40 = var23;
                     var36 = var31;
                     var10006 = var8;
                  }
               }
            }

            String var33 = new String(var23).intern();
            switch (var10002) {
               case 0:
                  var2[var6++] = var33;
                  if ((var10 += var4) >= var7) {
                     long var0 = 2022834974747855474L;
                     long var27 = -8850058581151249804L ^ var0;
                     byte var18 = -1;
                     c = var27;
                     Registry.lookupField(120798900280429031L).set(null, var2[4]);
                     Registry.lookupField(255728535682922342L).set(null, var2[0]);
                     Registry.lookupField(163942508468345506L).set(null, var2[3]);
                     Registry.lookupField(186089693526780221L).set(null, var2[1]);
                     Registry.lookupField(132517039764639145L).set(null, var2[5]);
                     Registry.lookupField(505372407712304708L).set(null, var2[2]);
                     return;
                  }

                  var4 = var5.charAt(var10);
                  break;
               default:
                  var2[var6++] = var33;
                  if ((var10 += var4) < var7) {
                     var4 = var5.charAt(var10);
                     continue label53;
                  }

                  var5 = "斒亚吭\u0002杖阼";
                  var7 = "斒亚吭\u0002杖阼".length();
                  var4 = 3;
                  var10 = -1;
            }

            var10000 = 3;
            var10001 = var5.substring(++var10, var10 + var4);
            var10002 = 0;
         }
      }
   }
   private static Object var70;
}





