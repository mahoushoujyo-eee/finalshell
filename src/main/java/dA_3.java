import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.BadLocationException;
import net.miginfocom.swing.MigLayout;

public class dA_3 extends JFrame implements CH {
   yy_4 s;
   JTextArea b;
   boolean Y;
   JButton P;
   JButton H;
   JButton r;
   JTextArea m;
   JScrollPane u;
   boolean a;
   final int T;
   boolean E;
   boolean M;
   private static String[] X;
   private static final String[] c;
   private static final String[] d;
   private static final long[] e;
   private static final Integer[] f;

   public dA_3(JFrame var1) {
      com.c.c(618853683069368772L).setBoolean(this, false);
      com.c.c(198290463385639860L).setBoolean(this, true);
      this.T = a(9134, 2451920808905915374L);
      com.c.c(210161519549432120L).setBoolean(this, false);
      String[] var10000 = q();
      com.c.c(602217905248930587L).setBoolean(this, false);
      this.setTitle(a(-11780, -20663));
      Object[] var10002 = com.c.f();
      Method var47 = com.c.d(270389152141252877L);
      Object[] var70 = var10002;
      Object var62 = null;

      try {
         var10002 = (Object[])var47.invoke(var62, var70);
      } catch (InvocationTargetException var15) {
         throw var15.getTargetException();
      }

      var62 = com.c.f();
      Method var10005 = com.c.d(479882039388176646L);
      var70 = (Object[])var62;
      var62 = var10002;
      Method var49 = var10005;

      try {
         var10002 = (Object[])var49.invoke(var62, var70);
      } catch (InvocationTargetException var14) {
         throw var14.getTargetException();
      }

      String[] var2;
      label99: {
         com.c.c(215526989813745242L).set(this, var10002);
         JPanel var3 = (JPanel)this.getContentPane();
         var3.setLayout(new MigLayout(a(-11807, -25544), "", ""));
         JLabel var4 = new JLabel(a(-11796, 14553) + (String)com.c.c(621025023751330046L).get(null));
         var3.add(var4, a(-11802, -13178));
         com.c.c(459690401541671742L).set(this, new JTextArea());
         ((JTextArea)com.c.c(459690401541671742L).get(this)).setOpaque(false);
         ((JTextArea)com.c.c(459690401541671742L).get(this)).setEditable(false);
         ((JTextArea)com.c.c(459690401541671742L).get(this)).setRows(2);
         var3.add((JTextArea)com.c.c(459690401541671742L).get(this), a(-11793, -3318));
         JPanel var5 = new JPanel();
         var5.setLayout(new MigLayout(a(-11799, -1637), "", a(-11806, -10877)));
         var3.add(var5, a(-11778, -30052));
         com.c.c(528028079952531070L).set(this, new JButton(a(-11808, -30265)));
         ((JButton)com.c.c(528028079952531070L).get(this)).addActionListener(new Cb_2(this));
         var5.add((JButton)com.c.c(528028079952531070L).get(this), a(-11800, 30960));
         var2 = var10000;
         com.c.c(141748913226340279L).set(this, new JButton(a(-11794, 27698)));
         ((JButton)com.c.c(141748913226340279L).get(this)).addActionListener(new Fx_2(this));
         var5.add((JButton)com.c.c(141748913226340279L).get(this), a(-11777, -13948));
         com.c.c(175547947792914580L).set(this, new JButton(a(-11797, 16853)));
         ((JButton)com.c.c(175547947792914580L).get(this)).addActionListener(new UZ(this));
         var5.add((JButton)com.c.c(175547947792914580L).get(this), a(-11777, -13948));
         if (var2 == null) {
            Object[] var16 = com.c.f();
            Method var17 = com.c.d(561847341732101275L);
            var10002 = var16;
            Object var32 = null;

            try {
               var18 = (Boolean)var17.invoke(var32, var10002);
            } catch (InvocationTargetException var13) {
               throw var13.getTargetException();
            }

            if (!var18) {
               Object[] var19 = com.c.f();
               Method var20 = com.c.d(454647487873911743L);
               var10002 = var19;
               var32 = null;

               try {
                  var21 = (Boolean)var20.invoke(var32, var10002);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               if (!var21) {
                  break label99;
               }
            }

            com.c.c(406171939123952740L).set(this, new JTextArea());
            com.c.c(286993704937759947L).set(this, new JScrollPane((JTextArea)com.c.c(406171939123952740L).get(this)));
            ((JScrollPane)com.c.c(286993704937759947L).get(this)).setBorder(BorderFactory.createTitledBorder(a(-11801, 6160)));
         }

         var3.add((JScrollPane)com.c.c(286993704937759947L).get(this), a(-11798, 29239));
      }

      Object[] var35 = com.c.f();
      var62 = com.c.d(611344775103445562L);
      var10002 = var35;
      dA_3 var36 = this;
      Method var22 = (Method)var62;

      try {
         var22.invoke(var36, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      this.pack();
      var10000 = (String[])com.c.c(388376917454860932L).get(null);
      var35 = com.c.a(new J3(this));
      var62 = com.c.d(434592463220957006L);
      var10002 = var35;
      var35 = var10000;
      Method var24 = (Method)var62;

      try {
         var24.invoke(var35, var10002);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      var10000 = (String[])com.c.c(388376917454860932L).get(null);
      var35 = com.c.a(new m7(this), a(27223, 1972071948725449238L));
      var62 = com.c.d(201859364639460244L);
      var10002 = var35;
      var35 = var10000;
      Method var26 = (Method)var62;

      try {
         var26.invoke(var35, var10002);
      } catch (InvocationTargetException var9) {
         throw var9.getTargetException();
      }

      var35 = com.c.a("");
      var62 = com.c.d(457138384657962408L);
      var10002 = var35;
      dA_3 var42 = this;
      Method var27 = (Method)var62;

      try {
         var27.invoke(var42, var10002);
      } catch (InvocationTargetException var8) {
         throw var8.getTargetException();
      }

      Object[] var28 = com.c.f();
      Method var29 = com.c.d(270389152141252877L);
      var10002 = var28;
      var35 = null;

      try {
         var10000 = (String[])var29.invoke(var35, var10002);
      } catch (InvocationTargetException var7) {
         throw var7.getTargetException();
      }

      var35 = com.c.f();
      var62 = com.c.d(223833355588839652L);
      var10002 = var35;
      var35 = var10000;
      Method var31 = (Method)var62;

      try {
         var31.invoke(var35, var10002);
      } catch (InvocationTargetException var6) {
         throw var6.getTargetException();
      }

      if (var2 != null) {
         com.ky_4.K(new String[3]);
      }
   }

   @Override
   public void d(String var1) {
      SwingUtilities.invokeLater(new ue_4(this, var1));
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public void s(JTextArea var1) {
      String[] var10000 = q();
      int var3 = var1.getLineCount() - a(30243, 5602459892254731872L);
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

   void g(String var1) {
      String[] var10000 = q();
      ((JTextArea)com.c.c(406171939123952740L).get(this)).append(var1);
      String[] var2 = var10000;
      Object[] var10001 = com.c.a(com.c.c(406171939123952740L).get(this));
      Method var10003 = com.c.d(545163393621250611L);
      Object[] var10002 = var10001;
      dA_3 var7 = this;
      Method var5 = var10003;

      try {
         var5.invoke(var7, var10002);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      dA_3 var6 = this;
      if (var2 == null) {
         if (!com.c.c(198290463385639860L).getBoolean(this)) {
            return;
         }

         var6 = this;
      }

      JScrollBar var3 = ((JScrollPane)com.c.c(286993704937759947L).get(var6)).getVerticalScrollBar();
      var3.setValue(var3.getMaximum());
   }

   public void j() {
      label37: {
         String[] var1 = q();
         if (var1 == null) {
            Object[] var10000 = com.c.f();
            Method var5 = com.c.d(561847341732101275L);
            Object[] var16 = var10000;
            Object var11 = null;

            try {
               var6 = (Boolean)var5.invoke(var11, var16);
            } catch (InvocationTargetException var4) {
               throw var4.getTargetException();
            }

            if (var6) {
               break label37;
            }

            var10000 = (Object[])com.c.c(215526989813745242L).get(this);
            var11 = com.c.f();
            Method var10003 = com.c.d(373868045552747003L);
            var16 = (Object[])var11;
            var11 = var10000;
            Method var8 = var10003;

            try {
               var8.invoke(var11, var16);
            } catch (InvocationTargetException var3) {
               throw var3.getTargetException();
            }
         }

         if (var1 == null) {
            return;
         }
      }

      Method var9 = (Method)com.c.c(215526989813745242L).get(this);
      Object[] var14 = com.c.f();
      Method var19 = com.c.d(373868045552747003L);
      Object[] var18 = var14;
      var14 = var9;
      var9 = var19;

      try {
         var9.invoke(var14, var18);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   @Override
   public void setVisible(boolean var1) {
      String[] var10000 = q();
      boolean var3 = this.isVisible();
      String[] var2 = var10000;
      super.setVisible(var1);
      boolean var5 = var1;
      if (var2 == null) {
         if (var1) {
            com.c.c(618853683069368772L).setBoolean(this, true);
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

         var5 = ((JButton)com.c.c(141748913226340279L).get(this)).isEnabled();
      }

      if (var5) {
         var10000 = (String[])com.c.c(388376917454860932L).get(null);
         Object[] var10001 = com.c.a(new Kx_2(this));
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

   void t() {
      String var2 = a(-11805, -12181);
      Method var10000 = (Method)com.c.c(215526989813745242L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(158188277888657185L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var37 = (Kz_2)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var35) {
         throw var35.getTargetException();
      }

      Kz_2 var3 = var37;
      String[] var38 = q();
      var10001 = (Object[])com.c.c(215526989813745242L).get(this);
      var10002 = com.c.f();
      Method var10004 = com.c.d(443433712666304670L);
      Object[] var198 = var10002;
      var10002 = var10001;
      Method var73 = var10004;

      try {
         var10001 = (String)var73.invoke(var10002, var198);
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      String var4 = var10001;
      String[] var1 = var38;
      if (var3 != null) {
         var10000 = (Method)com.c.c(215526989813745242L).get(this);
         var10001 = com.c.f();
         var10003 = com.c.d(187198425743999659L);
         var10002 = var10001;
         var10001 = var10000;
         var10000 = var10003;

         try {
            var41 = (Boolean)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var33) {
            throw var33.getTargetException();
         }

         label457: {
            if (var1 == null) {
               if (var41) {
                  var2 = a(-11779, -23122);
                  if (var1 == null) {
                     break label457;
                  }
               }

               var10000 = (Method)com.c.c(215526989813745242L).get(this);
               var10001 = com.c.f();
               var10003 = com.c.d(491698642839551398L);
               var10002 = var10001;
               var10001 = var10000;
               var10000 = var10003;

               try {
                  var41 = (Boolean)var10000.invoke(var10001, var10002);
               } catch (InvocationTargetException var32) {
                  throw var32.getTargetException();
               }
            }

            if (var1 == null) {
               if (!var41) {
                  break label457;
               }

               var10000 = (Method)com.c.c(215526989813745242L).get(this);
               var10001 = com.c.f();
               var10003 = com.c.d(349126551903164149L);
               var10002 = var10001;
               var10001 = var10000;
               var10000 = var10003;

               try {
                  var41 = (Boolean)var10000.invoke(var10001, var10002);
               } catch (InvocationTargetException var31) {
                  throw var31.getTargetException();
               }
            }

            if (var1 == null) {
               if (var41) {
                  if (var3 != null) {
                     StringBuilder var46 = new StringBuilder().append(a(-11795, -11989));
                     var10002 = com.c.f();
                     var10004 = com.c.d(542847412748824793L);
                     Object[] var202 = var10002;
                     Kz_2 var150 = var3;
                     Method var81 = var10004;

                     try {
                        var10001 = (String)var81.invoke(var150, var202);
                     } catch (InvocationTargetException var30) {
                        throw var30.getTargetException();
                     }

                     var2 = var46.append((String)var10001).append("\n").toString();
                  }

                  var10000 = (Method)com.c.c(215526989813745242L).get(this);
                  var10001 = com.c.f();
                  var10003 = com.c.d(547240307566989756L);
                  var10002 = var10001;
                  var10001 = var10000;
                  var10000 = var10003;

                  try {
                     var49 = (Boolean)var10000.invoke(var10001, var10002);
                  } catch (InvocationTargetException var29) {
                     throw var29.getTargetException();
                  }

                  label463: {
                     if (var1 == null) {
                        if (var49) {
                           StringBuilder var50 = new StringBuilder().append(var2).append(a(-11784, 28411));
                           var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                           var10002 = com.c.f();
                           var10004 = com.c.d(423681337208045927L);
                           Object[] var204 = var10002;
                           var10002 = var10001;
                           Method var86 = var10004;

                           try {
                              var10001 = (String)var86.invoke(var10002, var204);
                           } catch (InvocationTargetException var28) {
                              throw var28.getTargetException();
                           }

                           StringBuilder var51 = var50.append((String)var10001).append(" ");
                           var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                           var10002 = com.c.f();
                           var10004 = com.c.d(365646851315276411L);
                           Object[] var205 = var10002;
                           var10002 = var10001;
                           Method var89 = var10004;

                           try {
                              var90 = (Long)var89.invoke(var10002, var205);
                           } catch (InvocationTargetException var27) {
                              throw var27.getTargetException();
                           }

                           var10001 = com.c.e(var90);
                           Method var92 = com.c.d(408529162510360196L);
                           Object[] var207 = var10001;
                           var10002 = null;

                           try {
                              var10001 = (String)var92.invoke(var10002, var207);
                           } catch (InvocationTargetException var26) {
                              throw var26.getTargetException();
                           }

                           StringBuilder var52 = var51.append((String)var10001).append("/");
                           var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                           var10002 = com.c.f();
                           var10004 = com.c.d(369915737473924171L);
                           Object[] var208 = var10002;
                           var10002 = var10001;
                           Method var95 = var10004;

                           try {
                              var96 = (Long)var95.invoke(var10002, var208);
                           } catch (InvocationTargetException var25) {
                              throw var25.getTargetException();
                           }

                           var10001 = com.c.e(var96);
                           Method var98 = com.c.d(408529162510360196L);
                           Object[] var210 = var10001;
                           var10002 = null;

                           try {
                              var10001 = (String)var98.invoke(var10002, var210);
                           } catch (InvocationTargetException var24) {
                              throw var24.getTargetException();
                           }

                           var2 = var52.append((String)var10001).toString();
                        }

                        var53 = this;
                        if (var1 != null) {
                           break label463;
                        }

                        var49 = com.c.c(618853683069368772L).getBoolean(this);
                     }

                     if (var49) {
                        break label457;
                     }

                     this.setLocationRelativeTo(null);
                     var53 = this;
                  }

                  var10001 = com.c.a(true);
                  var10003 = com.c.d(610529704363663802L);
                  var10002 = var10001;
                  dA_3 var101 = var53;
                  var10000 = var10003;

                  try {
                     var10000.invoke(var101, var10002);
                  } catch (InvocationTargetException var23) {
                     throw var23.getTargetException();
                  }

                  if (var1 == null) {
                     break label457;
                  }
               }

               var10000 = (Method)com.c.c(215526989813745242L).get(this);
               var10001 = com.c.f();
               var10003 = com.c.d(357995794655649354L);
               var10002 = var10001;
               var10001 = var10000;
               var10000 = var10003;

               try {
                  var41 = (Boolean)var10000.invoke(var10001, var10002);
               } catch (InvocationTargetException var22) {
                  throw var22.getTargetException();
               }
            }

            if (var41) {
               var2 = a(-11803, -8243);
               if (var1 == null) {
                  break label457;
               }
            }

            var2 = a(-11804, 28414);
         }

         label413: {
            String var57 = var4;
            if (var1 == null) {
               if (var4 == null) {
                  break label413;
               }

               var57 = var4;
            }

            var2 = var57;
         }

         ((JTextArea)com.c.c(459690401541671742L).get(this)).setText(var2);
         Object[] var58 = com.c.f();
         var10000 = com.c.d(253808553645062345L);
         var10002 = var58;
         var10001 = null;

         try {
            var60 = (Boolean)var10000.invoke(var10001, var10002);
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         if (var1 == null) {
            if (var60) {
               JButton var61 = (JButton)com.c.c(141748913226340279L).get(this);
               var10001 = (Object[])com.c.c(215526989813745242L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(349881537638593262L);
               Object[] var213 = var10002;
               var10002 = var10001;
               Method var107 = var10004;

               try {
                  var108 = (Boolean)var107.invoke(var10002, var213);
               } catch (InvocationTargetException var20) {
                  throw var20.getTargetException();
               }

               label401: {
                  label469: {
                     if (var1 == null) {
                        if (var108) {
                           break label469;
                        }

                        var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(187198425743999659L);
                        Object[] var214 = var10002;
                        var10002 = var10001;
                        Method var110 = var10004;

                        try {
                           var108 = (Boolean)var110.invoke(var10002, var214);
                        } catch (InvocationTargetException var19) {
                           throw var19.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label401;
                     }

                     if (!var108) {
                        var108 = true;
                        break label401;
                     }
                  }

                  var108 = false;
               }

               var61.setEnabled(var108);
               JButton var62 = (JButton)com.c.c(175547947792914580L).get(this);
               var10001 = (Object[])com.c.c(215526989813745242L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(349881537638593262L);
               Object[] var215 = var10002;
               var10002 = var10001;
               Method var112 = var10004;

               try {
                  var113 = (Boolean)var112.invoke(var10002, var215);
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }

               label389: {
                  label471: {
                     if (var1 == null) {
                        if (var113) {
                           break label471;
                        }

                        var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(187198425743999659L);
                        Object[] var216 = var10002;
                        var10002 = var10001;
                        Method var115 = var10004;

                        try {
                           var113 = (Boolean)var115.invoke(var10002, var216);
                        } catch (InvocationTargetException var17) {
                           throw var17.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var113) {
                           break label471;
                        }

                        var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(349126551903164149L);
                        Object[] var217 = var10002;
                        var10002 = var10001;
                        Method var117 = var10004;

                        try {
                           var113 = (Boolean)var117.invoke(var10002, var217);
                        } catch (InvocationTargetException var16) {
                           throw var16.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label389;
                     }

                     if (var113) {
                        var113 = true;
                        break label389;
                     }
                  }

                  var113 = false;
               }

               var62.setEnabled(var113);
               if (var1 == null) {
                  return;
               }
            }

            Object[] var63 = com.c.f();
            var10000 = com.c.d(454647487873911743L);
            var10002 = var63;
            var10001 = null;

            try {
               var60 = (Boolean)var10000.invoke(var10001, var10002);
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }
         }

         if (var1 == null) {
            if (var60) {
               JButton var65 = (JButton)com.c.c(141748913226340279L).get(this);
               var10001 = (Object[])com.c.c(215526989813745242L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(349881537638593262L);
               Object[] var218 = var10002;
               var10002 = var10001;
               Method var121 = var10004;

               try {
                  var122 = (Boolean)var121.invoke(var10002, var218);
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }

               label364: {
                  label476: {
                     if (var1 == null) {
                        if (var122) {
                           break label476;
                        }

                        var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(187198425743999659L);
                        Object[] var219 = var10002;
                        var10002 = var10001;
                        Method var124 = var10004;

                        try {
                           var122 = (Boolean)var124.invoke(var10002, var219);
                        } catch (InvocationTargetException var13) {
                           throw var13.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label364;
                     }

                     if (!var122) {
                        var122 = true;
                        break label364;
                     }
                  }

                  var122 = false;
               }

               var65.setEnabled(var122);
               JButton var66 = (JButton)com.c.c(175547947792914580L).get(this);
               var10001 = (Object[])com.c.c(215526989813745242L).get(this);
               var10002 = com.c.f();
               var10004 = com.c.d(349881537638593262L);
               Object[] var220 = var10002;
               var10002 = var10001;
               Method var126 = var10004;

               try {
                  var127 = (Boolean)var126.invoke(var10002, var220);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               label352: {
                  label478: {
                     if (var1 == null) {
                        if (var127) {
                           break label478;
                        }

                        var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(187198425743999659L);
                        Object[] var221 = var10002;
                        var10002 = var10001;
                        Method var129 = var10004;

                        try {
                           var127 = (Boolean)var129.invoke(var10002, var221);
                        } catch (InvocationTargetException var11) {
                           throw var11.getTargetException();
                        }
                     }

                     if (var1 == null) {
                        if (var127) {
                           break label478;
                        }

                        var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                        var10002 = com.c.f();
                        var10004 = com.c.d(349126551903164149L);
                        Object[] var222 = var10002;
                        var10002 = var10001;
                        Method var131 = var10004;

                        try {
                           var127 = (Boolean)var131.invoke(var10002, var222);
                        } catch (InvocationTargetException var10) {
                           throw var10.getTargetException();
                        }
                     }

                     if (var1 != null) {
                        break label352;
                     }

                     if (var127) {
                        var127 = true;
                        break label352;
                     }
                  }

                  var127 = false;
               }

               var66.setEnabled(var127);
               if (var1 == null) {
                  return;
               }
            }

            Object[] var67 = com.c.f();
            var10000 = com.c.d(561847341732101275L);
            var10002 = var67;
            var10001 = null;

            try {
               var60 = (Boolean)var10000.invoke(var10001, var10002);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }
         }

         if (var60) {
            JButton var69 = (JButton)com.c.c(141748913226340279L).get(this);
            var10001 = (Object[])com.c.c(215526989813745242L).get(this);
            var10002 = com.c.f();
            var10004 = com.c.d(187198425743999659L);
            Object[] var223 = var10002;
            var10002 = var10001;
            Method var135 = var10004;

            try {
               var136 = (Boolean)var135.invoke(var10002, var223);
            } catch (InvocationTargetException var8) {
               throw var8.getTargetException();
            }

            if (var1 == null) {
               var136 = !var136;
            }

            var69.setEnabled(var136);
            JButton var70 = (JButton)com.c.c(175547947792914580L).get(this);
            var10001 = (Object[])com.c.c(215526989813745242L).get(this);
            var10002 = com.c.f();
            var10004 = com.c.d(349881537638593262L);
            Object[] var224 = var10002;
            var10002 = var10001;
            Method var138 = var10004;

            try {
               var139 = (Boolean)var138.invoke(var10002, var224);
            } catch (InvocationTargetException var7) {
               throw var7.getTargetException();
            }

            label326: {
               label482: {
                  if (var1 == null) {
                     if (var139) {
                        break label482;
                     }

                     var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                     var10002 = com.c.f();
                     var10004 = com.c.d(187198425743999659L);
                     Object[] var225 = var10002;
                     var10002 = var10001;
                     Method var141 = var10004;

                     try {
                        var139 = (Boolean)var141.invoke(var10002, var225);
                     } catch (InvocationTargetException var6) {
                        throw var6.getTargetException();
                     }
                  }

                  if (var1 == null) {
                     if (var139) {
                        break label482;
                     }

                     var10001 = (Object[])com.c.c(215526989813745242L).get(this);
                     var10002 = com.c.f();
                     var10004 = com.c.d(349126551903164149L);
                     Object[] var226 = var10002;
                     var10002 = var10001;
                     Method var143 = var10004;

                     try {
                        var139 = (Boolean)var143.invoke(var10002, var226);
                     } catch (InvocationTargetException var5) {
                        throw var5.getTargetException();
                     }
                  }

                  if (var1 != null) {
                     break label326;
                  }

                  if (var139) {
                     var139 = true;
                     break label326;
                  }
               }

               var139 = false;
            }

            var70.setEnabled(var139);
         }
      }
   }

   public static void r(String[] var0) {
      X = var0;
   }

   public static String[] q() {
      return X;
   }

   private static BadLocationException a(BadLocationException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var13 = new String[21];
      int var11 = 0;
      String var10 = "彍勀狠板3\u0004\u0006厒猡攱牥柸¯\u0004梼枫暃攳\u0010+¨ \u008aÀé\u0011\u008e|å,¹í´â\u0006\fWVöã µ\u008cP,\u008fì-\u000e¼\u00ad\u0098Ü.CGâ0b\u00ad\u001eÓ\u009d\u001e\r<d\u0018X»\u0002Ä\u001e¬`\u0090{\u0086Ä¢\u008c\u0004\u0080*\\¦[à\u0099\u0019\u0002 \u001f\u0084\t很姛宠袣庎儘關迖仡\u0006巤總昧朾旊狭\t晲敐斛仵嶢仿违宾报\u0004>\u0005\u0007C\u0004宻衻攒彪\u0004暢敐旣忔\u0012æyÓFG\u0010j\u008a\u0085=\u001bçU \u0019\u009c\u001f(\u0002Ú~\u0006工縳昇柿旎狕\fÞo\u0003gû\u0090®é\u0000 暺攑\t歭圭桚柂昳旓zUV\u0011G\bô(àÌ\u0084\u007f-jÌ\u0091\u001e!¿\u0000\u0083";
      int var12 = "彍勀狠板3\u0004\u0006厒猡攱牥柸¯\u0004梼枫暃攳\u0010+¨ \u008aÀé\u0011\u008e|å,¹í´â\u0006\fWVöã µ\u008cP,\u008fì-\u000e¼\u00ad\u0098Ü.CGâ0b\u00ad\u001eÓ\u009d\u001e\r<d\u0018X»\u0002Ä\u001e¬`\u0090{\u0086Ä¢\u008c\u0004\u0080*\\¦[à\u0099\u0019\u0002 \u001f\u0084\t很姛宠袣庎儘關迖仡\u0006巤總昧朾旊狭\t晲敐斛仵嶢仿违宾报\u0004>\u0005\u0007C\u0004宻衻攒彪\u0004暢敐旣忔\u0012æyÓFG\u0010j\u008a\u0085=\u001bçU \u0019\u009c\u001f(\u0002Ú~\u0006工縳昇柿旎狕\fÞo\u0003gû\u0090®é\u0000 暺攑\t歭圭桚柂昳旓zUV\u0011G\bô(àÌ\u0084\u007f-jÌ\u0091\u001e!¿\u0000\u0083"
         .length();
      r(null);
      char var9 = 6;
      int var16 = -1;

      label61:
      while (true) {
         byte var10000 = 102;
         String var10001 = var10.substring(++var16, var16 + var9);
         byte var10002 = -1;

         while (true) {
            label56: {
               char[] var34 = var10001.toCharArray();
               int var10004 = var34.length;
               int var14 = 0;
               byte var37 = var10000;
               var30 = var34;
               int var22 = var10004;
               byte var43;
               char[] var48;
               int var10006;
               if (var10004 <= 1) {
                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               } else {
                  var37 = var10000;
                  var22 = var10004;
                  if (var10004 <= var14) {
                     break label56;
                  }

                  var48 = var34;
                  var43 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var57 = var48[var10006];
                  byte var58;
                  switch (var14 % 7) {
                     case 0:
                        var58 = 44;
                        break;
                     case 1:
                        var58 = 88;
                        break;
                     case 2:
                        var58 = 23;
                        break;
                     case 3:
                        var58 = 14;
                        break;
                     case 4:
                        var58 = 28;
                        break;
                     case 5:
                        var58 = 9;
                        break;
                     default:
                        var58 = 113;
                  }

                  var48[var10006] = (char)(var57 ^ var43 ^ var58);
                  var14++;
                  if (var37 == 0) {
                     var10006 = var37;
                     var48 = var30;
                     var43 = var37;
                  } else {
                     if (var22 <= var14) {
                        break;
                     }

                     var48 = var30;
                     var43 = var37;
                     var10006 = var14;
                  }
               }
            }

            String var39 = new String(var30).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var39;
                  if ((var16 += var9) >= var12) {
                     c = var13;
                     d = new String[21];
                     long var0 = 16358560411600082L;
                     long[] var6 = new long[3];
                     int var3 = 0;
                     String var4 = "_v{k\u0001\u00145,8º8!\u0006fù\u009c\u007fDFýäh,\u0012";
                     int var5 = "_v{k\u0001\u00145,8º8!\u0006fù\u009c\u007fDFýäh,\u0012".length();
                     byte var2 = 0;

                     do {
                        byte var24 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var24, var2).getBytes("ISO-8859-1");
                        int var25 = var3++;
                        long var47 = (
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
                        byte var40 = -1;
                        var6[var25] = var47;
                     } while (var2 < var5);

                     e = var6;
                     f = new Integer[3];
                     return;
                  }

                  var9 = var10.charAt(var16);
                  break;
               default:
                  var13[var11++] = var39;
                  if ((var16 += var9) < var12) {
                     var9 = var10.charAt(var16);
                     continue label61;
                  }

                  var10 = "\u0087EQ<éó\u0018%\u0003\u009c´ò\b毢坎仝辋曌旌,\u0005";
                  var12 = "\u0087EQ<éó\u0018%\u0003\u009c´ò\b毢坎仝辋曌旌,\u0005".length();
                  var9 = '\f';
                  var16 = -1;
            }

            var10000 = 49;
            var10001 = var10.substring(++var16, var16 + var9);
            var10002 = 0;
         }
      }
   }

   private static String a(int var0, int var1) {
      int var2 = (var0 ^ -11796) & 65535;
      if (d[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 172;
               break;
            case 1:
               var10000 = 114;
               break;
            case 2:
               var10000 = 189;
               break;
            case 3:
               var10000 = 238;
               break;
            case 4:
               var10000 = 15;
               break;
            case 5:
               var10000 = 96;
               break;
            case 6:
               var10000 = 246;
               break;
            case 7:
               var10000 = 133;
               break;
            case 8:
               var10000 = 57;
               break;
            case 9:
               var10000 = 241;
               break;
            case 10:
               var10000 = 148;
               break;
            case 11:
               var10000 = 118;
               break;
            case 12:
               var10000 = 85;
               break;
            case 13:
               var10000 = 48;
               break;
            case 14:
               var10000 = 193;
               break;
            case 15:
               var10000 = 80;
               break;
            case 16:
               var10000 = 254;
               break;
            case 17:
               var10000 = 159;
               break;
            case 18:
               var10000 = 248;
               break;
            case 19:
               var10000 = 230;
               break;
            case 20:
               var10000 = 46;
               break;
            case 21:
               var10000 = 192;
               break;
            case 22:
               var10000 = 242;
               break;
            case 23:
               var10000 = 30;
               break;
            case 24:
               var10000 = 105;
               break;
            case 25:
               var10000 = 129;
               break;
            case 26:
               var10000 = 128;
               break;
            case 27:
               var10000 = 25;
               break;
            case 28:
               var10000 = 209;
               break;
            case 29:
               var10000 = 116;
               break;
            case 30:
               var10000 = 201;
               break;
            case 31:
               var10000 = 142;
               break;
            case 32:
               var10000 = 135;
               break;
            case 33:
               var10000 = 43;
               break;
            case 34:
               var10000 = 178;
               break;
            case 35:
               var10000 = 169;
               break;
            case 36:
               var10000 = 240;
               break;
            case 37:
               var10000 = 132;
               break;
            case 38:
               var10000 = 176;
               break;
            case 39:
               var10000 = 106;
               break;
            case 40:
               var10000 = 130;
               break;
            case 41:
               var10000 = 69;
               break;
            case 42:
               var10000 = 117;
               break;
            case 43:
               var10000 = 61;
               break;
            case 44:
               var10000 = 97;
               break;
            case 45:
               var10000 = 196;
               break;
            case 46:
               var10000 = 217;
               break;
            case 47:
               var10000 = 153;
               break;
            case 48:
               var10000 = 29;
               break;
            case 49:
               var10000 = 216;
               break;
            case 50:
               var10000 = 42;
               break;
            case 51:
               var10000 = 160;
               break;
            case 52:
               var10000 = 45;
               break;
            case 53:
               var10000 = 18;
               break;
            case 54:
               var10000 = 36;
               break;
            case 55:
               var10000 = 32;
               break;
            case 56:
               var10000 = 1;
               break;
            case 57:
               var10000 = 224;
               break;
            case 58:
               var10000 = 147;
               break;
            case 59:
               var10000 = 188;
               break;
            case 60:
               var10000 = 62;
               break;
            case 61:
               var10000 = 70;
               break;
            case 62:
               var10000 = 191;
               break;
            case 63:
               var10000 = 49;
               break;
            case 64:
               var10000 = 164;
               break;
            case 65:
               var10000 = 225;
               break;
            case 66:
               var10000 = 210;
               break;
            case 67:
               var10000 = 166;
               break;
            case 68:
               var10000 = 190;
               break;
            case 69:
               var10000 = 31;
               break;
            case 70:
               var10000 = 121;
               break;
            case 71:
               var10000 = 7;
               break;
            case 72:
               var10000 = 200;
               break;
            case 73:
               var10000 = 235;
               break;
            case 74:
               var10000 = 72;
               break;
            case 75:
               var10000 = 144;
               break;
            case 76:
               var10000 = 83;
               break;
            case 77:
               var10000 = 100;
               break;
            case 78:
               var10000 = 253;
               break;
            case 79:
               var10000 = 122;
               break;
            case 80:
               var10000 = 158;
               break;
            case 81:
               var10000 = 98;
               break;
            case 82:
               var10000 = 94;
               break;
            case 83:
               var10000 = 11;
               break;
            case 84:
               var10000 = 195;
               break;
            case 85:
               var10000 = 154;
               break;
            case 86:
               var10000 = 127;
               break;
            case 87:
               var10000 = 228;
               break;
            case 88:
               var10000 = 8;
               break;
            case 89:
               var10000 = 203;
               break;
            case 90:
               var10000 = 99;
               break;
            case 91:
               var10000 = 185;
               break;
            case 92:
               var10000 = 73;
               break;
            case 93:
               var10000 = 84;
               break;
            case 94:
               var10000 = 165;
               break;
            case 95:
               var10000 = 167;
               break;
            case 96:
               var10000 = 124;
               break;
            case 97:
               var10000 = 244;
               break;
            case 98:
               var10000 = 88;
               break;
            case 99:
               var10000 = 123;
               break;
            case 100:
               var10000 = 170;
               break;
            case 101:
               var10000 = 229;
               break;
            case 102:
               var10000 = 202;
               break;
            case 103:
               var10000 = 13;
               break;
            case 104:
               var10000 = 194;
               break;
            case 105:
               var10000 = 67;
               break;
            case 106:
               var10000 = 22;
               break;
            case 107:
               var10000 = 101;
               break;
            case 108:
               var10000 = 112;
               break;
            case 109:
               var10000 = 245;
               break;
            case 110:
               var10000 = 220;
               break;
            case 111:
               var10000 = 146;
               break;
            case 112:
               var10000 = 140;
               break;
            case 113:
               var10000 = 138;
               break;
            case 114:
               var10000 = 12;
               break;
            case 115:
               var10000 = 120;
               break;
            case 116:
               var10000 = 131;
               break;
            case 117:
               var10000 = 226;
               break;
            case 118:
               var10000 = 53;
               break;
            case 119:
               var10000 = 232;
               break;
            case 120:
               var10000 = 250;
               break;
            case 121:
               var10000 = 51;
               break;
            case 122:
               var10000 = 77;
               break;
            case 123:
               var10000 = 187;
               break;
            case 124:
               var10000 = 76;
               break;
            case 125:
               var10000 = 33;
               break;
            case 126:
               var10000 = 93;
               break;
            case 127:
               var10000 = 16;
               break;
            case 128:
               var10000 = 40;
               break;
            case 129:
               var10000 = 233;
               break;
            case 130:
               var10000 = 236;
               break;
            case 131:
               var10000 = 87;
               break;
            case 132:
               var10000 = 63;
               break;
            case 133:
               var10000 = 75;
               break;
            case 134:
               var10000 = 214;
               break;
            case 135:
               var10000 = 10;
               break;
            case 136:
               var10000 = 91;
               break;
            case 137:
               var10000 = 212;
               break;
            case 138:
               var10000 = 86;
               break;
            case 139:
               var10000 = 239;
               break;
            case 140:
               var10000 = 58;
               break;
            case 141:
               var10000 = 68;
               break;
            case 142:
               var10000 = 161;
               break;
            case 143:
               var10000 = 107;
               break;
            case 144:
               var10000 = 184;
               break;
            case 145:
               var10000 = 198;
               break;
            case 146:
               var10000 = 65;
               break;
            case 147:
               var10000 = 181;
               break;
            case 148:
               var10000 = 119;
               break;
            case 149:
               var10000 = 55;
               break;
            case 150:
               var10000 = 134;
               break;
            case 151:
               var10000 = 182;
               break;
            case 152:
               var10000 = 156;
               break;
            case 153:
               var10000 = 28;
               break;
            case 154:
               var10000 = 137;
               break;
            case 155:
               var10000 = 78;
               break;
            case 156:
               var10000 = 175;
               break;
            case 157:
               var10000 = 251;
               break;
            case 158:
               var10000 = 218;
               break;
            case 159:
               var10000 = 183;
               break;
            case 160:
               var10000 = 21;
               break;
            case 161:
               var10000 = 56;
               break;
            case 162:
               var10000 = 108;
               break;
            case 163:
               var10000 = 113;
               break;
            case 164:
               var10000 = 125;
               break;
            case 165:
               var10000 = 64;
               break;
            case 166:
               var10000 = 223;
               break;
            case 167:
               var10000 = 136;
               break;
            case 168:
               var10000 = 221;
               break;
            case 169:
               var10000 = 177;
               break;
            case 170:
               var10000 = 47;
               break;
            case 171:
               var10000 = 104;
               break;
            case 172:
               var10000 = 115;
               break;
            case 173:
               var10000 = 213;
               break;
            case 174:
               var10000 = 162;
               break;
            case 175:
               var10000 = 14;
               break;
            case 176:
               var10000 = 199;
               break;
            case 177:
               var10000 = 186;
               break;
            case 178:
               var10000 = 215;
               break;
            case 179:
               var10000 = 9;
               break;
            case 180:
               var10000 = 145;
               break;
            case 181:
               var10000 = 17;
               break;
            case 182:
               var10000 = 81;
               break;
            case 183:
               var10000 = 243;
               break;
            case 184:
               var10000 = 109;
               break;
            case 185:
               var10000 = 231;
               break;
            case 186:
               var10000 = 59;
               break;
            case 187:
               var10000 = 4;
               break;
            case 188:
               var10000 = 126;
               break;
            case 189:
               var10000 = 2;
               break;
            case 190:
               var10000 = 211;
               break;
            case 191:
               var10000 = 20;
               break;
            case 192:
               var10000 = 3;
               break;
            case 193:
               var10000 = 24;
               break;
            case 194:
               var10000 = 19;
               break;
            case 195:
               var10000 = 74;
               break;
            case 196:
               var10000 = 249;
               break;
            case 197:
               var10000 = 90;
               break;
            case 198:
               var10000 = 66;
               break;
            case 199:
               var10000 = 141;
               break;
            case 200:
               var10000 = 60;
               break;
            case 201:
               var10000 = 204;
               break;
            case 202:
               var10000 = 79;
               break;
            case 203:
               var10000 = 163;
               break;
            case 204:
               var10000 = 50;
               break;
            case 205:
               var10000 = 237;
               break;
            case 206:
               var10000 = 102;
               break;
            case 207:
               var10000 = 150;
               break;
            case 208:
               var10000 = 143;
               break;
            case 209:
               var10000 = 222;
               break;
            case 210:
               var10000 = 27;
               break;
            case 211:
               var10000 = 173;
               break;
            case 212:
               var10000 = 26;
               break;
            case 213:
               var10000 = 208;
               break;
            case 214:
               var10000 = 151;
               break;
            case 215:
               var10000 = 23;
               break;
            case 216:
               var10000 = 34;
               break;
            case 217:
               var10000 = 41;
               break;
            case 218:
               var10000 = 44;
               break;
            case 219:
               var10000 = 139;
               break;
            case 220:
               var10000 = 247;
               break;
            case 221:
               var10000 = 6;
               break;
            case 222:
               var10000 = 38;
               break;
            case 223:
               var10000 = 168;
               break;
            case 224:
               var10000 = 205;
               break;
            case 225:
               var10000 = 52;
               break;
            case 226:
               var10000 = 149;
               break;
            case 227:
               var10000 = 174;
               break;
            case 228:
               var10000 = 227;
               break;
            case 229:
               var10000 = 89;
               break;
            case 230:
               var10000 = 54;
               break;
            case 231:
               var10000 = 111;
               break;
            case 232:
               var10000 = 171;
               break;
            case 233:
               var10000 = 82;
               break;
            case 234:
               var10000 = 157;
               break;
            case 235:
               var10000 = 255;
               break;
            case 236:
               var10000 = 103;
               break;
            case 237:
               var10000 = 180;
               break;
            case 238:
               var10000 = 207;
               break;
            case 239:
               var10000 = 234;
               break;
            case 240:
               var10000 = 155;
               break;
            case 241:
               var10000 = 152;
               break;
            case 242:
               var10000 = 179;
               break;
            case 243:
               var10000 = 197;
               break;
            case 244:
               var10000 = 110;
               break;
            case 245:
               var10000 = 39;
               break;
            case 246:
               var10000 = 252;
               break;
            case 247:
               var10000 = 37;
               break;
            case 248:
               var10000 = 219;
               break;
            case 249:
               var10000 = 5;
               break;
            case 250:
               var10000 = 71;
               break;
            case 251:
               var10000 = 92;
               break;
            case 252:
               var10000 = 35;
               break;
            case 253:
               var10000 = 0;
               break;
            case 254:
               var10000 = 206;
               break;
            default:
               var10000 = 95;
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

         d[var2] = new String(var3).intern();
      }

      return d[var2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6209;
      if (f[var3] == null) {
         f[var3] = (int)(e[var3] ^ var1);
      }

      return f[var3];
   }
}





