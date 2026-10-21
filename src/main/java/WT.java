import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

public class WT extends JDialog implements CH {
   fl_4 g;
   JTextArea I;
   boolean C;
   JButton G;
   JButton i;
   JButton F;
   JTextArea h;
   JScrollPane O;
   boolean L;
   final int a;
   boolean d;
   boolean p;
   long D;
   private static String[] b;
   private static final String[] c;
   private static final String[] e;
   private static final long[] f;
   private static final Integer[] j;
   private static final long k;

   public WT(JFrame var1, fl_4 var2) {
      String[] var3;
      label68: {
         super();
         String[] var10000 = y();
         com.c.c(356414783958618676L).setBoolean(this, false);
         com.c.c(557137373509279378L).setBoolean(this, true);
         this.a = a(30823, 5309129010538402951L);
         com.c.c(131753499707603434L).setBoolean(this, false);
         com.c.c(509757470572563007L).setBoolean(this, false);
         long var10001 = k;
         com.c.c(633275544900052147L).setLong(this, var10001);
         this.setDefaultCloseOperation(0);
         this.setTitle(a(25129, 11465));
         com.c.c(354794456661762655L).set(this, var2);
         JPanel var4 = (JPanel)this.getContentPane();
         var4.setLayout(new MigLayout(a(25139, 14069), "", ""));
         com.c.c(246965589172664073L).set(this, new JTextArea());
         ((JTextArea)com.c.c(246965589172664073L).get(this)).setOpaque(false);
         ((JTextArea)com.c.c(246965589172664073L).get(this)).setEditable(false);
         ((JTextArea)com.c.c(246965589172664073L).get(this)).setRows(2);
         var4.add((JTextArea)com.c.c(246965589172664073L).get(this), a(25147, -25713));
         JPanel var5 = new JPanel();
         var5.setLayout(new MigLayout(a(25146, 1422), "", a(25149, -1854)));
         var4.add(var5, a(25141, -29311));
         com.c.c(431024753703482543L).set(this, new JButton(a(25143, 19346)));
         var3 = var10000;
         ((JButton)com.c.c(431024753703482543L).get(this)).addActionListener(new zE(this));
         var5.add((JButton)com.c.c(431024753703482543L).get(this), a(25138, 12476));
         com.c.c(484654819353749686L).set(this, new JButton(a(25128, 12849)));
         ((JButton)com.c.c(484654819353749686L).get(this)).addActionListener(new ux_4(this, var2));
         var5.add((JButton)com.c.c(484654819353749686L).get(this), a(25150, -12310));
         com.c.c(497567577586291331L).set(this, new JButton(a(25140, 10324)));
         ((JButton)com.c.c(497567577586291331L).get(this)).addActionListener(new oX_3(this, var2));
         var5.add((JButton)com.c.c(497567577586291331L).get(this), a(25150, -12310));
         if (var3 == null) {
            Object[] var12 = com.c.f();
            Method var13 = com.c.d(561847341732101275L);
            Object[] var36 = var12;
            Object var25 = null;

            try {
               var14 = (Boolean)var13.invoke(var25, var36);
            } catch (InvocationTargetException var11) {
               throw var11.getTargetException();
            }

            if (!var14) {
               Object[] var15 = com.c.f();
               Method var16 = com.c.d(454647487873911743L);
               var36 = var15;
               Object var27 = null;

               try {
                  var17 = (Boolean)var16.invoke(var27, var36);
               } catch (InvocationTargetException var10) {
                  throw var10.getTargetException();
               }

               if (!var17) {
                  break label68;
               }
            }

            com.c.c(209593506021318868L).set(this, new JTextArea());
            com.c.c(160285884699057566L).set(this, new JScrollPane((JTextArea)com.c.c(209593506021318868L).get(this)));
            ((JScrollPane)com.c.c(160285884699057566L).get(this)).setBorder(BorderFactory.createTitledBorder(a(25142, 10458)));
         }

         var4.add((JScrollPane)com.c.c(160285884699057566L).get(this), a(25145, -31820));
      }

      Object[] var28 = com.c.f();
      Method var10003 = com.c.d(448870905616495851L);
      Object[] var39 = var28;
      WT var29 = this;
      Method var18 = var10003;

      try {
         var18.invoke(var29, var39);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      this.pack();
      Method var19 = (Method)com.c.c(388376917454860932L).get(null);
      var28 = com.c.a(new zy_2(this));
      var10003 = com.c.d(434592463220957006L);
      var39 = var28;
      var28 = var19;
      var19 = var10003;

      try {
         var19.invoke(var28, var39);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      var19 = (Method)com.c.c(388376917454860932L).get(null);
      var28 = com.c.a(new K4(this), a(4061, 7262940743782900543L));
      var10003 = com.c.d(201859364639460244L);
      var39 = var28;
      var28 = var19;
      var19 = var10003;

      try {
         var19.invoke(var28, var39);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var28 = com.c.a("");
      var10003 = com.c.d(585355110671849242L);
      var39 = var28;
      WT var35 = this;
      var19 = var10003;

      try {
         var19.invoke(var35, var39);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var3 != null) {
         com.ky_4.K(new String[4]);
      }
   }

   @Override
   public void d(String var1) {
      SwingUtilities.invokeLater(new au_2(this, var1));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void I(JTextArea var1) {
      String[] var10000 = y();
      int var3 = var1.getLineCount() - a(11841, 8627037662698472096L);
      String[] var2 = var10000;

      label30: {
         label29: {
            try {
               var9 = var3;
               if (var2 != null) {
                  break label29;
               }

               if (var3 <= 0) {
                  return;
               }
            } catch (BadLocationException var7) {
               throw a(var7);
            }

            try {
               var9 = var1.getLineEndOffset(var3 - 1);
            } catch (BadLocationException var6) {
               var10 = var6;
               boolean var10001 = false;
               break label30;
            }
         }

         try {
            int var8 = var9;
            var1.replaceRange("", 0, var8);
            return;
         } catch (BadLocationException var5) {
            var10 = var5;
            boolean var11 = false;
         }
      }

      BadLocationException var4 = var10;
      var4.printStackTrace();
   }

   void N(String var1) {
      String[] var10000 = y();
      ((JTextArea)com.c.c(209593506021318868L).get(this)).append(var1);
      Object[] var10002 = com.c.a(com.c.c(209593506021318868L).get(this));
      Method var10004 = com.c.d(584802178139769689L);
      Object[] var10003 = var10002;
      WT var6 = this;
      Method var10001 = var10004;

      try {
         var10001.invoke(var6, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      String[] var2 = var10000;
      WT var5 = this;
      if (var2 == null) {
         if (!com.c.c(557137373509279378L).getBoolean(this)) {
            return;
         }

         var5 = this;
      }

      JScrollBar var3 = ((JScrollPane)com.c.c(160285884699057566L).get(var5)).getVerticalScrollBar();
      var3.setValue(var3.getMaximum());
   }

   public void C() {
      String[] var1 = y();
      long var20;
      int var10000 = (var20 = System.currentTimeMillis() - com.c.c(633275544900052147L).getLong(this)) == 0L ? 0 : (var20 < 0L ? -1 : 1);
      if (var1 == null) {
         if (var10000 <= 0) {
            return;
         }

         Object[] var5 = com.c.f();
         Method var6 = com.c.d(561847341732101275L);
         Object[] var16 = var5;
         Object var11 = null;

         try {
            var10000 = (Boolean)var6.invoke(var11, var16);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }

      if (var10000 == 0) {
         Object var7 = com.c.c(354794456661762655L).get(this);
         Object[] var12 = com.c.f();
         Method var10003 = com.c.d(119751058421524022L);
         Object[] var17 = var12;
         var12 = (Object[])var7;
         Method var8 = var10003;

         try {
            var8.invoke(var12, var17);
         } catch (InvocationTargetException var3) {
            throw var3.getTargetException();
         }

         if (var1 == null) {
            return;
         }
      }

      Object var9 = com.c.c(354794456661762655L).get(this);
      Object[] var14 = com.c.f();
      Method var19 = com.c.d(119751058421524022L);
      Object[] var18 = var14;
      var14 = (Object[])var9;
      Method var10 = var19;

      try {
         var10.invoke(var14, var18);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void setVisible(boolean var1) {
      String[] var10000 = y();
      boolean var3 = this.isVisible();
      super.setVisible(var1);
      String[] var2 = var10000;
      boolean var5 = var1;
      if (var2 == null) {
         if (var1) {
            com.c.c(356414783958618676L).setBoolean(this, true);
            this.toFront();
            this.requestFocus();
         }

         var5 = var3;
      }

      if (var2 == null) {
         if (var5) {
            return;
         }

         var5 = var1;
      }

      if (var2 == null) {
         if (!var5) {
            return;
         }

         var5 = ((JButton)com.c.c(484654819353749686L).get(this)).isEnabled();
      }

      if (var5) {
         var10000 = (String[])com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new YD(this));
         Method var10003 = com.c.d(434592463220957006L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var7 = var10003;

         try {
            var7.invoke(var10001, var10002);
         } catch (InvocationTargetException var4) {
            throw var4.getTargetException();
         }
      }
   }

   void N() {
      String[] var10000 = y();
      String var2 = a(25131, 20027);
      Method var10001 = (Method)com.c.c(354794456661762655L).get(this);
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(187528749319748416L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var71 = (Y7)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var36) {
         throw var36.getTargetException();
      }

      Y7 var3 = var71;
      var10001 = (Method)com.c.c(354794456661762655L).get(this);
      var10002 = com.c.f();
      var10004 = com.c.d(384899068105386845L);
      var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var74 = (String)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      String var4 = var74;
      String[] var1 = var10000;
      if (var3 != null) {
         var10000 = (String[])com.c.c(354794456661762655L).get(this);
         Object[] var75 = com.c.f();
         Method var200 = com.c.d(262117569331123961L);
         var10002 = var75;
         var10001 = var10000;
         Method var38 = var200;

         try {
            var39 = (Boolean)var38.invoke(var10001, var10002);
         } catch (InvocationTargetException var34) {
            throw var34.getTargetException();
         }

         label475: {
            if (var1 == null) {
               if (var39) {
                  var2 = a(25137, 10635);
                  if (var1 == null) {
                     break label475;
                  }
               }

               var10000 = (String[])com.c.c(354794456661762655L).get(this);
               Object[] var77 = com.c.f();
               Method var201 = com.c.d(478235290671807435L);
               var10002 = var77;
               var10001 = var10000;
               Method var41 = var201;

               try {
                  var39 = (Boolean)var41.invoke(var10001, var10002);
               } catch (InvocationTargetException var33) {
                  throw var33.getTargetException();
               }
            }

            if (var1 == null) {
               if (!var39) {
                  break label475;
               }

               var10000 = (String[])com.c.c(354794456661762655L).get(this);
               Object[] var79 = com.c.f();
               Method var202 = com.c.d(494928284843292484L);
               var10002 = var79;
               var10001 = var10000;
               Method var43 = var202;

               try {
                  var39 = (Boolean)var43.invoke(var10001, var10002);
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }
            }

            if (var1 == null) {
               if (var39) {
                  if (var3 != null) {
                     StringBuilder var44 = new StringBuilder().append(a(25148, -15329));
                     var10002 = com.c.f();
                     var10004 = com.c.d(226996047220245423L);
                     var10003 = var10002;
                     Y7 var151 = var3;
                     var10001 = var10004;

                     try {
                        var82 = (String)var10001.invoke(var151, var10003);
                     } catch (InvocationTargetException var31) {
                        throw var31.getTargetException();
                     }

                     var2 = var44.append(var82).append("\n").toString();
                  }

                  var10000 = (String[])com.c.c(354794456661762655L).get(this);
                  Object[] var83 = com.c.f();
                  Method var204 = com.c.d(529735557312904033L);
                  var10002 = var83;
                  var10001 = var10000;
                  Method var46 = var204;

                  try {
                     var47 = (Boolean)var46.invoke(var10001, var10002);
                  } catch (InvocationTargetException var30) {
                     throw var30.getTargetException();
                  }

                  if (var1 == null) {
                     if (var47) {
                        StringBuilder var48 = new StringBuilder().append(var2).append(a(25136, -7869));
                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(183894823848696366L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var87 = (String)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var29) {
                           throw var29.getTargetException();
                        }

                        StringBuilder var49 = var48.append(var87).append(" ");
                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(510595481607148382L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var90 = (Long)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var28) {
                           throw var28.getTargetException();
                        }

                        Object[] var91 = com.c.e(var90);
                        var10001 = com.c.d(408529162510360196L);
                        var10003 = var91;
                        var10002 = null;

                        try {
                           var93 = (String)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var27) {
                           throw var27.getTargetException();
                        }

                        StringBuilder var50 = var49.append(var93).append("/");
                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(295779105922796909L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var96 = (Long)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var26) {
                           throw var26.getTargetException();
                        }

                        Object[] var97 = com.c.e(var96);
                        var10001 = com.c.d(408529162510360196L);
                        var10003 = var97;
                        var10002 = null;

                        try {
                           var99 = (String)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var25) {
                           throw var25.getTargetException();
                        }

                        var2 = var50.append(var99).toString();
                     }

                     var47 = com.c.c(356414783958618676L).getBoolean(this);
                  }

                  if (var1 == null) {
                     if (var47) {
                        break label475;
                     }

                     this.setLocationRelativeTo(null);
                     var47 = false;
                  }

                  label482: {
                     boolean var5 = var47;
                     dA_3 var51 = (dA_3)com.c.c(529321737223656579L).get(null);
                     if (var1 == null) {
                        if (var51 == null) {
                           var5 = true;
                           if (var1 == null) {
                              break label482;
                           }
                        }

                        var51 = (dA_3)com.c.c(529321737223656579L).get(null);
                     }

                     boolean var52 = var51.isVisible();
                     if (var1 == null) {
                        if (!var52) {
                           var5 = true;
                        }

                        var52 = var5;
                     }

                     if (var52) {
                        Object[] var100 = com.c.a(true);
                        Method var212 = com.c.d(351503280654568600L);
                        var10002 = var100;
                        WT var101 = this;
                        Method var53 = var212;

                        try {
                           var53.invoke(var101, var10002);
                        } catch (InvocationTargetException var24) {
                           throw var24.getTargetException();
                        }
                     }
                  }

                  if (var1 == null) {
                     break label475;
                  }
               }

               var10000 = (String[])com.c.c(354794456661762655L).get(this);
               Object[] var102 = com.c.f();
               Method var213 = com.c.d(191013569818870817L);
               var10002 = var102;
               var10001 = var10000;
               Method var55 = var213;

               try {
                  var39 = (Boolean)var55.invoke(var10001, var10002);
               } catch (InvocationTargetException var23) {
                  throw var23.getTargetException();
               }
            }

            if (var39) {
               var2 = a(25144, -27266);
               if (var1 == null) {
                  break label475;
               }
            }

            var2 = a(25151, 2335);
         }

         label430: {
            String var56 = var4;
            if (var1 == null) {
               if (var4 == null) {
                  break label430;
               }

               var56 = var4;
            }

            var2 = var56;
         }

         ((JTextArea)com.c.c(246965589172664073L).get(this)).setText(var2);
         Object[] var57 = com.c.f();
         Method var58 = com.c.d(253808553645062345L);
         var10002 = var57;
         var10001 = null;

         try {
            var59 = (Boolean)var58.invoke(var10001, var10002);
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         if (var1 == null) {
            if (var59) {
               JButton var60 = (JButton)com.c.c(484654819353749686L).get(this);
               var10001 = (Method)com.c.c(354794456661762655L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(539567672930282978L);
               var10003 = var10002;
               var10002 = var10001;
               var10001 = var10004;

               try {
                  var108 = (Boolean)var10001.invoke(var10002, var10003);
               } catch (InvocationTargetException var21) {
                  throw var21.getTargetException();
               }

               label418: {
                  label486: {
                     if (var1 == null) {
                        if (var108) {
                           break label486;
                        }

                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(262117569331123961L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var108 = (Boolean)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var20) {
                           throw var20.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label418;
                     }

                     if (!var108) {
                        var108 = true;
                        break label418;
                     }
                  }

                  var108 = false;
               }

               var60.setEnabled(var108);
               JButton var61 = (JButton)com.c.c(497567577586291331L).get(this);
               var10001 = (Method)com.c.c(354794456661762655L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(539567672930282978L);
               var10003 = var10002;
               var10002 = var10001;
               var10001 = var10004;

               try {
                  var113 = (Boolean)var10001.invoke(var10002, var10003);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }

               label406: {
                  label488: {
                     if (var1 == null) {
                        if (var113) {
                           break label488;
                        }

                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(262117569331123961L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var113 = (Boolean)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var18) {
                           throw var18.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var113) {
                           break label488;
                        }

                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(494928284843292484L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var113 = (Boolean)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var17) {
                           throw var17.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label406;
                     }

                     if (var113) {
                        var113 = true;
                        break label406;
                     }
                  }

                  var113 = false;
               }

               var61.setEnabled(var113);
               if (var1 == null) {
                  return;
               }
            }

            Object[] var62 = com.c.f();
            Method var63 = com.c.d(454647487873911743L);
            var10002 = var62;
            var10001 = null;

            try {
               var59 = (Boolean)var63.invoke(var10001, var10002);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }
         }

         if (var1 == null) {
            if (var59) {
               JButton var64 = (JButton)com.c.c(484654819353749686L).get(this);
               var10001 = (Method)com.c.c(354794456661762655L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(539567672930282978L);
               var10003 = var10002;
               var10002 = var10001;
               var10001 = var10004;

               try {
                  var122 = (Boolean)var10001.invoke(var10002, var10003);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               label381: {
                  label493: {
                     if (var1 == null) {
                        if (var122) {
                           break label493;
                        }

                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(262117569331123961L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var122 = (Boolean)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var14) {
                           throw var14.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label381;
                     }

                     if (!var122) {
                        var122 = true;
                        break label381;
                     }
                  }

                  var122 = false;
               }

               var64.setEnabled(var122);
               JButton var65 = (JButton)com.c.c(497567577586291331L).get(this);
               var10001 = (Method)com.c.c(354794456661762655L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(539567672930282978L);
               var10003 = var10002;
               var10002 = var10001;
               var10001 = var10004;

               try {
                  var127 = (Boolean)var10001.invoke(var10002, var10003);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               label369: {
                  label495: {
                     if (var1 == null) {
                        if (var127) {
                           break label495;
                        }

                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(262117569331123961L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var127 = (Boolean)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var12) {
                           throw var12.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var127) {
                           break label495;
                        }

                        var10001 = (Method)com.c.c(354794456661762655L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(494928284843292484L);
                        var10003 = var10002;
                        var10002 = var10001;
                        var10001 = var10004;

                        try {
                           var127 = (Boolean)var10001.invoke(var10002, var10003);
                        } catch (InvocationTargetException var11) {
                           throw var11.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label369;
                     }

                     if (var127) {
                        var127 = true;
                        break label369;
                     }
                  }

                  var127 = false;
               }

               var65.setEnabled(var127);
               if (var1 == null) {
                  return;
               }
            }

            Object[] var66 = com.c.f();
            Method var67 = com.c.d(561847341732101275L);
            var10002 = var66;
            var10001 = null;

            try {
               var59 = (Boolean)var67.invoke(var10001, var10002);
            } catch (InvocationTargetException var10) {
               throw var10.getTargetException();
            }
         }

         if (var59) {
            JButton var68 = (JButton)com.c.c(484654819353749686L).get(this);
            var10001 = (Method)com.c.c(354794456661762655L).get(this);
            var10002 = com.c.f();
            var10004 = com.c.d(262117569331123961L);
            var10003 = var10002;
            var10002 = var10001;
            var10001 = var10004;

            try {
               var136 = (Boolean)var10001.invoke(var10002, var10003);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }

            if (var1 == null) {
               var136 = !var136;
            }

            var68.setEnabled(var136);
            JButton var69 = (JButton)com.c.c(497567577586291331L).get(this);
            var10001 = (Method)com.c.c(354794456661762655L).get(this);
            var10002 = com.c.f();
            var10004 = com.c.d(539567672930282978L);
            var10003 = var10002;
            var10002 = var10001;
            var10001 = var10004;

            try {
               var139 = (Boolean)var10001.invoke(var10002, var10003);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            label343: {
               label499: {
                  if (var1 == null) {
                     if (var139) {
                        break label499;
                     }

                     var10001 = (Method)com.c.c(354794456661762655L).get(this);
                     var10002 = com.c.f();
                     var10004 = com.c.d(262117569331123961L);
                     var10003 = var10002;
                     var10002 = var10001;
                     var10001 = var10004;

                     try {
                        var139 = (Boolean)var10001.invoke(var10002, var10003);
                     } catch (InvocationTargetException var7) {
                        throw var7.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     if (var139) {
                        break label499;
                     }

                     var10001 = (Method)com.c.c(354794456661762655L).get(this);
                     var10002 = com.c.f();
                     var10004 = com.c.d(494928284843292484L);
                     var10003 = var10002;
                     var10002 = var10001;
                     var10001 = var10004;

                     try {
                        var139 = (Boolean)var10001.invoke(var10002, var10003);
                     } catch (InvocationTargetException var6) {
                        throw var6.getTargetException();
                     }
                  }

                  if (var1 != null) {
                     break label343;
                  }

                  if (var139) {
                     var139 = true;
                     break label343;
                  }
               }

               var139 = false;
            }

            var69.setEnabled(var139);
         }
      }
   }

   public static void r(String[] var0) {
      b = var0;
   }

   public static String[] y() {
      return b;
   }

   private static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var15 = new String[19];
      int var13 = 0;
      r(null);
      String var12 = "îé\u0002\u009cI¦f\u0095\u0002\u009cÝKA»q\u0095 ÜÈ¼\u0013\u0086\"þ\u0088\u0007\u00ad%\u0018¤\t書攓旐亣崖亸輍室戯\u0010Á\u009dç\u0012õwñ¯ðÛ\u0083£\u0095±\u001f6\u000ep\u0096\u001b\u0085\u0083å´ÄÞ¼N\u0018\"\u001b\u0002û}\u0006卸珪敶爢柍Ê\u0006崛纚曂柴斫爹\fHv\u000fÙB\u007f\u0096ûÿà¨\u001d\t段坊桛朐曎攄\u0083]ù\b殦坝仲轪晉旀gË\u0012RÂ_\u000f\u000b´¥ììë\bàº\u0006\u0016Øä\u009e\f¡n2Úå\u001fb÷aa{-\u0011gÈê\u000eþ\u0085\u0001¤\r\u000bö`ÔY\u0014\u009fì\t忤妕嬷衔庡八长轊丅\u0004曕斎攗弱\u0004孤蠈旳强\f>\"\u0005ðæïKô,\u0019昁旻";
      int var14 = "îé\u0002\u009cI¦f\u0095\u0002\u009cÝKA»q\u0095 ÜÈ¼\u0013\u0086\"þ\u0088\u0007\u00ad%\u0018¤\t書攓旐亣崖亸輍室戯\u0010Á\u009dç\u0012õwñ¯ðÛ\u0083£\u0095±\u001f6\u000ep\u0096\u001b\u0085\u0083å´ÄÞ¼N\u0018\"\u001b\u0002û}\u0006卸珪敶爢柍Ê\u0006崛纚曂柴斫爹\fHv\u000fÙB\u007f\u0096ûÿà¨\u001d\t段坊桛朐曎攄\u0083]ù\b殦坝仲轪晉旀gË\u0012RÂ_\u000f\u000b´¥ììë\bàº\u0006\u0016Øä\u009e\f¡n2Úå\u001fb÷aa{-\u0011gÈê\u000eþ\u0085\u0001¤\r\u000bö`ÔY\u0014\u009fì\t忤妕嬷衔庡八长轊丅\u0004曕斎攗弱\u0004孤蠈旳强\f>\"\u0005ðæïKô,\u0019昁旻"
         .length();
      char var11 = 30;
      int var18 = -1;

      label61:
      while (true) {
         byte var10000 = 59;
         String var10001 = var12.substring(++var18, var18 + var11);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var38 = var10001.toCharArray();
               int var10004 = var38.length;
               int var16 = 0;
               byte var41 = var10000;
               var33 = var38;
               int var24 = var10004;
               byte var47;
               char[] var52;
               int var10006;
               if (var10004 <= 1) {
                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               } else {
                  var41 = var10000;
                  var24 = var10004;
                  if (var10004 <= var16) {
                     break label56;
                  }

                  var52 = var38;
                  var47 = var10000;
                  var10006 = var16;
               }

               while (true) {
                  char var61 = var52[var10006];
                  byte var62;
                  switch (var16 % 7) {
                     case 0:
                        var62 = 66;
                        break;
                     case 1:
                        var62 = 20;
                        break;
                     case 2:
                        var62 = 54;
                        break;
                     case 3:
                        var62 = 79;
                        break;
                     case 4:
                        var62 = 19;
                        break;
                     case 5:
                        var62 = 90;
                        break;
                     default:
                        var62 = 32;
                  }

                  var52[var10006] = (char)(var61 ^ var47 ^ var62);
                  var16++;
                  if (var41 == 0) {
                     var10006 = var41;
                     var52 = var33;
                     var47 = var41;
                  } else {
                     if (var24 <= var16) {
                        break;
                     }

                     var52 = var33;
                     var47 = var41;
                     var10006 = var16;
                  }
               }
            }

            String var43 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var15[var13++] = var43;
                  if ((var18 += var11) >= var14) {
                     c = var15;
                     e = new String[19];
                     long var2 = 8048985971626810207L;
                     long[] var8 = new long[3];
                     int var5 = 0;
                     String var6 = "j>\"\u009bK6Ix\u0014.ü\u0092]å\u009f_*\u0014\u0003i¹\u000f;\u0088";
                     int var7 = "j>\"\u009bK6Ix\u0014.ü\u0092]å\u009f_*\u0014\u0003i¹\u000f;\u0088".length();
                     byte var4 = 0;

                     do {
                        byte var26 = var4;
                        var4 += 8;
                        byte[] var9 = var6.substring(var26, var4).getBytes("ISO-8859-1");
                        int var27 = var5++;
                        long var51 = (
                              ((long)var9[0] & 255L) << 56
                                 | ((long)var9[1] & 255L) << 48
                                 | ((long)var9[2] & 255L) << 40
                                 | ((long)var9[3] & 255L) << 32
                                 | ((long)var9[4] & 255L) << 24
                                 | ((long)var9[5] & 255L) << 16
                                 | ((long)var9[6] & 255L) << 8
                                 | (long)var9[7] & 255L
                           )
                           ^ var2;
                        byte var44 = -1;
                        var8[var27] = var51;
                     } while (var4 < var7);

                     f = var8;
                     j = new Integer[3];
                     long var0 = 869738723196198792L;
                     long var37 = 869739375539430870L ^ var0;
                     byte var28 = -1;
                     k = var37;
                     return;
                  }

                  var11 = var12.charAt(var18);
                  break;
               default:
                  var15[var13++] = var43;
                  if ((var18 += var11) < var14) {
                     var11 = var12.charAt(var18);
                     continue label61;
                  }

                  var12 = "栂杰晴敌\u0006嶙继暨条旜犱";
                  var14 = "栂杰晴敌\u0006嶙继暨条旜犱".length();
                  var11 = 4;
                  var18 = -1;
            }

            var10000 = 34;
            var10001 = var12.substring(++var18, var18 + var11);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ 25145) & 65535;
      if (e[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 87;
               break;
            case 1:
               var10000 = 79;
               break;
            case 2:
               var10000 = 51;
               break;
            case 3:
               var10000 = 64;
               break;
            case 4:
               var10000 = 202;
               break;
            case 5:
               var10000 = 185;
               break;
            case 6:
               var10000 = 180;
               break;
            case 7:
               var10000 = 190;
               break;
            case 8:
               var10000 = 82;
               break;
            case 9:
               var10000 = 46;
               break;
            case 10:
               var10000 = 153;
               break;
            case 11:
               var10000 = 168;
               break;
            case 12:
               var10000 = 7;
               break;
            case 13:
               var10000 = 123;
               break;
            case 14:
               var10000 = 89;
               break;
            case 15:
               var10000 = 223;
               break;
            case 16:
               var10000 = 84;
               break;
            case 17:
               var10000 = 113;
               break;
            case 18:
               var10000 = 53;
               break;
            case 19:
               var10000 = 65;
               break;
            case 20:
               var10000 = 118;
               break;
            case 21:
               var10000 = 69;
               break;
            case 22:
               var10000 = 127;
               break;
            case 23:
               var10000 = 144;
               break;
            case 24:
               var10000 = 49;
               break;
            case 25:
               var10000 = 229;
               break;
            case 26:
               var10000 = 73;
               break;
            case 27:
               var10000 = 228;
               break;
            case 28:
               var10000 = 6;
               break;
            case 29:
               var10000 = 70;
               break;
            case 30:
               var10000 = 2;
               break;
            case 31:
               var10000 = 187;
               break;
            case 32:
               var10000 = 230;
               break;
            case 33:
               var10000 = 67;
               break;
            case 34:
               var10000 = 110;
               break;
            case 35:
               var10000 = 167;
               break;
            case 36:
               var10000 = 201;
               break;
            case 37:
               var10000 = 115;
               break;
            case 38:
               var10000 = 94;
               break;
            case 39:
               var10000 = 130;
               break;
            case 40:
               var10000 = 85;
               break;
            case 41:
               var10000 = 129;
               break;
            case 42:
               var10000 = 221;
               break;
            case 43:
               var10000 = 179;
               break;
            case 44:
               var10000 = 34;
               break;
            case 45:
               var10000 = 178;
               break;
            case 46:
               var10000 = 163;
               break;
            case 47:
               var10000 = 158;
               break;
            case 48:
               var10000 = 253;
               break;
            case 49:
               var10000 = 154;
               break;
            case 50:
               var10000 = 114;
               break;
            case 51:
               var10000 = 93;
               break;
            case 52:
               var10000 = 250;
               break;
            case 53:
               var10000 = 88;
               break;
            case 54:
               var10000 = 173;
               break;
            case 55:
               var10000 = 24;
               break;
            case 56:
               var10000 = 22;
               break;
            case 57:
               var10000 = 174;
               break;
            case 58:
               var10000 = 47;
               break;
            case 59:
               var10000 = 104;
               break;
            case 60:
               var10000 = 109;
               break;
            case 61:
               var10000 = 10;
               break;
            case 62:
               var10000 = 244;
               break;
            case 63:
               var10000 = 193;
               break;
            case 64:
               var10000 = 152;
               break;
            case 65:
               var10000 = 198;
               break;
            case 66:
               var10000 = 209;
               break;
            case 67:
               var10000 = 116;
               break;
            case 68:
               var10000 = 169;
               break;
            case 69:
               var10000 = 213;
               break;
            case 70:
               var10000 = 35;
               break;
            case 71:
               var10000 = 200;
               break;
            case 72:
               var10000 = 29;
               break;
            case 73:
               var10000 = 16;
               break;
            case 74:
               var10000 = 121;
               break;
            case 75:
               var10000 = 54;
               break;
            case 76:
               var10000 = 14;
               break;
            case 77:
               var10000 = 241;
               break;
            case 78:
               var10000 = 30;
               break;
            case 79:
               var10000 = 138;
               break;
            case 80:
               var10000 = 26;
               break;
            case 81:
               var10000 = 44;
               break;
            case 82:
               var10000 = 134;
               break;
            case 83:
               var10000 = 27;
               break;
            case 84:
               var10000 = 107;
               break;
            case 85:
               var10000 = 203;
               break;
            case 86:
               var10000 = 119;
               break;
            case 87:
               var10000 = 204;
               break;
            case 88:
               var10000 = 155;
               break;
            case 89:
               var10000 = 66;
               break;
            case 90:
               var10000 = 236;
               break;
            case 91:
               var10000 = 205;
               break;
            case 92:
               var10000 = 148;
               break;
            case 93:
               var10000 = 132;
               break;
            case 94:
               var10000 = 36;
               break;
            case 95:
               var10000 = 246;
               break;
            case 96:
               var10000 = 247;
               break;
            case 97:
               var10000 = 160;
               break;
            case 98:
               var10000 = 143;
               break;
            case 99:
               var10000 = 17;
               break;
            case 100:
               var10000 = 11;
               break;
            case 101:
               var10000 = 38;
               break;
            case 102:
               var10000 = 176;
               break;
            case 103:
               var10000 = 196;
               break;
            case 104:
               var10000 = 76;
               break;
            case 105:
               var10000 = 245;
               break;
            case 106:
               var10000 = 164;
               break;
            case 107:
               var10000 = 216;
               break;
            case 108:
               var10000 = 21;
               break;
            case 109:
               var10000 = 83;
               break;
            case 110:
               var10000 = 101;
               break;
            case 111:
               var10000 = 217;
               break;
            case 112:
               var10000 = 181;
               break;
            case 113:
               var10000 = 165;
               break;
            case 114:
               var10000 = 208;
               break;
            case 115:
               var10000 = 139;
               break;
            case 116:
               var10000 = 182;
               break;
            case 117:
               var10000 = 175;
               break;
            case 118:
               var10000 = 100;
               break;
            case 119:
               var10000 = 92;
               break;
            case 120:
               var10000 = 218;
               break;
            case 121:
               var10000 = 239;
               break;
            case 122:
               var10000 = 96;
               break;
            case 123:
               var10000 = 81;
               break;
            case 124:
               var10000 = 105;
               break;
            case 125:
               var10000 = 61;
               break;
            case 126:
               var10000 = 31;
               break;
            case 127:
               var10000 = 231;
               break;
            case 128:
               var10000 = 72;
               break;
            case 129:
               var10000 = 9;
               break;
            case 130:
               var10000 = 233;
               break;
            case 131:
               var10000 = 136;
               break;
            case 132:
               var10000 = 248;
               break;
            case 133:
               var10000 = 71;
               break;
            case 134:
               var10000 = 156;
               break;
            case 135:
               var10000 = 125;
               break;
            case 136:
               var10000 = 150;
               break;
            case 137:
               var10000 = 28;
               break;
            case 138:
               var10000 = 5;
               break;
            case 139:
               var10000 = 215;
               break;
            case 140:
               var10000 = 157;
               break;
            case 141:
               var10000 = 74;
               break;
            case 142:
               var10000 = 186;
               break;
            case 143:
               var10000 = 12;
               break;
            case 144:
               var10000 = 149;
               break;
            case 145:
               var10000 = 43;
               break;
            case 146:
               var10000 = 255;
               break;
            case 147:
               var10000 = 32;
               break;
            case 148:
               var10000 = 98;
               break;
            case 149:
               var10000 = 18;
               break;
            case 150:
               var10000 = 42;
               break;
            case 151:
               var10000 = 212;
               break;
            case 152:
               var10000 = 243;
               break;
            case 153:
               var10000 = 224;
               break;
            case 154:
               var10000 = 106;
               break;
            case 155:
               var10000 = 235;
               break;
            case 156:
               var10000 = 141;
               break;
            case 157:
               var10000 = 183;
               break;
            case 158:
               var10000 = 131;
               break;
            case 159:
               var10000 = 234;
               break;
            case 160:
               var10000 = 210;
               break;
            case 161:
               var10000 = 8;
               break;
            case 162:
               var10000 = 37;
               break;
            case 163:
               var10000 = 226;
               break;
            case 164:
               var10000 = 191;
               break;
            case 165:
               var10000 = 142;
               break;
            case 166:
               var10000 = 102;
               break;
            case 167:
               var10000 = 41;
               break;
            case 168:
               var10000 = 59;
               break;
            case 169:
               var10000 = 252;
               break;
            case 170:
               var10000 = 120;
               break;
            case 171:
               var10000 = 13;
               break;
            case 172:
               var10000 = 58;
               break;
            case 173:
               var10000 = 56;
               break;
            case 174:
               var10000 = 166;
               break;
            case 175:
               var10000 = 39;
               break;
            case 176:
               var10000 = 111;
               break;
            case 177:
               var10000 = 170;
               break;
            case 178:
               var10000 = 50;
               break;
            case 179:
               var10000 = 19;
               break;
            case 180:
               var10000 = 25;
               break;
            case 181:
               var10000 = 159;
               break;
            case 182:
               var10000 = 57;
               break;
            case 183:
               var10000 = 52;
               break;
            case 184:
               var10000 = 192;
               break;
            case 185:
               var10000 = 62;
               break;
            case 186:
               var10000 = 188;
               break;
            case 187:
               var10000 = 146;
               break;
            case 188:
               var10000 = 55;
               break;
            case 189:
               var10000 = 162;
               break;
            case 190:
               var10000 = 117;
               break;
            case 191:
               var10000 = 251;
               break;
            case 192:
               var10000 = 33;
               break;
            case 193:
               var10000 = 103;
               break;
            case 194:
               var10000 = 86;
               break;
            case 195:
               var10000 = 97;
               break;
            case 196:
               var10000 = 225;
               break;
            case 197:
               var10000 = 91;
               break;
            case 198:
               var10000 = 254;
               break;
            case 199:
               var10000 = 219;
               break;
            case 200:
               var10000 = 77;
               break;
            case 201:
               var10000 = 137;
               break;
            case 202:
               var10000 = 60;
               break;
            case 203:
               var10000 = 199;
               break;
            case 204:
               var10000 = 220;
               break;
            case 205:
               var10000 = 112;
               break;
            case 206:
               var10000 = 214;
               break;
            case 207:
               var10000 = 45;
               break;
            case 208:
               var10000 = 227;
               break;
            case 209:
               var10000 = 63;
               break;
            case 210:
               var10000 = 20;
               break;
            case 211:
               var10000 = 122;
               break;
            case 212:
               var10000 = 184;
               break;
            case 213:
               var10000 = 80;
               break;
            case 214:
               var10000 = 23;
               break;
            case 215:
               var10000 = 147;
               break;
            case 216:
               var10000 = 3;
               break;
            case 217:
               var10000 = 99;
               break;
            case 218:
               var10000 = 78;
               break;
            case 219:
               var10000 = 133;
               break;
            case 220:
               var10000 = 75;
               break;
            case 221:
               var10000 = 126;
               break;
            case 222:
               var10000 = 95;
               break;
            case 223:
               var10000 = 135;
               break;
            case 224:
               var10000 = 151;
               break;
            case 225:
               var10000 = 240;
               break;
            case 226:
               var10000 = 108;
               break;
            case 227:
               var10000 = 206;
               break;
            case 228:
               var10000 = 145;
               break;
            case 229:
               var10000 = 207;
               break;
            case 230:
               var10000 = 40;
               break;
            case 231:
               var10000 = 194;
               break;
            case 232:
               var10000 = 0;
               break;
            case 233:
               var10000 = 249;
               break;
            case 234:
               var10000 = 128;
               break;
            case 235:
               var10000 = 189;
               break;
            case 236:
               var10000 = 222;
               break;
            case 237:
               var10000 = 1;
               break;
            case 238:
               var10000 = 171;
               break;
            case 239:
               var10000 = 68;
               break;
            case 240:
               var10000 = 172;
               break;
            case 241:
               var10000 = 195;
               break;
            case 242:
               var10000 = 161;
               break;
            case 243:
               var10000 = 232;
               break;
            case 244:
               var10000 = 197;
               break;
            case 245:
               var10000 = 15;
               break;
            case 246:
               var10000 = 124;
               break;
            case 247:
               var10000 = 90;
               break;
            case 248:
               var10000 = 177;
               break;
            case 249:
               var10000 = 48;
               break;
            case 250:
               var10000 = 237;
               break;
            case 251:
               var10000 = 211;
               break;
            case 252:
               var10000 = 140;
               break;
            case 253:
               var10000 = 4;
               break;
            case 254:
               var10000 = 238;
               break;
            default:
               var10000 = 242;
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

         e[var2] = new String(var3).intern();
      }

      return e[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11488;
      if (j[var3] == null) {
         j[var3] = (int)(f[var3] ^ var1);
      }

      return j[var3];
   }
}





