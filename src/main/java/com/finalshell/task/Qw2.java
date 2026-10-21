package com.finalshell.task;

import com.finalshell.core.E0;
import com.finalshell.core.Fv2_2;
import com.finalshell.core.T32;
import com.finalshell.core.Uo2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.CT;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.F8;
import com.finalshell.ui.panel.KA_3;
import java.lang.reflect.InvocationTargetException;

public class Qw2 implements Runnable {
   public final int L;
   public final boolean M;
   public final KA_3 s;
   public static long[] a;
   public static Integer[] b;

   public Qw2(KA_3 var1, int var2, boolean var3) {
      this.s = var1;
      this.L = var2;
      this.M = var3;
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void run() {
      KA_3.y$arrky_4();
      Object var15 = 312999054265392578L;
      Object var10002 = Ref.g(312999054265392578L, var15);
      Object var17 = 221194432122368602L;
      Object var2;
      synchronized (var2 = Ref.g(221194432122368602L, var17)){} // $VF: monitorenter 
      Object var1 = var10002;

      try {
         Registry.emptyArgs();
         long var19 = 270389152141252877L;
         Ref.h2(270389152141252877L, var19);
         Object[] var10004 = Registry.emptyArgs();
         long var22 = 634817973682994708L;
         Object[] var21 = var10004;
         Ref.h(634817973682994708L, var21, var22);
         Object[] var10005 = Registry.emptyArgs();
         long var24 = 240567170779145617L;
         Object[] var23 = var10005;
         Ref.h(240567170779145617L, var23, var24);
         Object[] var10006 = Registry.emptyArgs();
         long var26 = 226341449505323490L;
         Object[] var25 = var10006;
         Ref.h(226341449505323490L, var25, var26);

         try {
            ;
         } catch (InvocationTargetException var77) {
            throw var77.getTargetException();
         }

         ConnectionProperty var10007 = (ConnectionProperty)(Registry.emptyArgs());
         long var28 = 179934491990092343L;
         Object var27 = var10007;
         var10007 = Ref.h(179934491990092343L, var27, var28);

         try {
            var10007 = (ConnectionProperty)var10007;
         } catch (InvocationTargetException var76) {
            throw var76.getTargetException();
         }

         ConnectionProperty var4 = var10007;
         ConnectionProperty var82 = var4;
         if (var1 == null) {
            label297:
            if (var4 == null) {
               F8 var10008 = (F8)(Registry.emptyArgs());
               long var30 = 345201862285199517L;
               Object var29 = var10008;
               var10008 = Ref.h(345201862285199517L, var29, var30);

               try {
                  var10008 = (F8)var10008;
               } catch (InvocationTargetException var75) {
                  throw var75.getTargetException();
               }

               F8 var6 = var10008;
               F8 var86 = var6;
               if (var1 == null) {
                  if (var6 == null) {
                     break label297;
                  }

                  var86 = var6;
               }

               if (var1 == null) {
                  if (!var86.getClass().equals(CT.class)) {
                     break label297;
                  }

                  var86 = var6;
               }

               CT var5 = (CT)var86;
               ConnectionProperty var10009 = (ConnectionProperty)(Registry.emptyArgs());
               long var32 = 398891882190620836L;
               Object var31 = var10009;
               var10009 = Ref.h(398891882190620836L, var31, var32);

               try {
                  var10009 = (ConnectionProperty)var10009;
               } catch (InvocationTargetException var74) {
                  throw var74.getTargetException();
               }

               var4 = var10009;
            }

            var82 = var4;
         }

         ConnectionProperty var79 = var82;
         var10007 = var4;
         label285:
         if (var1 == null) {
            if (var4 != null) {
               ConnectionProperty var7 = var4.N$_y_2();
               var10007 = var7;
               if (var1 != null) {
                  break label285;
               }

               if (var7 != null) {
                  Fv2_2 var8 = var7.s$Fv_2();
                  var10007 = var8;
                  if (var1 != null) {
                     break label285;
                  }

                  if (var8.K()) {
                     int var10012;
                     label307: {
                        label276: {
                           var10007 = this;
                           Object var33 = 312999054265392578L;
                           Registry.lookupField(349489007421858747L)
                              .setInt(Ref.g(312999054265392578L, var33), Registry.lookupField(525666349884219254L).getInt(this));
                           E0 var9 = var7.C$E0();
                           int var87 = Registry.lookupField(525666349884219254L).getInt(this);
                           int var90 = Registry.lookupField(189389645615350517L).getInt(null);
                           if (var1 == null) {
                              if (var87 == var90) {
                                 byte[] var91 = new byte[1];
                                 var10012 = var91[0] = (byte)a(5763, 3690308460118861557L);
                                 var9.J(var91);
                                 if (var1 == null) {
                                    break label276;
                                 }
                              }

                              var87 = Registry.lookupField(525666349884219254L).getInt(this);
                              if (var1 != null) {
                                 break label307;
                              }

                              var90 = Registry.lookupField(149407827136588388L).getInt(null);
                           }

                           if (var87 == var90) {
                              var9.J(new byte[]{(byte)a(3197, 7253195782167591946L)});
                           }
                        }

                        Object var35 = 312999054265392578L;
                        Ref.g(312999054265392578L, var35);
                        Object[] var10010 = Registry.emptyArgs();
                        long var38 = 212415783875365536L;
                        Object[] var37 = var10010;
                        Ref.h(212415783875365536L, var37, var38);

                        try {
                           ;
                        } catch (InvocationTargetException var73) {
                           throw var73.getTargetException();
                        }

                        var4.M$Ty_2();
                        Object[] var10011 = Registry.packArgs(Registry.lookupField(525666349884219254L).getInt(this));
                        long var40 = 183965774767738099L;
                        Object[] var39 = var10011;
                        Ref.h(183965774767738099L, var39, var40);

                        try {
                           ;
                        } catch (InvocationTargetException var72) {
                           throw var72.getTargetException();
                        }

                        Registry.lookupField(388376917454860932L).get(null);
                        Object[] var92 = Registry.packArgs(new TO3(this, var7, var79));
                        long var42 = 434592463220957006L;
                        Object[] var41 = var92;
                        Ref.h(434592463220957006L, var41, var42);

                        try {
                           ;
                        } catch (InvocationTargetException var71) {
                           throw var71.getTargetException();
                        }

                        if (var1 != null) {
                           break label285;
                        }

                        var10012 = (Registry.lookupField(612804121939452712L).getBoolean(this)) ? 1 : 0;
                     }

                     if (var10012 != 0) {
                        Object[] var10013 = Registry.emptyArgs();
                        long var44 = 303756590022481369L;
                        Object[] var43 = var10013;
                        Ref.h(303756590022481369L, var43, var44);
                        var4.a();
                        T32 var10015 = (T32)(Registry.emptyArgs());
                        long var46 = 380415140795833934L;
                        Object var45 = var10015;
                        var10015 = Registry.packArgs(Ref.h(380415140795833934L, var45, var46));
                        long var48 = 259592583851616584L;
                        Object var47 = var10015;
                        var10015 = Ref.h(259592583851616584L, var47, var48);

                        try {
                           var10015 = (T32)var10015;
                        } catch (InvocationTargetException var70) {
                           throw var70.getTargetException();
                        }

                        T32 var10 = var10015;
                        if (var1 != null) {
                           break label285;
                        }

                        label265:
                        if (var10 != null) {
                           Object[] var10016 = Registry.emptyArgs();
                           long var50 = 424156930953488367L;
                           Object[] var49 = var10016;
                           CT var11 = (CT)Ref.h(424156930953488367L, var49, var50);
                           Object[] var10017 = Registry.emptyArgs();
                           long var52 = 171915047529395938L;
                           Object[] var51 = var10017;
                           Ref.h(171915047529395938L, var51, var52);
                           Uo2 var10018 = (Uo2)(Registry.emptyArgs());
                           long var54 = 256841659642290844L;
                           Object var53 = var10018;
                           var10018 = Ref.h(256841659642290844L, var53, var54);

                           try {
                              var10018 = (Uo2)var10018;
                           } catch (InvocationTargetException var69) {
                              throw var69.getTargetException();
                           }

                           Uo2 var12 = var10018;
                           var12.getRowSorter().getSortKeys();
                           Object var10019 = Registry.emptyArgs();
                           long var56 = 364691625525807755L;
                           Object var55 = var10019;
                           var10019 = Ref.h(364691625525807755L, var55, var56);

                           try {
                              var99 = (Integer)var10019;
                           } catch (InvocationTargetException var68) {
                              throw var68.getTargetException();
                           }

                           int var13 = var99;
                           int var100 = Registry.lookupField(525666349884219254L).getInt(this);
                           int var10020 = Registry.lookupField(189389645615350517L).getInt(null);
                           if (var1 == null) {
                              if (var100 == var10020) {
                                 if (var13 == 2) {
                                    break label265;
                                 }

                                 var12.getRowSorter().toggleSortOrder(2);
                                 if (var1 == null) {
                                    break label265;
                                 }
                              }

                              if (var1 != null) {
                                 break label285;
                              }

                              var100 = Registry.lookupField(525666349884219254L).getInt(this);
                              var10020 = Registry.lookupField(149407827136588388L).getInt(null);
                           }

                           if (var100 == var10020 && var13 != 3) {
                              var12.getRowSorter().toggleSortOrder(3);
                           }
                        }
                     }
                  }
               }
            }

            var10007 = (Object[])var2;
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   static {
      __vfClinit__();
   }

   public static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28790;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   public static void __vfClinit__() {
      long var0 = 7375297637567895925L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "ß0V3\u0015\u0003ÿÍ[6ÛÅ\u009avå/";
      int var5 = "ß0V3\u0015\u0003ÿÍ[6ÛÅ\u009avå/".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      a = var6;
      b = new Integer[2];
   }
}





