package com.finalshell.ui.dialog;

import com.finalshell.core.Bo4;
import com.finalshell.core.Connect_2;
import com.finalshell.core.Dv2;
import com.finalshell.core.Dx4_2;
import com.finalshell.core.KV;
import com.finalshell.core.L1;
import com.finalshell.core.Tq4;
import com.finalshell.core.Ty2;
import com.finalshell.core.Y12_2;
import com.finalshell.core.ZX_2;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.DY;
import com.finalshell.task.N5;
import com.finalshell.task.NZ;
import com.finalshell.task.Tp2;
import com.finalshell.ui.listener.G;
import com.finalshell.ui.listener.Gd2;
import com.finalshell.ui.listener.UB3;
import com.finalshell.ui.panel.CompleteFullPathPanel;
import com.finalshell.ui.panel.ConnectionProperty;
import com.finalshell.ui.panel.Ky4;
import com.finalshell.ui.panel.SetBackgroundImagePanel;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import org.jdesktop.swingx.JXList;

public class Backspace extends ClearListDialog {
   public SetBackgroundImagePanel h6;
   public long hp;
   public boolean hv;
   public String hY;
   public int ht;
   public int ho;
   public int hM;
   public String hn;
   public int he;
   public JButton hR;
   public int hc;
   public boolean h_;
   public JLabel hT;
   public long hz;
   public boolean hE;
   public JLabel hJ;
   public String hl;
   public String hV;
   public boolean hB;
   public static int hy;
   public static int h8;
   public static int hu;
   public int hC;
   public static String[] hU;
   public static String[] cb;
   public static String[] db;
   public static long[] gb;
   public static Integer[] hb;

   public Backspace(SetBackgroundImagePanel var1, Ff2 var2, Dv2 var3) {
      super(var3, true, true, false, false, true, false);
      Registry.lookupField(255113142618897746L).setBoolean(this, false);
      long var8 = 449876613200166173L;
      String var7 = "";
      Ref.s(449876613200166173L, var7, var8);
      Registry.lookupField(400778857057715665L).setInt(this, -1);
      Registry.lookupField(312620352076276408L).setInt(this, -1);
      Registry.lookupField(509191499826884596L).setBoolean(this, false);
      Registry.lookupField(177945602361155986L).setBoolean(this, false);
      Registry.lookupField(532893860934733004L).setBoolean(this, false);
      Registry.lookupField(274525916063193125L).setInt(this, Registry.lookupField(523789155715726667L).getInt(null));
      Object[] var10002 = Registry.packArgs(true);
      long var10 = 201951154955530128L;
      Object[] var9 = var10002;
      Ref.h(201951154955530128L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var73) {
         throw var73.getTargetException();
      }

      Object[] var10003 = Registry.packArgs(false);
      long var12 = 464995000560394494L;
      Object[] var11 = var10003;
      Ref.h(464995000560394494L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }

      Object[] var10004 = Registry.packArgs(b(13222, 6051884349919138237L), b(26895, 6542378377919449875L));
      long var14 = 620992058944098515L;
      Object[] var13 = var10004;
      Ref.h(620992058944098515L, var13, var14);

      try {
         ;
      } catch (InvocationTargetException var71) {
         throw var71.getTargetException();
      }

      Object[] var10005 = Registry.packArgs(true);
      long var16 = 135780246329389131L;
      Object[] var15 = var10005;
      Ref.h(135780246329389131L, var15, var16);

      try {
         ;
      } catch (InvocationTargetException var70) {
         throw var70.getTargetException();
      }

      Object[] var10006 = Registry.packArgs(true);
      long var18 = 487548648625645288L;
      Object[] var17 = var10006;
      Ref.h(487548648625645288L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var69) {
         throw var69.getTargetException();
      }

      Object[] var10008 = Registry.emptyArgs();
      long var20 = 528097716224989553L;
      Object[] var19 = var10008;
      var10008 = Ref.h(528097716224989553L, var19, var20);
      long var22 = 316737507384357237L;
      Object var21 = var10008;
      Ref.s(316737507384357237L, var21, var22);
      Object var23 = 316737507384357237L;
      ((JButton)Ref.g(316737507384357237L, var23)).addActionListener(new Gd2(this));
      CompleteFullPathPanel var5 = new CompleteFullPathPanel(this);
      F();
      Y12_2 var10011;
      Object var25 = 316737507384357237L;
      super((JButton)Ref.g(316737507384357237L, var25), var5);
      Y12_2 var6 = var10011;
      Object var27 = 316737507384357237L;
      ((JButton)Ref.g(316737507384357237L, var27)).addMouseListener(new G(this, var6, var5));
      SwingUtilities.invokeLater(new NZ(this));
      long var30 = 529421273455029847L;
      Ref.s(529421273455029847L, var1, var30);
      Object[] var10014 = Registry.packArgs(false);
      long var32 = 482653304504628027L;
      Object[] var31 = var10014;
      Ref.h(482653304504628027L, var31, var32);

      try {
         ;
      } catch (InvocationTargetException var68) {
         throw var68.getTargetException();
      }

      Object var33 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var33)).setFocusTraversalKeysEnabled(false);
      this.setFocusTraversalKeysEnabled(false);
      Object var35 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var35)).addKeyListener(new UB3(this, var1));
      JLabel var10016 = new JLabel(b(-6462, 6583));
      long var38 = 201390987714459017L;
      JLabel var37 = var10016;
      Ref.s(201390987714459017L, var37, var38);
      Object var39 = 201390987714459017L;
      JLabel var10017 = (JLabel)Ref.g(201390987714459017L, var39);
      Object var41 = 607406499593010576L;
      this.addMouseListener((MouseListener)Ref.g(607406499593010576L, var41));
      Object var43 = 201390987714459017L;
      ((JLabel)Ref.g(201390987714459017L, var43)).setBorder(BorderFactory.createEmptyBorder(0, 5, 0, b(31933, 8835116987411553962L)));
      Object[] var10020 = Registry.emptyArgs();
      long var46 = 540636277625696369L;
      Object[] var45 = var10020;
      Ref.h(540636277625696369L, var45, var46);

      try {
         ;
      } catch (InvocationTargetException var67) {
         throw var67.getTargetException();
      }

      Object var47 = 201390987714459017L;
      this.add((JLabel)Ref.g(201390987714459017L, var47));
      JLabel var10022 = new JLabel("");
      long var50 = 262854881355003610L;
      JLabel var49 = var10022;
      Ref.s(262854881355003610L, var49, var50);
      Object var51 = 262854881355003610L;
      ((JLabel)Ref.g(262854881355003610L, var51)).setBorder(BorderFactory.createEmptyBorder(1, 5, 1, 5));
      Object var53 = 262854881355003610L;
      JLabel var10024 = (JLabel)Ref.g(262854881355003610L, var53);
      Object var55 = 607406499593010576L;
      this.addMouseListener((MouseListener)Ref.g(607406499593010576L, var55));
      Object[] var10026 = Registry.emptyArgs();
      long var58 = 540636277625696369L;
      Object[] var57 = var10026;
      Ref.h(540636277625696369L, var57, var58);

      try {
         ;
      } catch (InvocationTargetException var66) {
         throw var66.getTargetException();
      }

      Object var59 = 607406499593010576L;
      this.addMouseListener((MouseListener)Ref.g(607406499593010576L, var59));
      Object[] var10028 = Registry.emptyArgs();
      long var62 = 540636277625696369L;
      Object[] var61 = var10028;
      Ref.h(540636277625696369L, var61, var62);

      try {
         ;
      } catch (InvocationTargetException var65) {
         throw var65.getTargetException();
      }

      Object var63 = 262854881355003610L;
      this.add((JLabel)Ref.g(262854881355003610L, var63), b(-6458, 7741), 0);
      if (Ky4.F$arrString() != null) {
         U(new String[4]);
      }
   }

   @Override
   public void D() {
      super.D();
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 284936423571768255L;
      Object[] var1 = var10001;
      Ref.h(284936423571768255L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   public void i() {
      String[] var1 = F();
      Object var4 = 529421273455029847L;
      Object var10001 = (SetBackgroundImagePanel)Ref.g(529421273455029847L, var4);
      if (var1 != null) {
         if (var10001 == null) {
            return;
         }

         var10001 = this;
         Object var6 = 529421273455029847L;
         SetBackgroundImagePanel var10002 = (SetBackgroundImagePanel)Ref.g(529421273455029847L, var6);
      }

      var10001 = ((SetBackgroundImagePanel)var10001).X$_y_2();
      if (var1 != null) {
         if (var10001 == null) {
            return;
         }

         var10001 = this;
         Object var8 = 529421273455029847L;
         ((SetBackgroundImagePanel)Ref.g(529421273455029847L, var8)).X$_y_2();
      }

      Ty2 var2 = ((ConnectionProperty)var10001).M$Ty_2();
      Object[] var17 = Registry.emptyArgs();
      long var11 = 121632250293569146L;
      Object[] var10 = var17;
      Ref.h(121632250293569146L, var10, var11);

      try {
         ;
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      Object[] var10003 = Registry.emptyArgs();
      long var13 = 148413860390729177L;
      Object[] var12 = var10003;
      Ref.h(148413860390729177L, var12, var13);

      try {
         ;
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public void R() {
      Registry.lookupField(532893860934733004L).setBoolean(this, false);
      Object var19 = 334241381080505095L;
      String var2 = ((Dv2)Ref.g(334241381080505095L, var19)).getText();
      Object var21 = 334241381080505095L;
      Object var3 = ((Dv2)Ref.g(334241381080505095L, var21)).getCaretPosition();
      Object var4 = var3 - 1;
      String[] var10002 = F();
      ZX_2 var5 = new ZX_2(var2);
      String[] var1 = var10002;

      label688: {
         label692: {
            while (true) {
               label684:
               if (var4 > 0) {
                  Object var6 = var2.charAt((int)var4);
                  var177 = (ZX_2)var6;
                  if (var1 == null) {
                     break;
                  }

                  label681: {
                     label695: {
                        label679:
                        if (var1 != null) {
                           if (var6 != b(29829, 1906305513456424599L)) {
                              var177 = (ZX_2)var6;
                              if (var1 == null) {
                                 break label679;
                              }

                              if (var6 != b(14823, 7710835707957255160L)) {
                                 var177 = (ZX_2)var6;
                                 if (var1 == null) {
                                    break label679;
                                 }

                                 if (var6 != b(27338, 2857848636304214231L)) {
      CompleteFullPathPanel var177;
      CompleteFullPathPanel var177;
                                    break label695;
                                 }
                              }
                           }

                           var177 = var5;
                           Object[] var10003 = Registry.packArgs((int)var4);
                           long var24 = 416740220276092047L;
                           Object[] var23 = var10003;
                           var10003 = Ref.h(416740220276092047L, var23, var24);

                           try {
                           } catch (InvocationTargetException var145) {
                              throw var145.getTargetException();
                           }
                        }

                        ZX_2 var7 = var177;
                        if (var1 == null) {
                           break label681;
                        }

                        if (var7 == null) {
                           var4++;
                           if (var1 != null) {
                              break label684;
                           }

                           Ky4.K(new String[3]);
                        }
                     }

                     var4--;
                  }

                  if (var1 != null) {
                     continue;
                  }
               }

               Registry.lookupField(318221744963316484L).setInt(this, (int)var4);
               var178 = this;
               if (var1 == null) {
                  break label692;
               }

               var177 = Registry.lookupField(318221744963316484L).getInt(this);
               break;
            }

            if (!(var177 < 0)) {
               break label688;
            }

            var178 = this;
         }

         Registry.lookupField(318221744963316484L).setInt(var178, 0);
      }

      Field var10006 = Registry.lookupField(318221744963316484L);
      Backspace var10005 = this;
      String var147 = var2.substring(0, var10006.getInt(this));
      Object var148 = 0;
      int var8 = 0;

      Backspace var193;
      label650: {
         label649: {
            label697: {
               label698: {
                  label736: {
                     label700: {
                        int var183;
                        while (true) {
                           label641:
                           if (var8 < var147.length()) {
                              label639: {
                                 var10002 = var147.charAt(var8);
                                 if (var1 != null) {
                                    var183 = b(29829, 1906305513456424599L);
                                    if (var1 == null) {
                                       break;
                                    }

                                    if (var10002 == var183) {
                                       break label639;
                                    }

                                    var10002 = true;
                                 }

                                 var148 = var10002;
                                 if (var1 != null) {
                                    break label641;
                                 }
                              }

                              var8++;
                              if (var1 != null) {
                                 continue;
                              }
                           }

                           var4 = var3;
                           var10002 = (String[])var3;
                           var183 = var2.length();
                           break;
                        }

                        while (true) {
                           if (!(var10002 < var183)) {
                              Registry.lookupField(415245619477773852L).setInt(this, (int)var4);
                              var180 = this;
                              String var189 = var2.substring(
                                 Registry.lookupField(318221744963316484L).getInt(this), Registry.lookupField(415245619477773852L).getInt(this)
                              );
                              long var168 = 629060125004828245L;
                              String var167 = var189;
                              Ref.s(629060125004828245L, var167, var168);
                              if (var1 == null) {
                                 long var173 = 449876613200166173L;
                                 String var171 = "";
                                 Ref.s(449876613200166173L, var171, var173);
                                 if (var1 != null) {
                                    break label698;
                                 }
                                 break label736;
                              }

                              Object var169 = 629060125004828245L;
                              ((String)Ref.g(629060125004828245L, var169)).equals(".");
                              break label700;
                           }

                           Object var149 = var2.charAt((int)var4);
                           var180 = (Backspace)var149;
                           if (var1 == null) {
                              break label700;
                           }

                           var183 = b(29829, 1906305513456424599L);
                           var10004 = var1;
                           if (var1 == null) {
                              int var9 = var149 - var183;

                              while (var9 > -1) {
                                 Object var10 = var2.charAt(var9);
                                 if (var1 != null) {
                                    var183 = b(29829, 1906305513456424599L);
                                    var10004 = var1;
                                    if (var1 == null) {
                                       break label649;
                                    }

                                    if (var10 != var183) {
                                       var10002 = (String[])var10;
                                       if (var1 != null) {
                                          var10004 = 6329998434114149091L;
                                          if (var10 != b(14585, 6329998434114149091L)) {
                                             var183 = b(16967, 4352882073051848799L);
                                             var10004 = var1;
                                             if (var1 == null) {
                                                break label649;
                                             }

                                             if (var10 != var183) {
                                                break label697;
                                             }
                                          }

                                          var10002 = false;
                                       }

                                       var148 = var10002;
                                       if (var1 != null) {
                                          break label697;
                                       }
                                    }

                                    var9--;
                                 }

                                 if (var1 == null) {
                                    break label697;
                                 }
                              }

                              boolean var188 = true;
                              break label649;
                           }

                           if (var149 == var183) {
                              break;
                           }

                           var180 = (Backspace)var149;
                           if (var1 == null) {
                              break label700;
                           }

                           if (var149 == b(14585, 6329998434114149091L) || var149 == b(16967, 4352882073051848799L) && var1 != null) {
                              break;
                           }

                           var4++;
                           if (var1 == null) {
                              break;
                           }

                           var10002 = (String[])var4;
                           var183 = var2.length();
                        }

                        Registry.lookupField(415245619477773852L).setInt(this, (int)var4);
                        var180 = this;
                        String var185 = var2.substring(
                           Registry.lookupField(318221744963316484L).getInt(this), Registry.lookupField(415245619477773852L).getInt(this)
                        );
                        long var26 = 629060125004828245L;
                        String var25 = var185;
                        Ref.s(629060125004828245L, var25, var26);
                        if (var1 == null) {
                           long var34 = 449876613200166173L;
                           String var33 = "";
                           Ref.s(449876613200166173L, var33, var34);
                           if (var1 != null) {
                              break label698;
                           }
                           break label736;
                        }

                        Object var27 = 629060125004828245L;
                        ((String)Ref.g(629060125004828245L, var27)).equals(".");
                     }

                     if (var180 == false && var1 != null) {
                        Object var29 = 629060125004828245L;
                        if (!((String)Ref.g(629060125004828245L, var29)).equals(b(-6451, -19056))) {
                           Object var31 = 629060125004828245L;
                           String var190 = (String)Ref.g(629060125004828245L, var31);
                           if (var1 == null) {
                              String var150 = var190;
                              Registry.packArgs(var150);
                              long var39 = 422950346059317716L;
                              var10006 = (Field)Ref.h2(422950346059317716L, var39);
                              long var42 = 449876613200166173L;
                              Object var41 = var10006;
                              Ref.s(449876613200166173L, var41, var42);
                              break label698;
                           }

                           if (!var190.endsWith("/")) {
                              break label736;
                           }
                        }
                     }

                     long var172 = 449876613200166173L;
                     String var170 = "";
                     Ref.s(449876613200166173L, var170, var172);
                     if (var1 != null) {
                        break label698;
                     }
                  }

                  Object var35 = 629060125004828245L;
                  Registry.packArgs(Ref.g(629060125004828245L, var35));
                  long var37 = 492062420395921538L;
                  var10006 = (Field)Ref.h2(492062420395921538L, var37);

                  try {
                     var210 = (String)var10006;
                  } catch (InvocationTargetException var144) {
                     throw var144.getTargetException();
                  }

                  String var151 = var210;
                  Registry.packArgs(var151);
                  long var174 = 422950346059317716L;
                  Object var10008 = Ref.h2(422950346059317716L, var174);
                  long var176 = 449876613200166173L;
                  Object var175 = var10008;
                  Ref.s(449876613200166173L, var175, var176);
               }

               if (var1 != null) {
                  if (var148 == null) {
                     label525: {
                        label524: {
                           var193 = this;
                           Object var43 = 629060125004828245L;
                           var10005 = ((String)Ref.g(629060125004828245L, var43)).startsWith(".");
                           if (var1 != null) {
                              if (var10005 == null) {
                                 Object var45 = 629060125004828245L;
                                 var211 = ((String)Ref.g(629060125004828245L, var45)).startsWith("/");
                                 if (var1 == null) {
                                    break label525;
                                 }

                                 if (!var211) {
                                    break label524;
                                 }
                              }

                              var10005 = true;
                           }

                           var148 = var10005;
                        }

                        Object var47 = 629060125004828245L;
                        var211 = ((String)Ref.g(629060125004828245L, var47)).equals(".");
                     }

                     if (var1 == null) {
                        break label650;
                     }

                     if (var211) {
                     }
                     break label697;
                  }

                  boolean var191 = false;
               }

               int var153 = Registry.lookupField(318221744963316484L).getInt(this) - 1;

               do {
                  if (var153 <= -1) {
                     var10004 = (String[])var3;
                     var10005 = true;
                     break label649;
                  }

                  Object var155 = var2.charAt(var153);
                  if (var1 != null) {
                     var10004 = (String[])var155;
                     var10005 = b(29829, 1906305513456424599L);
                     if (var1 == null) {
                        break label649;
                     }

                     if (var155 != var10005) {
                        var193 = (Backspace)var155;
                        if (var1 != null) {
                           if (var155 != b(14585, 6329998434114149091L)) {
                              var10004 = (String[])var155;
                              var10005 = b(16967, 4352882073051848799L);
                              if (var1 == null) {
                                 break label649;
                              }

                              if (var155 != var10005) {
                                 break;
                              }
                           }

                           var193 = false;
                        }

                        var148 = var193;
                        if (var1 != null) {
                           break;
                        }
                     }

                     var153--;
                  }
               } while (var1 != null);
            }

            var10004 = (String[])var3;
            var10005 = true;
         }

         var193 = var10004 - var10005;
      }

      Object var154;
      label709: {
         label710: {
            var152 = var193;
            var154 = 0;
            var193 = var2.length();
            if (var1 != null) {
               if (var193 > 0) {
                  while (var154 < var2.length()) {
                     Object var156 = var2.charAt((int)var154);
                     if (var1 != null) {
                        var193 = (Backspace)var156;
                        var200 = b(29829, 1906305513456424599L);
                        if (var1 == null) {
                           break label710;
                        }

                        if (var156 != var200 && var1 != null) {
                           break;
                        }

                        var154++;
                     }

                     if (var1 == null) {
                        break;
                     }
                  }
               }

               var193 = var152;
            }

            if (var1 == null) {
               break label709;
            }

            var200 = -1;
         }

         if (var193 == var200) {
            var152 = false;
         }

         var193 = true;
      }

      Backspace var157 = var193;

      while (true) {
         label479:
         if (var152 > 0) {
            label477: {
               label713: {
                  Object var11 = var2.charAt((int)var152);
                  var193 = (Backspace)var11;
                  label475:
                  if (var1 != null) {
                     var201 = b(14585, 6329998434114149091L);
                     if (var1 == null) {
                        break;
                     }

                     if (var11 != var201) {
                        var193 = (Backspace)var11;
                        if (var1 == null) {
                           break label475;
                        }

                        if (var11 != b(16967, 4352882073051848799L)) {
                           break label713;
                        }
                     }

                     var157 = false;
                     var193 = var5;
                     Object[] var202 = Registry.packArgs((int)var152);
                     long var50 = 416740220276092047L;
                     Object[] var49 = var202;
                     var10005 = (Backspace)Ref.h(416740220276092047L, var49, var50);

                     try {
                     } catch (InvocationTargetException var143) {
                        throw var143.getTargetException();
                     }
                  }

                  Object var12 = var193;
                  if (var1 == null) {
                     break label477;
                  }

                  if (var12 == null) {
                     var152++;
                     if (var1 != null) {
                        break label479;
                     }
                  }
               }

               var152--;
            }

            if (var1 != null) {
               continue;
            }
         }

         var193 = var152;
         var201 = var2.length() - 1;
         break;
      }

      if (var1 != null) {
         if (var193 > var201) {
            var152 = var2.length() - 1;
         }

         var193 = var152;
         var201 = 1;
      }

      Object var158;
      label715: {
         label716: {
            var158 = var193 + var201;
            var193 = var157;
            if (var1 != null) {
               if (var157 == null) {
                  var158 = var154;
               }

               var193 = (Backspace)var158;
            }

            while (true) {
               if (!(var193 < var2.length())) {
                  var193 = (Backspace)var158;
                  if (var1 == null) {
                     break label715;
                  }

                  var204 = var2.length() - 1;
                  break label716;
               }

               Object var159 = var2.charAt((int)var158);
               if (var1 != null) {
                  var193 = (Backspace)var159;
                  var204 = b(29829, 1906305513456424599L);
                  if (var1 == null) {
                     break label716;
                  }

                  if (var159 == var204 && var1 != null) {
                     break;
                  }

                  var158++;
               }

               if (var1 == null) {
                  break;
               }

               var193 = (Backspace)var158;
            }

            var193 = (Backspace)var158;
            if (var1 == null) {
               break label715;
            }

            var204 = var2.length() - 1;
         }

         if (var193 > var204) {
            var158 = var2.length() - 1;
         }

         var193 = var152;
      }

      if (var1 != null) {
         if (var193 < 0) {
            var152 = false;
         }

         var193 = (Backspace)var158;
      }

      label426: {
         if (var1 != null) {
            if (!(var193 < 0)) {
               break label426;
            }

            var193 = false;
         }

         var158 = var193;
      }

      String var160;
      label719: {
         label720: {
            var160 = var2.substring((int)var152, (int)var158).trim();
            var193 = var160.equals(b(-6459, -31436));
            if (var1 != null) {
               if (var193 == null) {
                  Registry.lookupField(532893860934733004L).setBoolean(this, true);
               }

               var193 = this;
               Object[] var205 = Registry.packArgs((boolean)var148);
               long var52 = 560693370380862455L;
               Object[] var51 = var205;
               Ref.h(560693370380862455L, var51, var52);

               try {
                  ;
               } catch (InvocationTargetException var142) {
                  throw var142.getTargetException();
               }

               if (var1 == null) {
                  break label720;
               }
            }

            if (var193 == null) {
               Registry.lookupField(274525916063193125L).setInt(this, Registry.lookupField(140484109673847197L).getInt(null));
               Object[] var206 = Registry.packArgs(-1);
               long var54 = 453147207911949875L;
               Object[] var53 = var206;
               Ref.h(453147207911949875L, var53, var54);

               try {
                  ;
               } catch (InvocationTargetException var141) {
                  throw var141.getTargetException();
               }

               Object[] var212 = Registry.packArgs(b(1534, 1064063368139384808L));
               long var56 = 285437777447332075L;
               Object[] var55 = var212;
               Ref.h(285437777447332075L, var55, var56);

               try {
                  ;
               } catch (InvocationTargetException var140) {
                  throw var140.getTargetException();
               }

               Object[] var10007 = Registry.packArgs(b(691, 5224603133704511661L));
               long var58 = 441894672017167978L;
               Object[] var57 = var10007;
               Ref.h(441894672017167978L, var57, var58);

               try {
                  ;
               } catch (InvocationTargetException var139) {
                  throw var139.getTargetException();
               }

               if (var1 != null) {
                  break label719;
               }
            }

            Registry.lookupField(274525916063193125L).setInt(this, Registry.lookupField(523789155715726667L).getInt(null));
            Object[] var207 = Registry.packArgs(b(24302, 1612784168125857001L));
            long var60 = 453147207911949875L;
            Object[] var59 = var207;
            Ref.h(453147207911949875L, var59, var60);

            try {
               ;
            } catch (InvocationTargetException var138) {
               throw var138.getTargetException();
            }

            Object[] var213 = Registry.packArgs(b(10704, 3395946432162859969L));
            long var62 = 285437777447332075L;
            Object[] var61 = var213;
            Ref.h(285437777447332075L, var61, var62);

            try {
               ;
            } catch (InvocationTargetException var137) {
               throw var137.getTargetException();
            }
         }

         Object[] var214 = Registry.packArgs(b(22050, 4631522734275523639L));
         long var64 = 441894672017167978L;
         Object[] var63 = var214;
         Ref.h(441894672017167978L, var63, var64);

         try {
            ;
         } catch (InvocationTargetException var136) {
            throw var136.getTargetException();
         }
      }

      Object var65 = 529421273455029847L;
      Connect_2 var13 = (Connect_2)((SetBackgroundImagePanel)Ref.g(529421273455029847L, var65)).X$_y_2().O$QT();
      if (var1 != null) {
         label724: {
            if (var13 != null) {
               String var14 = "";
               String var15 = "";
               if (var1 == null) {
                  break label724;
               }

               Object var67 = 529421273455029847L;
               if ((SetBackgroundImagePanel)Ref.g(529421273455029847L, var67) != null) {
                  if (var1 == null) {
                     break label724;
                  }

                  Object var69 = 529421273455029847L;
                  if (((SetBackgroundImagePanel)Ref.g(529421273455029847L, var69)).X$_y_2() != null) {
                     Object var71 = 529421273455029847L;
                     Ty2 var16 = ((SetBackgroundImagePanel)Ref.g(529421273455029847L, var71)).X$_y_2().M$Ty_2();
                     Object[] var10012 = Registry.emptyArgs();
                     long var74 = 121632250293569146L;
                     Object[] var73 = var10012;
                     Ref.h(121632250293569146L, var73, var74);

                     try {
                        ;
                     } catch (InvocationTargetException var135) {
                        throw var135.getTargetException();
                     }

                     var10012 = var160.equals(b(-6464, -20631));
                     label394:
                     if (var1 != null) {
                        if (var10012 == null) {
                           var10012 = this;
                           Object var75 = 629060125004828245L;
                           boolean var10013 = ((String)Ref.g(629060125004828245L, var75)).equals("/");
                           if (var1 == null) {
                              break label394;
                           }

                           if (!var10013) {
                              Object var77 = 629060125004828245L;
                              boolean var10014 = ((String)Ref.g(629060125004828245L, var77)).equals("");
                              if (var1 == null) {
                                 break label394;
                              }

                              if (!var10014) {
                                 Object var79 = 629060125004828245L;
                                 boolean var10015 = ((String)Ref.g(629060125004828245L, var79)).endsWith("/");
                                 if (var1 == null) {
                                    break label394;
                                 }

                                 if (!var10015) {
                                    new StringBuilder();
                                    Object var81 = 629060125004828245L;
                                    String var10017 = this.append((String)Ref.g(629060125004828245L, var81)).append("/").toString();
                                    long var84 = 629060125004828245L;
                                    String var83 = var10017;
                                    Ref.s(629060125004828245L, var83, var84);
                                 }
                              }
                           }
                        }

                        var10012 = this;
                        Object var85 = 629060125004828245L;
                        var15 = (String)Ref.g(629060125004828245L, var85);
                        Object var87 = 629060125004828245L;
                        ((String)Ref.g(629060125004828245L, var87)).startsWith("/");
                     }

                     label727: {
                        label380: {
                           label728: {
                              if (var1 != null) {
                                 if (var10012 == null) {
                                    label374: {
                                       Object var89 = 629060125004828245L;
                                       Backspace var216 = ((String)Ref.g(629060125004828245L, var89)).length();
                                       if (var1 != null) {
                                          if (var216 == null) {
                                             Object var91 = 629060125004828245L;
                                             var14 = (String)Ref.g(629060125004828245L, var91);
                                             if (var1 != null) {
                                                break label374;
                                             }
                                          }

                                          var216 = this;
                                          Object var93 = 629060125004828245L;
                                          ((String)Ref.g(629060125004828245L, var93)).lastIndexOf("/");
                                       }

                                       Backspace var146 = var216;
                                       Object var95 = 629060125004828245L;
                                       var14 = ((String)Ref.g(629060125004828245L, var95)).substring(0, var146 + 1);
                                    }

                                    Registry.packArgs(var14);
                                    long var97 = 492062420395921538L;
                                    Object var220 = Ref.h2(492062420395921538L, var97);

                                    try {
                                       var220 = (String)var220;
                                    } catch (InvocationTargetException var134) {
                                       throw var134.getTargetException();
                                    }

                                    var14 = (String)var220;
                                    Registry.packArgs(var14, true);
                                    long var99 = 444563393544393356L;
                                    Object var10016 = Ref.h2(444563393544393356L, var99);

                                    try {
                                       var10016 = (String)var10016;
                                    } catch (InvocationTargetException var133) {
                                       throw var133.getTargetException();
                                    }

                                    var14 = (String)var10016;
                                    Registry.packArgs(var15);
                                    long var101 = 492062420395921538L;
                                    Object var228 = Ref.h2(492062420395921538L, var101);

                                    try {
                                       var228 = (String)var228;
                                    } catch (InvocationTargetException var132) {
                                       throw var132.getTargetException();
                                    }

                                    var15 = (String)var228;
                                    Registry.packArgs(var15, true);
                                    long var103 = 444563393544393356L;
                                    Object var10018 = Ref.h2(444563393544393356L, var103);

                                    try {
                                       var10018 = (String)var10018;
                                    } catch (InvocationTargetException var131) {
                                       throw var131.getTargetException();
                                    }

                                    var15 = (String)var10018;
                                    if (var1 != null) {
                                       break label727;
                                    }
                                 }

                                 var10012 = this;
                                 Object var105 = 629060125004828245L;
                                 String var217 = (String)Ref.g(629060125004828245L, var105);
                                 if (var1 == null) {
                                    break label728;
                                 }

                                 var4 = var217.lastIndexOf("/");
                              }

                              if (var10012 > -1) {
                                 Object var107 = 629060125004828245L;
                                 var14 = ((String)Ref.g(629060125004828245L, var107)).substring(0, var4 + 1);
                                 if (var1 != null) {
                                    break label380;
                                 }
                              }

                              var10012 = "";
                           }

                           var14 = var10012;
                        }

                        Registry.packArgs(var14);
                        long var109 = 492062420395921538L;
                        Object var218 = Ref.h2(492062420395921538L, var109);

                        try {
                           var218 = (String)var218;
                        } catch (InvocationTargetException var130) {
                           throw var130.getTargetException();
                        }

                        var14 = (String)var218;
                        Registry.packArgs(var15);
                        long var111 = 492062420395921538L;
                        Ref.h2(492062420395921538L, var111);

                        try {
                           ;
                        } catch (InvocationTargetException var129) {
                           throw var129.getTargetException();
                        }

                        Object[] var222 = Registry.emptyArgs();
                        long var114 = 162215999904233420L;
                        Object[] var113 = var222;
                        var222 = Ref.h(162215999904233420L, var113, var114);

                        try {
                           var222 = (String)var222;
                        } catch (InvocationTargetException var128) {
                           throw var128.getTargetException();
                        }

                        String var18 = var222;
                        Registry.packArgs(var13.u(), var14, true, var18);
                        long var115 = 143610495443029601L;
                        Object var226 = Ref.h2(143610495443029601L, var115);

                        try {
                           var226 = (String)var226;
                        } catch (InvocationTargetException var127) {
                           throw var127.getTargetException();
                        }

                        var14 = (String)var226;
                     }

                     long var118 = 216313497050019341L;
                     Ref.s(216313497050019341L, var14, var118);
                     long var120 = 633015754028760179L;
                     Ref.s(633015754028760179L, var14, var120);
                  }
               }
            }

            Object[] var10009 = Registry.emptyArgs();
            long var122 = 383484095973190497L;
            Object[] var121 = var10009;
            Ref.h(383484095973190497L, var121, var122);

            try {
               ;
            } catch (InvocationTargetException var126) {
               throw var126.getTargetException();
            }
         }

         Object[] var10010 = Registry.emptyArgs();
         long var124 = 612990022110170911L;
         Object[] var123 = var10010;
         Ref.h(612990022110170911L, var123, var124);

         try {
            ;
         } catch (InvocationTargetException var125) {
            throw var125.getTargetException();
         }
      }
   }

   @Override
   public synchronized void Z() {
      String[] var10000 = F();
      super.Z();
      String[] var1 = var10000;
      Object var2 = 262854881355003610L;
      JLabel var10001 = (JLabel)Ref.g(262854881355003610L, var2);
      if (var1 != null) {
         if (var10001 == null) {
            return;
         }

         Object var4 = 262854881355003610L;
         JLabel var10002 = (JLabel)Ref.g(262854881355003610L, var4);
      }

      StringBuilder var8 = new StringBuilder().append(b(-6461, 12756));
      Object var6 = 633015754028760179L;
      var8.setText(this.append((String)Ref.g(633015754028760179L, var6)).toString());
   }

   @Override
   public void u(KeyEvent var1) {
      String[] var2 = F();
      int var10000 = Registry.lookupField(274525916063193125L).getInt(this);
      if (var2 != null) {
         if (var10000 != Registry.lookupField(140484109673847197L).getInt(null)) {
            return;
         }

         var10000 = 0;
      }

      label47: {
         int var3;
         label56: {
            var3 = var10000;
            var10000 = var1.getModifiers();
            if (var2 != null) {
               if (var10000 == 0) {
                  var10000 = var1.getKeyCode();
                  if (var2 == null) {
                     break label47;
                  }

                  if (var10000 != b(30285, 5864637487809647700L)) {
                     break label56;
                  }

                  var3 = 1;
                  if (var2 != null) {
                     break label56;
                  }
               }

               var10000 = var1.getKeyCode();
            }

            if (var2 == null) {
               break label47;
            }

            if (var10000 == b(29280, 1114623689291780211L)) {
               var10000 = var1.getModifiers() & 2;
               if (var2 == null) {
                  break label47;
               }

               if (var10000 != 0) {
                  var3 = 1;
               }
            }
         }

         var10000 = var3;
      }

      if (var10000 != 0) {
         Object[] var10001 = Registry.emptyArgs();
         long var5 = 603674811038293420L;
         Object[] var4 = var10001;
         Ref.h(603674811038293420L, var4, var5);

         try {
            ;
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }
   }

   @Override
   public void u$void() {
      F();
      Object var3 = 633015754028760179L;
      Object[] var10002 = Registry.packArgs(Ref.g(633015754028760179L, var3));
      long var5 = 405430188584561323L;
      Object var10003 = Ref.h2(405430188584561323L, var5);

      try {
         var10003 = (String)var10003;
      } catch (InvocationTargetException var23) {
         throw var23.getTargetException();
      }

      Object[] var1;
      String var2;
      var2 = (String)var10003;
      var1 = var10002;
      var10002 = var2.equals("");
      label82:
      if (var1 != null) {
         if (var10002 == null) {
            var10002 = var2.endsWith("/");
            if (var1 == null) {
               break label82;
            }

            if (var10002 == null) {
               var2 = var2 + "/";
            }
         }

         var10002 = this;
         Object var7 = 265132846717086219L;
         Registry.packArgs(((Dv2)Ref.g(265132846717086219L, var7)).getText());
         long var9 = 330094358428833085L;
         Object var10004 = Ref.h2(330094358428833085L, var9);

         try {
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }
      }

      label92: {
         if (var1 != null) {
            if (var10002 == null) {
               return;
            }

            var10002 = this;
            long var12 = 633015754028760179L;
            Ref.s(633015754028760179L, var2, var12);
            if (var1 == null) {
               break label92;
            }

            Object[] var27 = Registry.emptyArgs();
            long var14 = 383484095973190497L;
            Object[] var13 = var27;
            Ref.h(383484095973190497L, var13, var14);

            try {
               ;
            } catch (InvocationTargetException var21) {
               throw var21.getTargetException();
            }

            Registry.packArgs(var2);
            long var15 = 405430188584561323L;
            Object var10005 = Ref.h2(405430188584561323L, var15);

            try {
               var10005 = (String)var10005;
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            var2 = (String)var10005;
            var2.equals("");
         }

         if (var10002 == null && var1 != null && !var2.endsWith("/")) {
            new StringBuilder().append(var2).append("/").toString();
         }
      }

      var10003 = Registry.emptyArgs();
      long var18 = 612990022110170911L;
      Object[] var17 = (Object[])var10003;
      Ref.h(612990022110170911L, var17, var18);

      try {
         ;
      } catch (InvocationTargetException var19) {
         throw var19.getTargetException();
      }
   }

   @Override
   public Rectangle S() {
      // $VF: Couldn't be decompiled
      throw new UnsupportedOperationException("decompilation failed (Vineflower)");
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic com/finalshell/ui/dialog/Backspace.F ()[Ljava/lang/String;
      // 03: aload 0
      // 04: invokespecial com/finalshell/ui/dialog/ClearListDialog.S ()Ljava/awt/Rectangle;
      // 07: astore 2
      // 08: astore 1
      // 09: aload 0
      // 0a: ldc2_w 334241381080505095
      // 0d: astore 4
      // 0f: ldc2_w 334241381080505095
      // 12: aload 4
      // 14: invokestatic com/finalshell/reflect/Ref.g (JLjava/lang/Object;)Ljava/lang/Object;
      // 17: checkcast com/finalshell/core/Dv2
      // 1a: aload 0
      // 1b: ldc2_w 318221744963316484
      // 1e: invokestatic com/finalshell/reflect/Registry.lookupField (J)Ljava/lang/reflect/Field;
      // 21: swap
      // 22: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 25: invokevirtual com/finalshell/core/Dv2.modelToView (I)Ljava/awt/Rectangle;
      // 28: astore 3
      // 29: aload 3
      // 2a: aload 1
      // 2b: ifnull 49
      // 2e: getfield java/awt/Rectangle.x I
      // 31: bipush 5
      // 32: if_icmpge 48
      // 35: goto 3c
      // 38: invokestatic com/finalshell/ui/dialog/Backspace.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 3b: athrow
      // 3c: aload 3
      // 3d: bipush 5
      // 3e: putfield java/awt/Rectangle.x I
      // 41: goto 48
      // 44: invokestatic com/finalshell/ui/dialog/Backspace.a (Ljavax/swing/text/BadLocationException;)Ljavax/swing/text/BadLocationException;
      // 47: athrow
      // 48: aload 2
      // 49: dup
      // 4a: getfield java/awt/Rectangle.x I
      // 4d: aload 3
      // 4e: getfield java/awt/Rectangle.x I
      // 51: iadd
      // 52: putfield java/awt/Rectangle.x I
      // 55: goto 5d
      // 58: astore 3
      // 59: aload 3
      // 5a: invokevirtual javax/swing/text/BadLocationException.printStackTrace ()V
      // 5d: aload 2
      // 5e: areturn
   }

   @Override
   public void i(L1 var1, int var2) {
      Object[] var10001 = Registry.emptyArgs();
      long var4 = 424004678767184744L;
      Object[] var3 = var10001;
      Ref.h(424004678767184744L, var3, var4);
      Object[] var10002 = Registry.packArgs(var1);
      long var6 = 190233821466993016L;
      Object[] var5 = var10002;
      Ref.h(190233821466993016L, var5, var6);

      try {
         ;
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      Registry.emptyArgs();
      long var7 = 270389152141252877L;
      Ref.h2(270389152141252877L, var7);
      Object[] var10004 = Registry.emptyArgs();
      long var10 = 578864097947885485L;
      Object[] var9 = var10004;
      Ref.h(578864097947885485L, var9, var10);

      try {
         ;
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }
   }

   @Override
   public void L(String var1) {
      String[] var2 = F();
      if (var2 != null) {
         Object var3 = 529421273455029847L;
         ((SetBackgroundImagePanel)Ref.g(529421273455029847L, var3)).x(var1, true);
         Registry.emptyArgs();
         long var5 = 270389152141252877L;
         Ref.h2(270389152141252877L, var5);
         Object[] var10003 = Registry.emptyArgs();
         long var8 = 306266403902896148L;
         Object[] var7 = var10003;
         Ref.h(306266403902896148L, var7, var8);
         Object[] var10004 = Registry.emptyArgs();
         long var10 = 629517738120639335L;
         Object[] var9 = var10004;
         var10004 = Ref.h(629517738120639335L, var9, var10);

         try {
            var15 = (Boolean)var10004;
         } catch (InvocationTargetException var13) {
            throw var13.getTargetException();
         }

         if (!var15) {
            return;
         }
      }

      Object var11 = 334241381080505095L;
      ((Dv2)Ref.g(334241381080505095L, var11)).setText("");
   }

   @Override
   public void k(L1 var1) {
      Object[] var10001 = Registry.emptyArgs();
      long var23 = 542058094445767607L;
      Object[] var22 = var10001;
      var10001 = Ref.h(542058094445767607L, var22, var23);

      try {
         var10001 = (String)var10001;
      } catch (InvocationTargetException var155) {
         throw var155.getTargetException();
      }

      String var3 = var10001;
      Object var4 = true;
      Object var5 = 0;
      String[] var167 = F();
      L1 var6 = var1;
      String[] var2 = var167;
      Object[] var10002 = Registry.emptyArgs();
      long var25 = 499802980066530981L;
      Object[] var24 = var10002;
      var10002 = Ref.h(499802980066530981L, var24, var25);

      try {
         var10002 = (Boolean)var10002;
      } catch (InvocationTargetException var154) {
         throw var154.getTargetException();
      }

      label384: {
         if (var2 != null) {
            if (var10002 == null) {
               Object var26 = 618427502576624312L;
               var5 = ((Tq4)Ref.g(618427502576624312L, var26)).getSelectedRow();
               Backspace var10003 = (Backspace)var5;
               if (var2 != null) {
                  if (!(var5 > -1)) {
                     break label384;
                  }

                  var10003 = this;
                  Object var28 = 618427502576624312L;
                  ((Tq4)Ref.g(618427502576624312L, var28)).convertRowIndexToModel((int)var5);
               }

               Backspace var7 = var10003;
               Object var30 = 598800499692003827L;
               Ref.g(598800499692003827L, var30);
               Object[] var10005 = Registry.packArgs((int)var7, 0);
               long var33 = 130061847059020450L;
               Object[] var32 = var10005;
               var6 = (L1)Ref.h(130061847059020450L, var32, var33);
               if (var2 != null) {
                  break label384;
               }
            }

            var10002 = this;
            Object var34 = 369475678680292668L;
            var5 = ((JXList)Ref.g(369475678680292668L, var34)).getSelectedIndex();
         }

         if (var2 != null) {
            if (!(var10002 > -1)) {
               break label384;
            }

            var10002 = this;
            Object var36 = 627738372728753803L;
            Ref.g(627738372728753803L, var36);
            Object[] var10004 = Registry.emptyArgs();
            long var39 = 253718301466496149L;
            Object[] var38 = var10004;
            var10004 = Ref.h(253718301466496149L, var38, var39);

            try {
            } catch (InvocationTargetException var153) {
               throw var153.getTargetException();
            }
         }

         if (var2 != null) {
            if (!(var10002 > 0)) {
               break label384;
            }

            var10002 = this;
            Object var40 = 369475678680292668L;
            ((JXList)Ref.g(369475678680292668L, var40)).convertIndexToModel((int)var5);
         }

         Backspace var156 = var10002;
         Object var42 = 627738372728753803L;
         Ref.g(627738372728753803L, var42);
         Object[] var171 = Registry.packArgs((int)var156);
         long var45 = 430610060651646114L;
         Object[] var44 = var171;
         var171 = Ref.h(430610060651646114L, var44, var45);

         try {
            var171 = (L1)var171;
         } catch (InvocationTargetException var152) {
            throw var152.getTargetException();
         }

         var6 = var171;
      }

      Object var174;
      label359: {
         label358:
         if (var6 != null) {
            var174 = this;
            Object var46 = 334241381080505095L;
            String var157 = ((Dv2)Ref.g(334241381080505095L, var46)).getText();
            StringBuffer var8 = new StringBuffer();
            String var9 = "";
            int var175 = var3.length();
            if (var2 != null) {
               if (var175 > 0) {
                  var9 = var157.substring(0, Registry.lookupField(318221744963316484L).getInt(this));
               }

               var8.append(var9);
               var175 = Registry.lookupField(274525916063193125L).getInt(this);
            }

            int var10006 = Registry.lookupField(140484109673847197L).getInt(null);
            if (var2 != null) {
               if (var175 == var10006) {
                  boolean var10 = false;
                  Registry.emptyArgs();
                  long var48 = 270389152141252877L;
                  Ref.h2(270389152141252877L, var48);
                  Object[] var10007 = Registry.emptyArgs();
                  long var51 = 306266403902896148L;
                  Object[] var50 = var10007;
                  Ref.h(306266403902896148L, var50, var51);
                  Object[] var10008 = Registry.emptyArgs();
                  long var53 = 169497746995301372L;
                  Object[] var52 = var10008;
                  var10008 = Ref.h(169497746995301372L, var52, var53);

                  try {
                     var180 = (Boolean)var10008;
                  } catch (InvocationTargetException var151) {
                     throw var151.getTargetException();
                  }

                  boolean var11 = var180;
                  int var12 = var9.length();
                  int var13 = 0;
                  int var14 = 0;
                  Object[] var10009 = Registry.emptyArgs();
                  long var55 = 601832064246010504L;
                  Object[] var54 = var10009;
                  Ref.h(601832064246010504L, var54, var55);

                  try {
                     ;
                  } catch (InvocationTargetException var150) {
                     throw var150.getTargetException();
                  }

                  Object[] var10010 = Registry.emptyArgs();
                  long var57 = 542058094445767607L;
                  Object[] var56 = var10010;
                  var10010 = Ref.h(542058094445767607L, var56, var57);

                  try {
                     var10010 = (String)var10010;
                  } catch (InvocationTargetException var149) {
                     throw var149.getTargetException();
                  }

                  String var16 = var10010;
                  Object[] var10011 = Registry.emptyArgs();
                  long var59 = 443113534220408058L;
                  Object[] var58 = var10011;
                  var10011 = Ref.h(443113534220408058L, var58, var59);

                  try {
                     var10011 = (String)var10011;
                  } catch (InvocationTargetException var148) {
                     throw var148.getTargetException();
                  }

                  label389: {
                     String var17 = var10011;
                     if (var11) {
                        Object[] var10012 = Registry.emptyArgs();
                        long var61 = 443113534220408058L;
                        Object[] var60 = var10012;
                        var10012 = Ref.h(443113534220408058L, var60, var61);

                        try {
                           var10012 = (String)var10012;
                        } catch (InvocationTargetException var147) {
                           throw var147.getTargetException();
                        }

                        String var18 = var10012;
                        var10012 = var17;
                        label346:
                        if (var2 != null) {
                           if (!var17.equals("/")) {
                              var10012 = var16;
                              if (var2 == null) {
                                 break label346;
                              }

                              if (var16.endsWith("/")) {
                                 var18 = var18 + "/";
                              }
                           }

                           var10012 = Registry.packArgs(var18);
                           long var62 = 205189234585382948L;
                           Ref.h2(205189234585382948L, var62);

                           try {
                              ;
                           } catch (InvocationTargetException var146) {
                              throw var146.getTargetException();
                           }
                        }

                        Object var19 = var10012;
                        var8.append((String)var19);
                        var13 += var19.length();
                        var8.append(var157.substring(Registry.lookupField(415245619477773852L).getInt(this)));
                        if (var2 != null) {
                           break label389;
                        }
                     }

                     Object var164;
                     String var10014;
                     label392: {
                        String var161 = "";
                        Object var64 = 629060125004828245L;
                        var164 = ((String)Ref.g(629060125004828245L, var64)).lastIndexOf("/");
                        Object var66 = 629060125004828245L;
                        Backspace var10013 = ((String)Ref.g(629060125004828245L, var66)).equals(".");
                        if (var2 != null) {
                           if (var10013 == null) {
                              var8.append(b(-6460, -20867));
                              var13 += 2;
                           }

                           var10013 = this;
                           Object var68 = 629060125004828245L;
                           var10014 = (String)Ref.g(629060125004828245L, var68);
                           if (var2 == null) {
                              break label392;
                           }

                           var10014.equals("~");
                        }

                        if (var10013 == null) {
                           var8.append(b(-6457, -5997));
                           var13 += 2;
                        }

                        Object[] var193 = Registry.emptyArgs();
                        long var71 = 542058094445767607L;
                        Object[] var70 = var193;
                        Object var194 = Ref.h(542058094445767607L, var70, var71);

                        try {
                           var10014 = (String)var194;
                        } catch (InvocationTargetException var145) {
                           throw var145.getTargetException();
                        }
                     }

                     String var20 = var10014;
                     Registry.packArgs(var20);
                     long var72 = 205189234585382948L;
                     Object var10015 = Ref.h2(205189234585382948L, var72);

                     try {
                        var10015 = (String)var10015;
                     } catch (InvocationTargetException var144) {
                        throw var144.getTargetException();
                     }

                     label329: {
                        String var21 = (String)var10015;
                        var10015 = var164;
                        int var10016 = -1;
                        if (var2 != null) {
                           if (var164 == null) {
                              var8.append(var21);
                              var13 += var21.length();
                              if (var2 != null) {
                                 break label329;
                              }
                           }

                           var10015 = this;
                           Object var74 = 629060125004828245L;
                           String var162 = ((String)Ref.g(629060125004828245L, var74)).substring(0, var164 + 1);
                           var8.append(var162);
                           var13 += var162.length();
                           var8.append(var21);
                           var10016 = var13;
                           var21.length();
                        }

                        var13 = var10015 + var10016;
                     }

                     var8.append(var157.substring(Registry.lookupField(415245619477773852L).getInt(this)));
                  }

                  var14 = var12 + var13;
                  String var163 = var8.toString();
                  Object[] var197 = Registry.emptyArgs();
                  long var77 = 613149096811612676L;
                  Object[] var76 = var197;
                  var197 = Ref.h(613149096811612676L, var76, var77);

                  try {
                     var197 = (Boolean)var197;
                  } catch (InvocationTargetException var143) {
                     throw var143.getTargetException();
                  }

                  label394: {
                     Backspace var10019;
                     label395: {
                        label396: {
                           if (var2 != null) {
                              if (var197 == null) {
                                 Object[] var10017 = Registry.emptyArgs();
                                 Object var79 = 463286156757271879L;
                                 Object[] var78 = var10017;
                                 var10019 = (Backspace)var79;
                                 var10017 = Ref.h(463286156757271879L, var78, (long)var79);

                                 try {
                                    var201 = (Boolean)var10017;
                                 } catch (InvocationTargetException var142) {
                                    throw var142.getTargetException();
                                 }

                                 if (var2 == null) {
                                    break label395;
                                 }

                                 if (!var201) {
                                    break label396;
                                 }
                              }

                              var197 = (Object[])var5;
                           }

                           if (var2 != null) {
                              if (var197 > -1) {
                                 var4 = false;
                                 Object[] var10018 = Registry.emptyArgs();
                                 long var81 = 443113534220408058L;
                                 Object[] var80 = var10018;
                                 var10018 = Ref.h(443113534220408058L, var80, var81);
                                 long var83 = 629060125004828245L;
                                 Object var82 = var10018;
                                 Ref.s(629060125004828245L, var82, var83);
                                 if (var2 != null) {
                                    Object var84 = 629060125004828245L;
                                    if (!((String)Ref.g(629060125004828245L, var84)).endsWith("/")) {
                                       new StringBuilder();
                                       Object var86 = 629060125004828245L;
                                       String var10021 = this.append((String)Ref.g(629060125004828245L, var86)).append("/").toString();
                                       long var89 = 629060125004828245L;
                                       String var88 = var10021;
                                       Ref.s(629060125004828245L, var88, var89);
                                    }
                                 }

                                 Object var90 = 629060125004828245L;
                                 Object var10020 = Ref.g(629060125004828245L, var90);
                                 long var93 = 633015754028760179L;
                                 Object var92 = var10020;
                                 Ref.s(633015754028760179L, var92, var93);
                                 SwingUtilities.invokeLater(new DY(this));
                                 if (var2 != null) {
                                    break label394;
                                 }
                              }

                              var197 = Registry.emptyArgs();
                              long var94 = 270389152141252877L;
                              Ref.h2(270389152141252877L, var94);
                              Object[] var204 = Registry.emptyArgs();
                              long var97 = 163462326892114024L;
                              Object[] var96 = var204;
                              Ref.h(163462326892114024L, var96, var97);
                              Object[] var207 = Registry.emptyArgs();
                              long var99 = 133802226692684648L;
                              Object[] var98 = var207;
                              var10019 = (Backspace)Ref.h(133802226692684648L, var98, var99);

                              try {
                              } catch (InvocationTargetException var141) {
                                 throw var141.getTargetException();
                              }
                           }

                           if (var2 != null) {
                              if (var197 == null) {
                                 Object[] var202 = Registry.emptyArgs();
                                 long var101 = 496821856781947383L;
                                 Object[] var100 = var202;
                                 Ref.h(496821856781947383L, var100, var101);

                                 try {
                                    ;
                                 } catch (InvocationTargetException var135) {
                                    throw var135.getTargetException();
                                 }

                                 Registry.emptyArgs();
                                 long var102 = 128283426706089385L;
                                 Ref.h2(128283426706089385L, var102);

                                 try {
                                    return;
                                 } catch (InvocationTargetException var134) {
                                    throw var134.getTargetException();
                                 }
                              }

                              var197 = this;
                              Object var104 = 334241381080505095L;
                              ((Dv2)Ref.g(334241381080505095L, var104)).setText(var163);
                              Object var106 = 334241381080505095L;
                              ((Dv2)Ref.g(334241381080505095L, var106)).setCaretPosition(var14);
                              boolean var205 = true;
                           }

                           var4 = var197;
                           if (var2 != null) {
                              break label394;
                           }
                        }

                        Registry.emptyArgs();
                        long var108 = 270389152141252877L;
                        Ref.h2(270389152141252877L, var108);
                        Object[] var206 = Registry.emptyArgs();
                        long var111 = 163462326892114024L;
                        Object[] var110 = var206;
                        Ref.h(163462326892114024L, var110, var111);
                        Object[] var209 = Registry.emptyArgs();
                        long var113 = 133802226692684648L;
                        Object[] var112 = var209;
                        var10019 = (Backspace)Ref.h(133802226692684648L, var112, var113);

                        try {
                           var10019 = (Boolean)var10019;
                        } catch (InvocationTargetException var140) {
                           throw var140.getTargetException();
                        }
                     }

                     if (var2 != null) {
                        if (var10019 == null) {
                           Object[] var211 = Registry.emptyArgs();
                           long var115 = 496821856781947383L;
                           Object[] var114 = var211;
                           Ref.h(496821856781947383L, var114, var115);

                           try {
                              ;
                           } catch (InvocationTargetException var137) {
                              throw var137.getTargetException();
                           }

                           Registry.emptyArgs();
                           long var116 = 128283426706089385L;
                           Ref.h2(128283426706089385L, var116);

                           try {
                              return;
                           } catch (InvocationTargetException var136) {
                              throw var136.getTargetException();
                           }
                        }

                        var10019 = this;
                        Object var118 = 334241381080505095L;
                        ((Dv2)Ref.g(334241381080505095L, var118)).setText(var163);
                        Object var120 = 334241381080505095L;
                        ((Dv2)Ref.g(334241381080505095L, var120)).setCaretPosition(var14);
                        var16.endsWith("/");
                     }

                     if (var2 != null) {
                        if (var10019 == null) {
                           var4 = false;
                           if (var2 != null) {
                              break label394;
                           }
                        }

                        var10019 = true;
                     }

                     var4 = var10019;
                  }

                  if (var2 != null) {
                     break label358;
                  }
               }

               var175 = Registry.lookupField(274525916063193125L).getInt(this);
               if (var2 == null) {
                  break label359;
               }

               var10006 = Registry.lookupField(523789155715726667L).getInt(null);
            }

            if (var175 == var10006) {
               Object[] var176 = Registry.emptyArgs();
               long var123 = 542058094445767607L;
               Object[] var122 = var176;
               var176 = Ref.h(542058094445767607L, var122, var123);

               try {
                  var176 = (String)var176;
               } catch (InvocationTargetException var139) {
                  throw var139.getTargetException();
               }

               var6.append((String)var176);
               var8.append(var157.substring(Registry.lookupField(415245619477773852L).getInt(this)));
               String var158 = var8.toString();
               Object var124 = 334241381080505095L;
               ((Dv2)Ref.g(334241381080505095L, var124)).selectAll();
               Object var126 = 334241381080505095L;
               ((Dv2)Ref.g(334241381080505095L, var126)).setText(var158);
               Object var128 = 334241381080505095L;
               Dv2 var181 = (Dv2)Ref.g(334241381080505095L, var128);
               int var184 = var9.length();
               Object[] var190 = Registry.emptyArgs();
               long var131 = 542058094445767607L;
               Object[] var130 = var190;
               var190 = Ref.h(542058094445767607L, var130, var131);

               try {
                  var190 = (String)var190;
               } catch (InvocationTargetException var138) {
                  throw var138.getTargetException();
               }

               var184.setCaretPosition(var6 + var190.length());
               var4 = true;
            }
         }

         var174 = var4;
      }

      if (var174 == null) {
         SwingUtilities.invokeLater(new Tp2(this));
      }

      Registry.lookupField(210701759688696485L).setBoolean(this, true);
      Object var132 = 265132846717086219L;
      ((Dv2)Ref.g(265132846717086219L, var132)).setText("");
   }

   @Override
   public void M() {
      Object var7 = 334241381080505095L;
      String var2 = ((Dv2)Ref.g(334241381080505095L, var7)).getText().trim();
      F();
      Object var9 = 369475678680292668L;
      int var3 = ((JXList)Ref.g(369475678680292668L, var9)).getSelectedIndex();
      L1 var4 = new L1();
      File var10003;
      Object var11 = 633015754028760179L;
      super((String)Ref.g(633015754028760179L, var11));
      String var5 = var10003.getName();
      if (this != null) {
         if (var5.equals("")) {
            var5 = "/";
         }

         Object[] var10004 = Registry.packArgs(var5);
         long var14 = 210061141210088637L;
         Object[] var13 = var10004;
         Ref.h(210061141210088637L, var13, var14);

         try {
            ;
         } catch (InvocationTargetException var28) {
            throw var28.getTargetException();
         }
      }

      Bo4 var29;
      Object var15 = 633015754028760179L;
      super((String)Ref.g(633015754028760179L, var15), "", "", "");
      Bo4 var6 = var29;
      Object[] var10005 = Registry.packArgs(true);
      long var18 = 630093295799717061L;
      Object[] var17 = var10005;
      Ref.h(630093295799717061L, var17, var18);
      Object[] var10006 = Registry.packArgs(Registry.lookupField(565021139729850169L).getInt(null));
      long var20 = 147481797374580173L;
      Object[] var19 = var10006;
      Ref.h(147481797374580173L, var19, var20);

      try {
         ;
      } catch (InvocationTargetException var27) {
         throw var27.getTargetException();
      }

      Object[] var10007 = Registry.packArgs(var6);
      long var22 = 265996831530723583L;
      Object[] var21 = var10007;
      Ref.h(265996831530723583L, var21, var22);

      try {
         ;
      } catch (InvocationTargetException var26) {
         throw var26.getTargetException();
      }

      Object[] var10008 = Registry.packArgs(var4);
      long var24 = 258433177301234697L;
      Object[] var23 = var10008;
      Ref.h(258433177301234697L, var23, var24);

      try {
         ;
      } catch (InvocationTargetException var25) {
         throw var25.getTargetException();
      }
   }

   @Override
   public Dx4_2 k$dx_4() {
      String[] var10000 = F();
      Dx4_2 var2 = new Dx4_2();
      String[] var1 = var10000;
      String var3 = "";
      Object var19 = 529421273455029847L;
      Object var10001 = (SetBackgroundImagePanel)Ref.g(529421273455029847L, var19);
      if (var1 != null) {
         if (var10001 == null) {
            return var2;
         }

         var10001 = this;
         Object var21 = 529421273455029847L;
         SetBackgroundImagePanel var10002 = (SetBackgroundImagePanel)Ref.g(529421273455029847L, var21);
      }

      var10001 = ((SetBackgroundImagePanel)var10001).X$_y_2();
      if (var1 != null) {
         if (var10001 == null) {
            return var2;
         }

         var10001 = this;
         Object var23 = 529421273455029847L;
         ((SetBackgroundImagePanel)Ref.g(529421273455029847L, var23)).X$_y_2();
      }

      Ty2 var4 = ((ConnectionProperty)var10001).M$Ty_2();
      Object[] var167 = Registry.emptyArgs();
      long var26 = 121632250293569146L;
      Object[] var25 = var167;
      var167 = Ref.h(121632250293569146L, var25, var26);

      try {
         var167 = (KV)var167;
      } catch (InvocationTargetException var150) {
         throw var150.getTargetException();
      }

      KV var5 = var167;
      Object var27 = 529421273455029847L;
      Connect_2 var6 = (Connect_2)((SetBackgroundImagePanel)Ref.g(529421273455029847L, var27)).X$_y_2().O$QT();
      Object var29 = 629060125004828245L;
      var3 = (String)Ref.g(629060125004828245L, var29);
      int var10004 = Registry.lookupField(274525916063193125L).getInt(this);
      Object[] var10005 = Registry.lookupField(523789155715726667L).getInt(null);
      if (var1 != null) {
         if (var10004 == var10005) {
            Registry.emptyArgs();
            long var31 = 270389152141252877L;
            Ref.h2(270389152141252877L, var31);
            Object[] var10006 = Registry.emptyArgs();
            long var34 = 306266403902896148L;
            Object[] var33 = var10006;
            Ref.h(306266403902896148L, var33, var34);
            Object[] var10007 = Registry.emptyArgs();
            long var36 = 568950058787001160L;
            Object[] var35 = var10007;
            Ref.h(568950058787001160L, var35, var36);

            try {
               ;
            } catch (InvocationTargetException var149) {
               throw var149.getTargetException();
            }

            ArrayList var8 = new ArrayList();
            Object[] var10008 = Registry.packArgs(var8);
            long var38 = 228847008563462370L;
            Object[] var37 = var10008;
            Ref.h(228847008563462370L, var37, var38);

            try {
               ;
            } catch (InvocationTargetException var148) {
               throw var148.getTargetException();
            }

            HashSet var9 = new HashSet();
            Object[] var10009 = Registry.emptyArgs();
            long var40 = 596400151700218172L;
            Object[] var39 = var10009;
            var10009 = Ref.h(596400151700218172L, var39, var40);

            try {
               var10009 = (ArrayList)var10009;
            } catch (InvocationTargetException var147) {
               throw var147.getTargetException();
            }

            for (L1 var11 : var10009) {
               String var10010 = Registry.emptyArgs();
               long var42 = 542058094445767607L;
               Object[] var41 = var10010;
               var10010 = Ref.h(542058094445767607L, var41, var42);

               try {
                  var10010 = (String)var10010;
               } catch (InvocationTargetException var145) {
                  throw var145.getTargetException();
               }

               String var12 = var10010.trim();
               int var13 = var12.indexOf(b(21387, 4759823690190647694L));
               if (var1 == null) {
                  return var2;
               }

               int var189 = var13;
               if (var1 != null) {
                  if (var13 > -1) {
                     var12 = var12.substring(0, var13);
                  }

                  var189 = var9.contains(var12);
               }

               if (var189 == 0) {
                  L1 var14 = new L1();
                  Object[] var10011 = Registry.packArgs(var12);
                  long var44 = 210061141210088637L;
                  Object[] var43 = var10011;
                  Ref.h(210061141210088637L, var43, var44);

                  try {
                     ;
                  } catch (InvocationTargetException var146) {
                     throw var146.getTargetException();
                  }

                  var8.add(var14);
                  var9.add(var12);
               }

               if (var1 == null) {
                  break;
               }
            }

            if (var1 != null) {
               return var2;
            }
         }

         var10004 = Registry.lookupField(274525916063193125L).getInt(this);
         var10005 = Registry.lookupField(140484109673847197L).getInt(null);
      }

      if (var1 == null) {
         int var7 = var10004 * var10005;
         Object var51 = 633015754028760179L;
         Object[] var170 = Registry.packArgs(Ref.g(633015754028760179L, var51));
         long var54 = 350092885739477578L;
         Object[] var53 = var170;
         var170 = Ref.h(350092885739477578L, var53, var54);

         try {
            var170 = (Long)var170;
         } catch (InvocationTargetException var143) {
            throw var143.getTargetException();
         }

         label461: {
            Long var152 = var170;
            byte var153 = 0;
            if (var152 != null) {
               long var238;
               var173 = (var238 = System.currentTimeMillis() - var152 - (long)var7) == 0L ? 0 : (var238 < 0L ? -1 : 1);
               if (var1 == null) {
                  break label461;
               }

               if (var173 > 0) {
                  var153 = 1;
               }
            }

            var173 = var153;
         }

         if (var173 != 0) {
            Object var55 = 633015754028760179L;
            Object[] var177 = Registry.packArgs(Ref.g(633015754028760179L, var55));
            long var58 = 626289249627883158L;
            Object[] var57 = var177;
            Ref.h(626289249627883158L, var57, var58);

            try {
               ;
            } catch (InvocationTargetException var142) {
               throw var142.getTargetException();
            }
         }

         Object var59 = 633015754028760179L;
         Object[] var178 = Registry.packArgs(Ref.g(633015754028760179L, var59));
         long var62 = 138598731550299272L;
         Object[] var61 = var178;
         var178 = Ref.h(138598731550299272L, var61, var62);

         try {
            var178 = (ArrayList)var178;
         } catch (InvocationTargetException var141) {
            throw var141.getTargetException();
         }

         Object var154 = var178;
         ArrayList var155 = new ArrayList();
         ArrayList var156 = new ArrayList();
         var178 = (Object[])var154;
         if (var1 != null) {
            label508: {
               if (var154 == null) {
                  var178 = var4;
                  Object var63 = 633015754028760179L;
                  Object[] var190 = Registry.packArgs(Ref.g(633015754028760179L, var63));
                  long var66 = 518538851566946290L;
                  Object[] var65 = var190;
                  Ref.h(518538851566946290L, var65, var66);

                  try {
                     ;
                  } catch (InvocationTargetException var140) {
                     throw var140.getTargetException();
                  }

                  Object var67 = 633015754028760179L;
                  Object[] var10012 = Registry.packArgs(Ref.g(633015754028760179L, var67));
                  long var70 = 138598731550299272L;
                  Object[] var69 = var10012;
                  var10012 = Ref.h(138598731550299272L, var69, var70);

                  try {
                     var10012 = (ArrayList)var10012;
                  } catch (InvocationTargetException var139) {
                     throw var139.getTargetException();
                  }

                  var154 = var10012;
                  Iterator var157 = var154.iterator();

                  label510: {
                     while (true) {
                        if (var157.hasNext()) {
                           L1 var160 = (L1)var157.next();
                           var10012 = var160;
                           Object[] var10013 = Registry.emptyArgs();
                           long var72 = 601832064246010504L;
                           Object[] var71 = var10013;
                           var10013 = Ref.h(601832064246010504L, var71, var72);

                           try {
                              var10013 = (Bo4)var10013;
                           } catch (InvocationTargetException var138) {
                              throw var138.getTargetException();
                           }

                           Bo4 var15 = var10013;
                           Object[] var10014 = Registry.emptyArgs();
                           long var74 = 501218482801209672L;
                           Object[] var73 = var10014;
                           var10014 = Ref.h(501218482801209672L, var73, var74);

                           try {
                              var222 = (Integer)var10014;
                           } catch (InvocationTargetException var137) {
                              throw var137.getTargetException();
                           }

                           if (var1 == null) {
                              break;
                           }

                           if (var1 != null && var222 == Registry.lookupField(542137494819116319L).getInt(null)) {
                              Object[] var10016 = Registry.emptyArgs();
                              long var76 = 443113534220408058L;
                              Object[] var75 = var10016;
                              var10016 = Ref.h(443113534220408058L, var75, var76);

                              try {
                                 var10016 = (String)var10016;
                              } catch (InvocationTargetException var136) {
                                 throw var136.getTargetException();
                              }

                              var15.add(var10016);
                              Object[] var10017 = Registry.emptyArgs();
                              long var78 = 496289037481593401L;
                              Object[] var77 = var10017;
                              var10017 = Ref.h(496289037481593401L, var77, var78);

                              try {
                                 var10017 = (String)var10017;
                              } catch (InvocationTargetException var135) {
                                 throw var135.getTargetException();
                              }

                              var15.add(var10017);
                           }

                           if (var1 != null) {
                              continue;
                           }
                        }

                        var10012 = var156;
                        if (var1 == null) {
                           break label510;
                        }

                        var10012 = var156.size();
                        break;
                     }

                     if (var10012 > 0) {
                        Object[] var213 = Registry.packArgs(var156, var155);
                        long var80 = 509411729621493097L;
                        Object[] var79 = var213;
                        Ref.h(509411729621493097L, var79, var80);

                        try {
                           ;
                        } catch (InvocationTargetException var134) {
                           throw var134.getTargetException();
                        }
                     }

                     var10012 = (Object[])var154;
                  }

                  for (L1 var161 : var10012) {
                     Object[] var214 = Registry.emptyArgs();
                     long var82 = 601832064246010504L;
                     Object[] var81 = var214;
                     var214 = Ref.h(601832064246010504L, var81, var82);

                     try {
                        var214 = (Bo4)var214;
                     } catch (InvocationTargetException var128) {
                        throw var128.getTargetException();
                     }

                     Bo4 var163 = var214;
                     Registry.packArgs(var163);
                     long var83 = 488188427062992088L;
                     Object var223 = Ref.h2(488188427062992088L, var83);

                     try {
                        var223 = (Icon)var223;
                     } catch (InvocationTargetException var127) {
                        throw var127.getTargetException();
                     }

                     Icon var16 = (Icon)var223;
                     if (var1 == null) {
                        break label508;
                     }

                     if (var1 != null) {
                        Object[] var10015 = Registry.emptyArgs();
                        long var86 = 501218482801209672L;
                        Object[] var85 = var10015;
                        var10015 = Ref.h(501218482801209672L, var85, var86);

                        try {
                           var227 = (Integer)var10015;
                        } catch (InvocationTargetException var133) {
                           throw var133.getTargetException();
                        }

                        if (var227 == Registry.lookupField(542137494819116319L).getInt(null)) {
                           Object[] var230 = Registry.emptyArgs();
                           long var88 = 463286156757271879L;
                           Object[] var87 = var230;
                           var230 = Ref.h(463286156757271879L, var87, var88);

                           try {
                              var232 = (Boolean)var230;
                           } catch (InvocationTargetException var132) {
                              throw var132.getTargetException();
                           }

                           if (var232) {
                              new StringBuilder();
                              Object[] var10019 = Registry.emptyArgs();
                              long var90 = 542058094445767607L;
                              Object[] var89 = var10019;
                              var10019 = Ref.h(542058094445767607L, var89, var90);

                              try {
                                 var10019 = (String)var10019;
                              } catch (InvocationTargetException var131) {
                                 throw var131.getTargetException();
                              }

                              Object[] var10018 = Registry.packArgs(var161.append((String)var10019).append("/").toString());
                              long var92 = 210061141210088637L;
                              Object[] var91 = var10018;
                              Ref.h(210061141210088637L, var91, var92);

                              try {
                                 ;
                              } catch (InvocationTargetException var130) {
                                 throw var130.getTargetException();
                              }

                              var16 = (Icon)Registry.lookupField(471099731952994576L).get(null);
                           }
                        }

                        Object[] var233 = Registry.packArgs(var16);
                        long var94 = 377795955767356198L;
                        Object[] var93 = var233;
                        Ref.h(377795955767356198L, var93, var94);

                        try {
                           ;
                        } catch (InvocationTargetException var129) {
                           throw var129.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        break;
                     }
                  }

                  Object var95 = 633015754028760179L;
                  Object[] var225 = Registry.packArgs(Ref.g(633015754028760179L, var95), var154);
                  long var98 = 517113347943070025L;
                  Object[] var97 = var225;
                  Ref.h(517113347943070025L, var97, var98);

                  try {
                     ;
                  } catch (InvocationTargetException var126) {
                     throw var126.getTargetException();
                  }
               }

               var178 = var5;
               Object var99 = 633015754028760179L;
               Object[] var191 = Registry.packArgs(Ref.g(633015754028760179L, var99));
               long var102 = 138598731550299272L;
               Object[] var101 = var191;
               var191 = Ref.h(138598731550299272L, var101, var102);

               try {
                  var191 = (ArrayList)var191;
               } catch (InvocationTargetException var125) {
                  throw var125.getTargetException();
               }

               var154 = var191;
            }

            new ArrayList();
         }

         Object var159 = var178;

         label412: {
            for (L1 var164 : var154) {
               Object[] var184 = Registry.emptyArgs();
               long var104 = 601832064246010504L;
               Object[] var103 = var184;
               var184 = Ref.h(601832064246010504L, var103, var104);

               try {
                  var184 = (Bo4)var184;
               } catch (InvocationTargetException var121) {
                  throw var121.getTargetException();
               }

               Bo4 var165 = var184;
               Object[] var194 = Registry.emptyArgs();
               long var106 = 223441152106059427L;
               Object[] var105 = var194;
               var194 = Ref.h(223441152106059427L, var105, var106);

               try {
                  var194 = (String)var194;
               } catch (InvocationTargetException var120) {
                  throw var120.getTargetException();
               }

               String var17 = var194;
               Object var18 = false;
               if (var1 == null) {
                  break label412;
               }

               var194 = var17.equals(".");
               label408:
               if (var1 != null) {
                  if (var194 == null) {
                     var194 = var17.equals(b(-6463, 26881));
                     if (var1 == null) {
                        break label408;
                     }

                     label404:
                     if (var194 == null) {
                        var194 = Registry.emptyArgs();
                        long var107 = 270389152141252877L;
                        Ref.h2(270389152141252877L, var107);
                        Object[] var207 = Registry.emptyArgs();
                        long var110 = 306266403902896148L;
                        Object[] var109 = var207;
                        Ref.h(306266403902896148L, var109, var110);
                        Object[] var217 = Registry.emptyArgs();
                        long var112 = 406341430347663460L;
                        Object[] var111 = var217;
                        var217 = Ref.h(406341430347663460L, var111, var112);

                        try {
                           var217 = (Boolean)var217;
                        } catch (InvocationTargetException var124) {
                           throw var124.getTargetException();
                        }

                        if (var1 != null) {
                           if (var217 == null) {
                              boolean var220 = var17.startsWith(".");
                              if (var1 == null) {
                                 break label408;
                              }

                              if (var220) {
                                 break label404;
                              }

                              var18 = true;
                              if (var1 != null) {
                                 break label404;
                              }
                           }

                           var217 = true;
                        }

                        var18 = var217;
                     }
                  }

                  var194 = Registry.lookupField(532893860934733004L).getBoolean(this);
               }

               label389:
               if (var1 != null) {
                  if (var194 == null) {
                     var194 = var165;
                     Object[] var199 = Registry.emptyArgs();
                     long var114 = 613149096811612676L;
                     Object[] var113 = var199;
                     var199 = Ref.h(613149096811612676L, var113, var114);

                     try {
                        var201 = (Boolean)var199;
                     } catch (InvocationTargetException var123) {
                        throw var123.getTargetException();
                     }

                     if (var1 == null) {
                        break label389;
                     }

                     if (!var201) {
                        Object[] var208 = Registry.emptyArgs();
                        long var116 = 463286156757271879L;
                        Object[] var115 = var208;
                        var208 = Ref.h(463286156757271879L, var115, var116);

                        try {
                           var210 = (Boolean)var208;
                        } catch (InvocationTargetException var122) {
                           throw var122.getTargetException();
                        }

                        if (var1 == null) {
                           break label389;
                        }

                        if (!var210) {
                           var18 = false;
                        }
                     }
                  }

                  var194 = (Object[])var18;
               }

               if (var1 != null && var194 != false) {
                  var159.add(var164);
               }

               if (var1 == null) {
                  break;
               }
            }

            var154 = var159;
         }

         label364: {
            Object var198 = var154;
            if (var1 != null) {
               if (var154 != null) {
                  break label364;
               }

               var198 = new ArrayList();
            }

            var154 = var198;
         }

         Object[] var202 = Registry.packArgs(var154);
         long var118 = 228847008563462370L;
         Object[] var117 = var202;
         Ref.h(228847008563462370L, var117, var118);

         try {
            ;
         } catch (InvocationTargetException var119) {
            throw var119.getTargetException();
         }

         return var2;
      } else if (var10004 != var10005) {
         return var2;
      } else {
         var10004 = b(13089, 5634008427771105585L);
         var10005 = Registry.emptyArgs();
         long var45 = 270389152141252877L;
         Ref.h2(270389152141252877L, var45);
         Object[] var174 = Registry.emptyArgs();
         long var48 = 306266403902896148L;
         Object[] var47 = var174;
         Ref.h(306266403902896148L, var47, var48);
         Object[] var175 = Registry.emptyArgs();
         long var50 = 480629603857374647L;
         Object[] var49 = var175;
         var175 = Ref.h(480629603857374647L, var49, var50);

         label339:
         try {
            break label339;
         } catch (InvocationTargetException var144) {
            throw var144.getTargetException();
         }
      }
   }

   @Override
   public Dx4_2 n() {
      return new Dx4_2();
   }

   @Override
   public boolean p(L1 var1) {
      return true;
   }

   @Override
   public String c() {
      Object var1 = 265132846717086219L;
      return ((Dv2)Ref.g(265132846717086219L, var1)).getText().trim();
   }

   @Override
   public void Q(L1 var1, int var2) {
   }

   public boolean l() {
      return Registry.lookupField(509191499826884596L).getBoolean(this);
   }

   public void D(boolean var1) {
      Registry.lookupField(509191499826884596L).setBoolean(this, var1);
      Object var2 = 201390987714459017L;
      ((JLabel)Ref.g(201390987714459017L, var2)).setVisible(var1);
   }

   @Override
   public void h() {
      long var2 = 529421273455029847L;
      Object var1 = null;
      Ref.s(529421273455029847L, var1, var2);
      long var4 = 449876613200166173L;
      Object var3 = null;
      Ref.s(449876613200166173L, var3, var4);
      long var6 = 629060125004828245L;
      Object var5 = null;
      Ref.s(629060125004828245L, var5, var6);
      long var8 = 316737507384357237L;
      Object var7 = null;
      Ref.s(316737507384357237L, var7, var8);
      long var10 = 201390987714459017L;
      Object var9 = null;
      Ref.s(201390987714459017L, var9, var10);
      long var12 = 262854881355003610L;
      Object var11 = null;
      Ref.s(262854881355003610L, var11, var12);
      long var14 = 633015754028760179L;
      Object var13 = null;
      Ref.s(633015754028760179L, var13, var14);
      long var16 = 216313497050019341L;
      Object var15 = null;
      Ref.s(216313497050019341L, var15, var16);
   }

   @Override
   public void K$void() {
      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10001 = Registry.packArgs(new N5(this), Registry.lookupField(222883478649268280L).getInt(null));
      long var2 = 266288712085965362L;
      Object[] var1 = var10001;
      Ref.h(266288712085965362L, var1, var2);
   }

   public static Dv2 l(Backspace var0) {
      Object var1 = 334241381080505095L;
      return (Dv2)Ref.g(334241381080505095L, var1);
   }

   public static Dv2 E(Backspace var0) {
      Object var1 = 265132846717086219L;
      return (Dv2)Ref.g(265132846717086219L, var1);
   }

   static {
      __vfClinit__();
   }

   public static void U(String[] var0) {
      hU = var0;
   }

   public static String[] F() {
      return hU;
   }

   public static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   public static String b(int var0, int var1) {
      int var2 = (var0 ^ -6459) & 65535;
      if (db[var2] == null) {
         char[] var3 = cb[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 24;
               break;
            case 1:
               var10000 = 210;
               break;
            case 2:
               var10000 = 203;
               break;
            case 3:
               var10000 = 174;
               break;
            case 4:
               var10000 = 16;
               break;
            case 5:
               var10000 = 92;
               break;
            case 6:
               var10000 = 4;
               break;
            case 7:
               var10000 = 119;
               break;
            case 8:
               var10000 = 114;
               break;
            case 9:
               var10000 = 105;
               break;
            case 10:
               var10000 = 133;
               break;
            case 11:
               var10000 = 251;
               break;
            case 12:
               var10000 = 135;
               break;
            case 13:
               var10000 = 145;
               break;
            case 14:
               var10000 = 74;
               break;
            case 15:
               var10000 = 250;
               break;
            case 16:
               var10000 = 162;
               break;
            case 17:
               var10000 = 111;
               break;
            case 18:
               var10000 = 60;
               break;
            case 19:
               var10000 = 102;
               break;
            case 20:
               var10000 = 83;
               break;
            case 21:
               var10000 = 193;
               break;
            case 22:
               var10000 = 51;
               break;
            case 23:
               var10000 = 184;
               break;
            case 24:
               var10000 = 198;
               break;
            case 25:
               var10000 = 157;
               break;
            case 26:
               var10000 = 227;
               break;
            case 27:
               var10000 = 214;
               break;
            case 28:
               var10000 = 216;
               break;
            case 29:
               var10000 = 204;
               break;
            case 30:
               var10000 = 88;
               break;
            case 31:
               var10000 = 107;
               break;
            case 32:
               var10000 = 63;
               break;
            case 33:
               var10000 = 69;
               break;
            case 34:
               var10000 = 245;
               break;
            case 35:
               var10000 = 71;
               break;
            case 36:
               var10000 = 177;
               break;
            case 37:
               var10000 = 47;
               break;
            case 38:
               var10000 = 121;
               break;
            case 39:
               var10000 = 78;
               break;
            case 40:
               var10000 = 115;
               break;
            case 41:
               var10000 = 182;
               break;
            case 42:
               var10000 = 179;
               break;
            case 43:
               var10000 = 87;
               break;
            case 44:
               var10000 = 2;
               break;
            case 45:
               var10000 = 136;
               break;
            case 46:
               var10000 = 123;
               break;
            case 47:
               var10000 = 97;
               break;
            case 48:
               var10000 = 35;
               break;
            case 49:
               var10000 = 34;
               break;
            case 50:
               var10000 = 93;
               break;
            case 51:
               var10000 = 39;
               break;
            case 52:
               var10000 = 137;
               break;
            case 53:
               var10000 = 156;
               break;
            case 54:
               var10000 = 147;
               break;
            case 55:
               var10000 = 90;
               break;
            case 56:
               var10000 = 59;
               break;
            case 57:
               var10000 = 82;
               break;
            case 58:
               var10000 = 143;
               break;
            case 59:
               var10000 = 238;
               break;
            case 60:
               var10000 = 176;
               break;
            case 61:
               var10000 = 163;
               break;
            case 62:
               var10000 = 42;
               break;
            case 63:
               var10000 = 201;
               break;
            case 64:
               var10000 = 85;
               break;
            case 65:
               var10000 = 53;
               break;
            case 66:
               var10000 = 232;
               break;
            case 67:
               var10000 = 225;
               break;
            case 68:
               var10000 = 175;
               break;
            case 69:
               var10000 = 106;
               break;
            case 70:
               var10000 = 226;
               break;
            case 71:
               var10000 = 76;
               break;
            case 72:
               var10000 = 61;
               break;
            case 73:
               var10000 = 65;
               break;
            case 74:
               var10000 = 101;
               break;
            case 75:
               var10000 = 239;
               break;
            case 76:
               var10000 = 14;
               break;
            case 77:
               var10000 = 172;
               break;
            case 78:
               var10000 = 54;
               break;
            case 79:
               var10000 = 3;
               break;
            case 80:
               var10000 = 64;
               break;
            case 81:
               var10000 = 73;
               break;
            case 82:
               var10000 = 12;
               break;
            case 83:
               var10000 = 186;
               break;
            case 84:
               var10000 = 6;
               break;
            case 85:
               var10000 = 138;
               break;
            case 86:
               var10000 = 81;
               break;
            case 87:
               var10000 = 32;
               break;
            case 88:
               var10000 = 43;
               break;
            case 89:
               var10000 = 220;
               break;
            case 90:
               var10000 = 146;
               break;
            case 91:
               var10000 = 139;
               break;
            case 92:
               var10000 = 25;
               break;
            case 93:
               var10000 = 49;
               break;
            case 94:
               var10000 = 144;
               break;
            case 95:
               var10000 = 124;
               break;
            case 96:
               var10000 = 13;
               break;
            case 97:
               var10000 = 104;
               break;
            case 98:
               var10000 = 173;
               break;
            case 99:
               var10000 = 207;
               break;
            case 100:
               var10000 = 211;
               break;
            case 101:
               var10000 = 252;
               break;
            case 102:
               var10000 = 19;
               break;
            case 103:
               var10000 = 235;
               break;
            case 104:
               var10000 = 75;
               break;
            case 105:
               var10000 = 168;
               break;
            case 106:
               var10000 = 68;
               break;
            case 107:
               var10000 = 129;
               break;
            case 108:
               var10000 = 45;
               break;
            case 109:
               var10000 = 183;
               break;
            case 110:
               var10000 = 33;
               break;
            case 111:
               var10000 = 17;
               break;
            case 112:
               var10000 = 206;
               break;
            case 113:
               var10000 = 167;
               break;
            case 114:
               var10000 = 148;
               break;
            case 115:
               var10000 = 132;
               break;
            case 116:
               var10000 = 120;
               break;
            case 117:
               var10000 = 150;
               break;
            case 118:
               var10000 = 246;
               break;
            case 119:
               var10000 = 80;
               break;
            case 120:
               var10000 = 99;
               break;
            case 121:
               var10000 = 160;
               break;
            case 122:
               var10000 = 158;
               break;
            case 123:
               var10000 = 219;
               break;
            case 124:
               var10000 = 141;
               break;
            case 125:
               var10000 = 212;
               break;
            case 126:
               var10000 = 94;
               break;
            case 127:
               var10000 = 202;
               break;
            case 128:
               var10000 = 95;
               break;
            case 129:
               var10000 = 166;
               break;
            case 130:
               var10000 = 171;
               break;
            case 131:
               var10000 = 233;
               break;
            case 132:
               var10000 = 8;
               break;
            case 133:
               var10000 = 142;
               break;
            case 134:
               var10000 = 195;
               break;
            case 135:
               var10000 = 127;
               break;
            case 136:
               var10000 = 56;
               break;
            case 137:
               var10000 = 15;
               break;
            case 138:
               var10000 = 29;
               break;
            case 139:
               var10000 = 125;
               break;
            case 140:
               var10000 = 11;
               break;
            case 141:
               var10000 = 241;
               break;
            case 142:
               var10000 = 116;
               break;
            case 143:
               var10000 = 164;
               break;
            case 144:
               var10000 = 249;
               break;
            case 145:
               var10000 = 5;
               break;
            case 146:
               var10000 = 91;
               break;
            case 147:
               var10000 = 189;
               break;
            case 148:
               var10000 = 169;
               break;
            case 149:
               var10000 = 67;
               break;
            case 150:
               var10000 = 188;
               break;
            case 151:
               var10000 = 196;
               break;
            case 152:
               var10000 = 110;
               break;
            case 153:
               var10000 = 44;
               break;
            case 154:
               var10000 = 23;
               break;
            case 155:
               var10000 = 213;
               break;
            case 156:
               var10000 = 217;
               break;
            case 157:
               var10000 = 30;
               break;
            case 158:
               var10000 = 58;
               break;
            case 159:
               var10000 = 21;
               break;
            case 160:
               var10000 = 192;
               break;
            case 161:
               var10000 = 46;
               break;
            case 162:
               var10000 = 22;
               break;
            case 163:
               var10000 = 109;
               break;
            case 164:
               var10000 = 72;
               break;
            case 165:
               var10000 = 230;
               break;
            case 166:
               var10000 = 77;
               break;
            case 167:
               var10000 = 112;
               break;
            case 168:
               var10000 = 48;
               break;
            case 169:
               var10000 = 40;
               break;
            case 170:
               var10000 = 134;
               break;
            case 171:
               var10000 = 215;
               break;
            case 172:
               var10000 = 38;
               break;
            case 173:
               var10000 = 62;
               break;
            case 174:
               var10000 = 10;
               break;
            case 175:
               var10000 = 222;
               break;
            case 176:
               var10000 = 223;
               break;
            case 177:
               var10000 = 236;
               break;
            case 178:
               var10000 = 7;
               break;
            case 179:
               var10000 = 66;
               break;
            case 180:
               var10000 = 187;
               break;
            case 181:
               var10000 = 128;
               break;
            case 182:
               var10000 = 41;
               break;
            case 183:
               var10000 = 98;
               break;
            case 184:
               var10000 = 197;
               break;
            case 185:
               var10000 = 194;
               break;
            case 186:
               var10000 = 27;
               break;
            case 187:
               var10000 = 180;
               break;
            case 188:
               var10000 = 224;
               break;
            case 189:
               var10000 = 191;
               break;
            case 190:
               var10000 = 31;
               break;
            case 191:
               var10000 = 89;
               break;
            case 192:
               var10000 = 52;
               break;
            case 193:
               var10000 = 96;
               break;
            case 194:
               var10000 = 240;
               break;
            case 195:
               var10000 = 161;
               break;
            case 196:
               var10000 = 165;
               break;
            case 197:
               var10000 = 130;
               break;
            case 198:
               var10000 = 79;
               break;
            case 199:
               var10000 = 122;
               break;
            case 200:
               var10000 = 20;
               break;
            case 201:
               var10000 = 103;
               break;
            case 202:
               var10000 = 221;
               break;
            case 203:
               var10000 = 228;
               break;
            case 204:
               var10000 = 151;
               break;
            case 205:
               var10000 = 248;
               break;
            case 206:
               var10000 = 255;
               break;
            case 207:
               var10000 = 185;
               break;
            case 208:
               var10000 = 178;
               break;
            case 209:
               var10000 = 149;
               break;
            case 210:
               var10000 = 231;
               break;
            case 211:
               var10000 = 234;
               break;
            case 212:
               var10000 = 113;
               break;
            case 213:
               var10000 = 155;
               break;
            case 214:
               var10000 = 57;
               break;
            case 215:
               var10000 = 153;
               break;
            case 216:
               var10000 = 26;
               break;
            case 217:
               var10000 = 18;
               break;
            case 218:
               var10000 = 0;
               break;
            case 219:
               var10000 = 55;
               break;
            case 220:
               var10000 = 205;
               break;
            case 221:
               var10000 = 1;
               break;
            case 222:
               var10000 = 70;
               break;
            case 223:
               var10000 = 170;
               break;
            case 224:
               var10000 = 190;
               break;
            case 225:
               var10000 = 108;
               break;
            case 226:
               var10000 = 37;
               break;
            case 227:
               var10000 = 199;
               break;
            case 228:
               var10000 = 244;
               break;
            case 229:
               var10000 = 209;
               break;
            case 230:
               var10000 = 181;
               break;
            case 231:
               var10000 = 152;
               break;
            case 232:
               var10000 = 86;
               break;
            case 233:
               var10000 = 50;
               break;
            case 234:
               var10000 = 154;
               break;
            case 235:
               var10000 = 131;
               break;
            case 236:
               var10000 = 159;
               break;
            case 237:
               var10000 = 126;
               break;
            case 238:
               var10000 = 36;
               break;
            case 239:
               var10000 = 200;
               break;
            case 240:
               var10000 = 253;
               break;
            case 241:
               var10000 = 118;
               break;
            case 242:
               var10000 = 117;
               break;
            case 243:
               var10000 = 247;
               break;
            case 244:
               var10000 = 242;
               break;
            case 245:
               var10000 = 208;
               break;
            case 246:
               var10000 = 9;
               break;
            case 247:
               var10000 = 229;
               break;
            case 248:
               var10000 = 243;
               break;
            case 249:
               var10000 = 84;
               break;
            case 250:
               var10000 = 28;
               break;
            case 251:
               var10000 = 237;
               break;
            case 252:
               var10000 = 100;
               break;
            case 253:
               var10000 = 254;
               break;
            case 254:
               var10000 = 218;
               break;
            default:
               var10000 = 140;
         }

         short var4 = var10000;
         int var5 = (var1 & 0xFF) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & 65535) >>> 8) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & 0xFF;
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & 0xFF;
            }
         }

         db[var2] = new String(var3).intern();
      }

      return db[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8725;
      if (hb[var3] == null) {
         hb[var3] = (int)(gb[var3] ^ var1);
      }

      return hb[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      String[] var13 = new String[9];
      String[] var10000 = new String[3];
      int var11 = 0;
      String var10 = "gá\u0002\u0080à\u0002ò&\r³Ü@_[|\\\u0096-\u0013\u008aIP\u0002Dl\u0002`ù\u0003盨忞Å";
      int var12 = "gá\u0002\u0080à\u0002ò&\r³Ü@_[|\\\u0096-\u0013\u008aIP\u0002Dl\u0002`ù\u0003盨忞Å".length();
      char var9 = 2;
      int var17 = -1;
      U(var10000);

      label70:
      while (true) {
         byte var18 = 112;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var40 = var10001.toCharArray();
               int var10004 = var40.length;
               int var14 = 0;
               byte var43 = var18;
               var34 = var40;
               int var25 = var10004;
               byte var50;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               } else {
                  var43 = var18;
                  var25 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var56 = var40;
                  var50 = var18;
                  var10006 = var14;
               }

               while (true) {
                  char var65 = var56[var10006];
                  byte var66;
                  switch (var14 % 7) {
                     case 0:
                        var66 = 22;
                        break;
                     case 1:
                        var66 = 70;
                        break;
                     case 2:
                        var66 = 119;
                        break;
                     case 3:
                        var66 = 66;
                        break;
                     case 4:
                        var66 = 67;
                        break;
                     case 5:
                        var66 = 123;
                        break;
                     default:
                        var66 = 126;
                  }

                  var56[var10006] = (char)(var65 ^ var50 ^ var66);
                  var14++;
                  if (var43 == 0) {
                     var10006 = var43;
                     var56 = var34;
                     var50 = var43;
                  } else {
                     if (var25 <= var14) {
                        break;
                     }

                     var56 = var34;
                     var50 = var43;
                     var10006 = var14;
                  }
               }
            }

            String var45 = new String(var34).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var45;
                  if ((var17 += var9) >= var12) {
                     cb = var13;
                     db = new String[9];
                     long var0 = 7214729063298295932L;
                     long[] var6 = new long[19];
                     int var3 = 0;
                     String var4 = "å4êXÉ7\u009dÛÜ\u0018~Ù\u008a[\u0002«(ö7\u0001w;¶Ü\u0099Ù\u0014H|àÏ\u0080uÓf \u0005Æc±¡\u0095ìÙ\u000eN\u0093-bø\u0014¼\u009aì8)§´4n*d¾Ël\n6\u000eì+ \u0090\u009a|uÆZ\u0081\"ÿ´\u0015)4f¤søâÄèììMKñ\u00adøó¯\u008dÁ¼ x©CRIÿ\b\u0018 xTÍ\u001a9ø\u0003U\"Ïµ&³òã'\u009b\u0093ÔïÙ\u0099Ò";
                     int var5 = "å4êXÉ7\u009dÛÜ\u0018~Ù\u008a[\u0002«(ö7\u0001w;¶Ü\u0099Ù\u0014H|àÏ\u0080uÓf \u0005Æc±¡\u0095ìÙ\u000eN\u0093-bø\u0014¼\u009aì8)§´4n*d¾Ël\n6\u000eì+ \u0090\u009a|uÆZ\u0081\"ÿ´\u0015)4f¤søâÄèììMKñ\u00adøó¯\u008dÁ¼ x©CRIÿ\b\u0018 xTÍ\u001a9ø\u0003U\"Ïµ&³òã'\u009b\u0093ÔïÙ\u0099Ò"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var27 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        long[] var20 = var6;
                        int var28 = var3++;
                        long var38 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var46 = -1;

                        while (true) {
                           long var55 = var38 ^ var0;
                           switch (var46) {
                              case 0:
                                 var20[var28] = var55;
                                 if (var2 >= var5) {
                                    gb = var6;
                                    hb = new Integer[19];
                                    Registry.lookupField(523789155715726667L).setInt(null, 1);
                                    Registry.lookupField(521652223682077525L).setInt(null, b(18625, 7194977137819904725L));
                                    Registry.lookupField(140484109673847197L).setInt(null, b(29580, 6295536606421701000L));
                                    return;
                                 }
                                 break;
                              default:
                                 var20[var28] = var55;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "ï\u0081\u0001* ¯9÷ÆUêÙh\u0017\u0014\u0003";
                                 var5 = "ï\u0081\u0001* ¯9÷ÆUêÙh\u0017\u0014\u0003".length();
                                 var2 = 0;
                           }

                           byte var29 = var2;
                           var2 += 8;
                           var7 = var4.substring(var29, var2).getBytes("ISO-8859-1");
                           var20 = var6;
                           var28 = var3++;
                           var38 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var46 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var45;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "LÝ5w\u0017Ëè}Ü镛\u0097齭桬匌镝È亟络皛忎\u0002Vl";
                  var12 = "LÝ5w\u0017Ëè}Ü镛\u0097齭桬匌镝È亟络皛忎\u0002Vl".length();
                  var9 = 20;
                  var17 = -1;
            }

            var18 = 73;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}






