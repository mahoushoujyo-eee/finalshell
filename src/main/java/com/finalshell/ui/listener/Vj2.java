package com.finalshell.ui.listener;

import com.finalshell.core.KV;
import com.finalshell.core.Lv4_2;
import com.finalshell.core.T32;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.AM;
import com.finalshell.ui.panel.CE;
import com.finalshell.ui.panel.CT;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.NetworkMonitorPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

public class Vj2 implements ActionListener {
   public final NetworkMonitorPanel E;
   public static String a;

   public Vj2(NetworkMonitorPanel var1) {
      this.E = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      String[] var2 = KV.b$arrString();
      Registry.emptyArgs();
      long var11 = 270389152141252877L;
      Ref.h2(270389152141252877L, var11);

      try {
         ;
      } catch (InvocationTargetException var86) {
         throw var86.getTargetException();
      }

      if (var2 == null) {
         Object[] var10002 = Registry.emptyArgs();
         long var14 = 163462326892114024L;
         Object[] var13 = var10002;
         Ref.h(163462326892114024L, var13, var14);
         Object[] var10003 = Registry.emptyArgs();
         long var16 = 633712494917113170L;
         Object[] var15 = var10003;
         var10003 = Ref.h(633712494917113170L, var15, var16);

         try {
            var90 = (Boolean)var10003;
         } catch (InvocationTargetException var85) {
            throw var85.getTargetException();
         }

         if (var90) {
            Object var21 = 232378925560981560L;
            Ref.g(232378925560981560L, var21);
            Object var23 = 377738841635939563L;
            if ((KV)Ref.g(377738841635939563L, var23) != null) {
               Registry.emptyArgs();
               long var25 = 270389152141252877L;
               Ref.h2(270389152141252877L, var25);
               Object[] var10007 = Registry.emptyArgs();
               long var28 = 634817973682994708L;
               Object[] var27 = var10007;
               Ref.h(634817973682994708L, var27, var28);
               Object[] var10008 = Registry.emptyArgs();
               long var30 = 240567170779145617L;
               Object[] var29 = var10008;
               Ref.h(240567170779145617L, var29, var30);
               Object[] var10009 = Registry.emptyArgs();
               long var32 = 226341449505323490L;
               Object[] var31 = var10009;
               var10009 = Ref.h(226341449505323490L, var31, var32);

               try {
                  var10009 = (com.finalshell.ui.frame.U)var10009;
               } catch (InvocationTargetException var82) {
                  throw var82.getTargetException();
               }

               com.finalshell.ui.frame.U var3 = var10009;
               ConnectionProperty var10010 = (ConnectionProperty)(Registry.emptyArgs());
               long var34 = 179934491990092343L;
               Object[] var33 = var10010;
               var10010 = Ref.h(179934491990092343L, var33, var34);

               try {
                  var10010 = (ConnectionProperty)var10010;
               } catch (InvocationTargetException var81) {
                  throw var81.getTargetException();
               }

               ConnectionProperty var4 = var10010;
               if (var3 != null) {
                  Object var35 = 232378925560981560L;
                  Ref.g(232378925560981560L, var35);
                  Object var37 = 392877460517837452L;
                  String var5 = (String)Ref.g(392877460517837452L, var37);
                  if (var5 != null) {
                     Registry.emptyArgs();
                     long var39 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var39);
                     Object[] var10014 = Registry.emptyArgs();
                     long var42 = 410905379772103887L;
                     Object[] var41 = var10014;
                     Ref.h(410905379772103887L, var41, var42);
                     Lv4_2 var10015 = (Lv4_2)(Registry.packArgs(var5));
                     long var44 = 343419559142469673L;
                     Object[] var43 = var10015;
                     var10015 = Ref.h(343419559142469673L, var43, var44);

                     try {
                        var10015 = (Lv4_2)var10015;
                     } catch (InvocationTargetException var80) {
                        throw var80.getTargetException();
                     }

                     Lv4_2 var6 = var10015;
                     if (var6 != null) {
                        AM var10016 = (AM)(Registry.emptyArgs());
                        long var46 = 303756590022481369L;
                        Object[] var45 = var10016;
                        var10016 = Ref.h(303756590022481369L, var45, var46);

                        try {
                           var10016 = (AM)var10016;
                        } catch (InvocationTargetException var79) {
                           throw var79.getTargetException();
                        }

                        AM var7 = var10016;
                        T32 var10017 = (T32)(Registry.packArgs(var5));
                        long var48 = 259592583851616584L;
                        Object[] var47 = var10017;
                        var10017 = Ref.h(259592583851616584L, var47, var48);

                        try {
                           var10017 = (T32)var10017;
                        } catch (InvocationTargetException var78) {
                           throw var78.getTargetException();
                        }

                        label211: {
                           T32 var8 = var10017;
                           if (var2 == null) {
                              if (var8 == null) {
                                 break label211;
                              }

                              Object[] var10018 = Registry.packArgs(var8);
                              long var50 = 176011466134249595L;
                              Object[] var49 = var10018;
                              Ref.h(176011466134249595L, var49, var50);

                              try {
                                 ;
                              } catch (InvocationTargetException var77) {
                                 throw var77.getTargetException();
                              }
                           }

                           if (var2 == null) {
                              return;
                           }
                        }

                        label233: {
                           var10017 = var4;
                           if (var2 == null) {
                              if (var4 != null) {
                                 break label233;
                              }

                              var10017 = var7;
                              Object[] var105 = Registry.emptyArgs();
                              long var52 = 194560825135347400L;
                              Object[] var51 = var105;
                              Ref.h(194560825135347400L, var51, var52);
                              Object[] var10019 = Registry.emptyArgs();
                              long var54 = 424156930953488367L;
                              Object[] var53 = var10019;
                              Ref.h(424156930953488367L, var53, var54);

                              try {
                                 ;
                              } catch (InvocationTargetException var76) {
                                 throw var76.getTargetException();
                              }
                           }

                           Object var9 = var10017;
                           var10017 = (Object[])var9;
                           if (var2 == null) {
                              if (var9 == null) {
                                 break label233;
                              }

                              var10017 = (Object[])var9;
                           }

                           label235: {
                              boolean var103 = var10017.getClass().equals(CT.class);
                              if (var2 == null) {
                                 if (var103) {
                                    CT var10 = (CT)var9;
                                    ConnectionProperty var106 = (ConnectionProperty)(Registry.emptyArgs());
                                    long var56 = 398891882190620836L;
                                    Object[] var55 = var106;
                                    var106 = Ref.h(398891882190620836L, var55, var56);

                                    try {
                                       var106 = (ConnectionProperty)var106;
                                    } catch (InvocationTargetException var75) {
                                       throw var75.getTargetException();
                                    }

                                    var4 = var106;
                                    if (var2 == null) {
                                       break label233;
                                    }
                                 }

                                 var10017 = (Object[])var9;
                                 if (var2 != null) {
                                    break label235;
                                 }

                                 var103 = var9.getClass().equals(CE.class);
                              }

                              if (!var103) {
                                 break label233;
                              }

                              var10017 = (Object[])var9;
                           }

                           CE var87 = (CE)var10017;
                           ConnectionProperty var109 = (ConnectionProperty)(Registry.emptyArgs());
                           long var58 = 595556246051364370L;
                           Object[] var57 = var109;
                           var109 = Ref.h(595556246051364370L, var57, var58);

                           try {
                              var109 = (ConnectionProperty)var109;
                           } catch (InvocationTargetException var74) {
                              throw var74.getTargetException();
                           }

                           var4 = var109;
                        }

                        Object[] var112 = Registry.packArgs(var4);
                        long var60 = 546054476699535938L;
                        Object[] var59 = var112;
                        Ref.h(546054476699535938L, var59, var60);

                        try {
                           ;
                        } catch (InvocationTargetException var73) {
                           throw var73.getTargetException();
                        }

                        Object[] var113 = Registry.emptyArgs();
                        long var62 = 544029910883356329L;
                        Object[] var61 = var113;
                        Ref.h(544029910883356329L, var61, var62);

                        try {
                           ;
                        } catch (InvocationTargetException var72) {
                           throw var72.getTargetException();
                        }

                        new StringBuilder().append(a);
                        String var10022 = (String)(Registry.emptyArgs());
                        long var64 = 286931176286176762L;
                        Object[] var63 = var10022;
                        var10022 = Ref.h(286931176286176762L, var63, var64);

                        try {
                           var10022 = (String)var10022;
                        } catch (InvocationTargetException var71) {
                           throw var71.getTargetException();
                        }

                        Object[] var10021 = Registry.packArgs(var6.append((String)var10022).toString());
                        long var66 = 519460332647460288L;
                        Object[] var65 = var10021;
                        Ref.h(519460332647460288L, var65, var66);

                        try {
                           ;
                        } catch (InvocationTargetException var70) {
                           throw var70.getTargetException();
                        }

                        var10022 = Registry.emptyArgs();
                        long var68 = 176235325809488947L;
                        Object[] var67 = var10022;
                        Ref.h(176235325809488947L, var67, var68);

                        try {
                           ;
                        } catch (InvocationTargetException var69) {
                           throw var69.getTargetException();
                        }
                     }
                  }
               }
            }

            return;
         }

         Registry.emptyArgs();
         long var17 = 270389152141252877L;
         Ref.h2(270389152141252877L, var17);

         try {
            ;
         } catch (InvocationTargetException var84) {
            throw var84.getTargetException();
         }
      }

      Object[] var88 = Registry.emptyArgs();
      long var20 = 248890456776257543L;
      Object[] var19 = var88;
      Ref.h(248890456776257543L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var83) {
         throw var83.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var10003 = "辜稯1".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 105;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      } else {
         var6 = 105;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 105;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 46;
               break;
            case 1:
               var23 = 77;
               break;
            case 2:
               var23 = 117;
               break;
            case 3:
               var23 = 85;
               break;
            case 4:
               var23 = 78;
               break;
            case 5:
               var23 = 86;
               break;
            default:
               var23 = 92;
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





