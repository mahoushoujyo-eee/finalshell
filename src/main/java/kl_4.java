import com.Pl_2;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class kl_4 extends Pl_2 {
   String[] a;
   private ArrayList s;
   tf_4 E;
   boolean u;
   boolean Z;
   boolean R;
   int J;
   zv_2 y;
   public static String W;
   public static String V;
   public static String H;
   public static String w;
   public static String e;
   public static String A;
   private static final long c;

   public kl_4(boolean var1) {
      com.c.c(322872004937477371L).set(this, new ArrayList());
      com.c.c(603912005139022520L).setBoolean(this, true);
      String var10000 = Km_2.U();
      com.c.c(303009118485182147L).setBoolean(this, false);
      com.c.c(176435474080073820L).setBoolean(this, true);
      String var2 = var10000;
      kl_4 var3 = this;
      int var10001 = var1;
      if (var2 == null) {
         com.c.c(603912005139022520L).setBoolean(this, (boolean)var1);
         if (var1 != 0) {
            com.c.c(222207838991232685L)
               .set(
                  this,
                  new String[]{
                     (String)com.c.c(120798900280429031L).get(null),
                     (String)com.c.c(255728535682922342L).get(null),
                     (String)com.c.c(163942508468345506L).get(null),
                     (String)com.c.c(186089693526780221L).get(null)
                  }
               );
            if (var2 == null) {
               return;
            }
         }

         var3 = this;
         var10001 = (int)c;
      }

      String[] var4 = new String[var10001];
      var4[0] = (String)com.c.c(120798900280429031L).get(null);
      var4[1] = (String)com.c.c(255728535682922342L).get(null);
      var4[2] = (String)com.c.c(163942508468345506L).get(null);
      var4[3] = (String)com.c.c(186089693526780221L).get(null);
      var4[4] = (String)com.c.c(132517039764639145L).get(null);
      var4[5] = (String)com.c.c(505372407712304708L).get(null);
      com.c.c(222207838991232685L).set(var3, var4);
   }

   @Override
   public String z(int var1) {
      return ((String[])com.c.c(222207838991232685L).get(this))[var1];
   }

   public void O(tf_4 var1) {
      String var10000 = Km_2.U();
      com.c.c(447286965202672841L).set(this, var1);
      String var2 = var10000;
      ((ArrayList)com.c.c(322872004937477371L).get(this)).clear();
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(490764181082108623L);
      Object[] var10002 = var10001;
      tf_4 var34 = var1;
      Method var18 = var10003;

      try {
         var19 = (Boolean)var18.invoke(var34, var10002);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      label173: {
         if (var2 == null) {
            if (var19 == 0) {
               ArrayList var20 = (ArrayList)com.c.c(322872004937477371L).get(this);
               var10002 = com.c.f();
               Method var10004 = com.c.d(369380169373911815L);
               Object[] var59 = var10002;
               tf_4 var50 = var1;
               Method var35 = var10004;

               try {
                  var10001 = (List)var35.invoke(var50, var59);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               var20.addAll(var10001);
               ArrayList var21 = (ArrayList)com.c.c(322872004937477371L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(248698316749304686L);
               Object[] var60 = var10002;
               tf_4 var52 = var1;
               Method var37 = var10004;

               try {
                  var10001 = (List)var37.invoke(var52, var60);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               var21.addAll(var10001);
               if (var2 == null) {
                  break label173;
               }
            }

            var19 = com.c.c(234889186655774911L).getInt(this);
         }

         label175: {
            if (var2 == null) {
               if (var19 == com.c.c(243490669497898236L).getInt(null)) {
                  break label175;
               }

               ArrayList var22 = (ArrayList)com.c.c(322872004937477371L).get(this);
               var10002 = com.c.f();
               Method var67 = com.c.d(369380169373911815L);
               Object[] var61 = var10002;
               tf_4 var54 = var1;
               Method var39 = var67;

               try {
                  var10001 = (List)var39.invoke(var54, var61);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }

               var22.addAll(var10001);
            }

            var10001 = com.c.f();
            var10003 = com.c.d(248698316749304686L);
            var10002 = var10001;
            tf_4 var42 = var1;
            Method var23 = var10003;

            try {
               var24 = (List)var23.invoke(var42, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }

            label153: {
               List var3 = var24;
               kl_4 var25 = this;
               if (var2 == null) {
                  if ((zv_2)com.c.c(357165895689944471L).get(this) != null) {
                     for (ck_4 var5 : var3) {
                        var10000 = (String)com.c.c(357165895689944471L).get(this);
                        var10001 = com.c.a(var5);
                        var10003 = com.c.d(446207516786344140L);
                        var10002 = var10001;
                        var10001 = var10000;
                        Method var27 = var10003;

                        try {
                           var28 = (Boolean)var27.invoke(var10001, var10002);
                        } catch (InvocationTargetException var9) {
                           throw var9.getTargetException();
                        }

                        boolean var6 = var28;
                        if (var2 != null) {
                           break label153;
                        }

                        if (var2 == null && var6) {
                           ((ArrayList)com.c.c(322872004937477371L).get(this)).add(var5);
                        }

                        if (var2 != null) {
                           break;
                        }
                     }

                     if (var2 == null) {
                        break label153;
                     }
                  }

                  var25 = this;
               }

               ((ArrayList)com.c.c(322872004937477371L).get(var25)).addAll(var3);
            }

            if (var2 == null) {
               break label173;
            }
         }

         var10001 = com.c.f();
         var10003 = com.c.d(369380169373911815L);
         var10002 = var10001;
         tf_4 var46 = var1;
         Method var29 = var10003;

         try {
            var30 = (List)var29.invoke(var46, var10002);
         } catch (InvocationTargetException var8) {
            throw var8.getTargetException();
         }

         for (tf_4 var16 : var30) {
            var10001 = com.c.f();
            var10003 = com.c.d(543633160597441792L);
            var10002 = var10001;
            tf_4 var48 = var16;
            Method var31 = var10003;

            try {
               var32 = (File)var31.invoke(var48, var10002);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            File var17 = var32;
            if (var2 != null) {
               return;
            }

            label180: {
               boolean var33 = var17.isDirectory();
               if (var2 == null) {
                  if (!var33) {
                     break label180;
                  }

                  var33 = var17.isFile();
               }

               if (var2 == null) {
                  if (var33) {
                     break label180;
                  }

                  var33 = var17.exists();
               }

               if (var2 == null && var33) {
                  ((ArrayList)com.c.c(322872004937477371L).get(this)).add(var16);
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
      String var10000 = Km_2.U();
      Iterator var5 = ((ArrayList)com.c.c(322872004937477371L).get(this)).iterator();
      String var2 = var10000;

      while (true) {
         label63:
         if (var5.hasNext()) {
            Object var6 = var5.next();
            String var7 = null;
            var12 = var6.getClass().equals(tf_4.class);
            if (var2 != null) {
               break;
            }

            label70: {
               label71: {
                  if (var2 == null) {
                     if (var12 != 0) {
                        tf_4 var11 = (tf_4)var6;
                        Object[] var20 = com.c.f();
                        Method var23 = com.c.d(498856411508641826L);
                        Object[] var22 = var20;
                        tf_4 var21 = var11;
                        Method var16 = var23;

                        try {
                           var10000 = (String)var16.invoke(var21, var22);
                        } catch (InvocationTargetException var10) {
                           throw var10.getTargetException();
                        }

                        var7 = var10000;
                        break label70;
                     }

                     var10000 = var6.getClass();
                     if (var2 != null) {
                        break label71;
                     }

                     var12 = var10000.equals(ck_4.class);
                  }

                  if (var12 == 0) {
                     break label70;
                  }

                  var10000 = (String)var6;
               }

               ck_4 var8 = (ck_4)var10000;
               Object[] var10001 = com.c.f();
               Method var10003 = com.c.d(605430732347023634L);
               Object[] var10002 = var10001;
               ck_4 var19 = var8;
               Method var14 = var10003;

               try {
                  var10000 = (String)var14.invoke(var19, var10002);
               } catch (InvocationTargetException var9) {
                  throw var9.getTargetException();
               }

               var7 = var10000;
            }

            label48: {
               int var18 = var7.equals(var1);
               if (var2 == null) {
                  if (var18 == 0) {
                     break label48;
                  }

                  var18 = var4;
               }

               var3 = var18;
               if (var2 == null) {
                  break label63;
               }
            }

            var4++;
            if (var2 == null) {
               continue;
            }
         }

         var12 = var3;
         break;
      }

      return var12;
   }

   public void y() {
      com.c.c(303009118485182147L).setBoolean(this, true);
   }

   public void I(ck_4 var1) {
      ((ArrayList)com.c.c(322872004937477371L).get(this)).add(var1);
      this.fireTableRowsInserted(((ArrayList)com.c.c(322872004937477371L).get(this)).size(), ((ArrayList)com.c.c(322872004937477371L).get(this)).size());
   }

   @Override
   public boolean isCellEditable(int var1, int var2) {
      String var3 = Km_2.U();
      int var10000 = com.c.c(176435474080073820L).getBoolean(this);
      if (var3 == null) {
         if (var10000 == 0) {
            return false;
         }

         var10000 = var2;
      }

      if (var3 == null) {
         if (var10000 == 0) {
            boolean var4 = com.c.c(303009118485182147L).getBoolean(this);
            if (var3 != null) {
               return var4;
            }

            if (var4) {
               com.c.c(303009118485182147L).setBoolean(this, false);
               return true;
            }
         }

         var10000 = 0;
      }

      return (boolean)var10000;
   }

   @Override
   public void setValueAt(Object var1, int var2, int var3) {
      super.setValueAt(var1, var2, var3);
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(322872004937477371L).get(this)).size();
   }

   @Override
   public int getColumnCount() {
      return ((String[])com.c.c(222207838991232685L).get(this)).length;
   }

   public Object G(int var1) {
      return var1 > -1 ? ((ArrayList)com.c.c(322872004937477371L).get(this)).get(var1) : null;
   }

   public void w(Object var1) {
      ((ArrayList)com.c.c(322872004937477371L).get(this)).remove(var1);
   }

   public void m(int var1) {
      String var10000 = Km_2.U();
      int var3 = 0;
      String var2 = var10000;

      while (var3 < ((String[])com.c.c(222207838991232685L).get(this)).length) {
         this.fireTableCellUpdated(var1, var3);
         var3++;
         if (var2 != null) {
            break;
         }
      }
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return ((ArrayList)com.c.c(322872004937477371L).get(this)).get(var1);
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(222207838991232685L).get(this))[var1];
   }

   public tf_4 V() {
      return (tf_4)com.c.c(447286965202672841L).get(this);
   }

   public void s(tf_4 var1) {
      com.c.c(447286965202672841L).set(this, var1);
   }

   public int V$int() {
      return com.c.c(234889186655774911L).getInt(this);
   }

   public void E(int var1) {
      com.c.c(234889186655774911L).setInt(this, var1);
   }

   public boolean o() {
      return com.c.c(176435474080073820L).getBoolean(this);
   }

   public void Q(boolean var1) {
      com.c.c(176435474080073820L).setBoolean(this, var1);
   }

   public zv_2 w() {
      return (zv_2)com.c.c(357165895689944471L).get(this);
   }

   public void C(zv_2 var1) {
      com.c.c(357165895689944471L).set(this, var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
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
                     com.c.c(120798900280429031L).set(null, var2[4]);
                     com.c.c(255728535682922342L).set(null, var2[0]);
                     com.c.c(163942508468345506L).set(null, var2[3]);
                     com.c.c(186089693526780221L).set(null, var2[1]);
                     com.c.c(132517039764639145L).set(null, var2[5]);
                     com.c.c(505372407712304708L).set(null, var2[2]);
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
}





