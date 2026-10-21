package com.finalshell.ui.panel;

import com.finalshell.core.C;
import com.finalshell.core.Fv2_2;
import com.finalshell.core.T32;
import com.finalshell.core.TH3;
import com.finalshell.core.XF3;
import com.finalshell.crypto.ConnectHost;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.task.Di2;
import com.finalshell.task.Ff4;
import com.finalshell.ui.listener.BC3;
import com.finalshell.ui.listener.GK;
import com.finalshell.ui.listener.JQ;
import com.finalshell.ui.listener.Kp2;
import com.finalshell.ui.listener.O62;
import com.finalshell.ui.listener.X_;
import com.finalshell.ui.listener.YN3;
import com.finalshell.ui.listener.YX;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Window;
import java.lang.reflect.InvocationTargetException;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import net.miginfocom.swing.MigLayout;

public class Bq2 extends O {
   public T32 B;
   public AM T;
   public Bq2 J;
   public int a;
   public Color w;
   public Color k;
   public Color j;
   public Color L;
   public Color i;
   public Color y;
   public Color h;
   public Color W;
   public Border x;
   public Border N;
   public Border f;
   public Border s;
   public boolean C;
   public boolean m;
   public boolean z;
   public int E;
   public boolean v;
   public JLabel O;
   public long M;
   public boolean S;
   public boolean G;
   public JPanel l;
   public long b;
   public boolean I;
   public T2 e;
   public long g;
   public Yg2 F;
   public AM X;
   public TH3 A;
   public JLabel r;
   public Window Q;
   public Point o;
   public Point d;
   public Point n;
   public C K;
   public C p;
   public boolean u;
   public boolean Z;
   public boolean U;
   public static String[] c;
   public static String[] q;
   public static long[] t;
   public static Integer[] D;

   public Bq2(T32 var1, AM var2, boolean var3, boolean var4, boolean var5, int var6, boolean var7) {
   super();
   boolean var217;
   long var33;
   long var37;
   long var39;
   long var57;
      label216: {
         Color var10001 = new Color(b(14744, 2579293605355848411L), b(16177, 5399903379597100135L), b(16177, 5399903379597100135L));
         long var17 = 300793705977237886L;
         Color var16 = var10001;
         Ref.s(300793705977237886L, var16, var17);
         Color var10002 = new Color(b(16716, 6335565339365931579L));
         long var19 = 544542606382447190L;
         Color var18 = var10002;
         Ref.s(544542606382447190L, var18, var19);
         Object var20 = 300793705977237886L;
         Object var10004 = Ref.g(300793705977237886L, var20);
         long var23 = 260498270062849145L;
         Object var22 = var10004;
         Ref.s(260498270062849145L, var22, var23);
         Color var10005 = new Color(b(25897, 7205134109817560673L), b(8318, 4143026322521529124L), b(8318, 4143026322521529124L));
         long var25 = 624766743350519726L;
         Color var24 = var10005;
         Ref.s(624766743350519726L, var24, var25);
         Object var26 = 624766743350519726L;
         Object var10007 = Ref.g(624766743350519726L, var26);
         long var29 = 132907106891851987L;
         Object var28 = var10007;
         Ref.s(132907106891851987L, var28, var29);
         Color var10008 = new Color(b(17638, 8362263678876450742L), b(18974, 4429970689808920908L), b(18974, 4429970689808920908L));
         long var31 = 372692518757921471L;
         Color var30 = var10008;
         Ref.s(372692518757921471L, var30, var31);
         short var191 = 24411;
         Registry.lookupField(613636876466420761L).setBoolean(this, false);
         long var10009 = 4957250566891136005L;
         Registry.lookupField(223239328082186834L).setBoolean(this, false);
         Registry.lookupField(373975248585568357L).setBoolean(this, false);
         Registry.lookupField(327725816926172471L).setBoolean(this, false);
         Registry.lookupField(265947950920722185L).setLong(this, 0L);
         Registry.lookupField(515313227049281099L).setBoolean(this, false);
         AM.s$arrString();
         Registry.lookupField(292988288778102177L).setBoolean(this, false);
         Registry.lookupField(166665882978501038L).setBoolean(this, true);
         Registry.lookupField(451154194190924563L).setBoolean(this, true);
         Registry.lookupField(120501553429581714L).setBoolean(this, false);
         Registry.lookupField(451154194190924563L).setBoolean(this, var7);
         Registry.lookupField(466539178470875130L).setBoolean(this, var5);
         var33 = 293938313616336078L;
         Ref.s(293938313616336078L, var2, var33);
         Registry.lookupField(515313227049281099L).setBoolean(this, (boolean)var3);
         Registry.lookupField(292988288778102177L).setBoolean(this, (boolean)var4);
         long var35 = 626705182228648464L;
         Ref.s(626705182228648464L, var2, var35);
         var37 = 162955545315895464L;
         Ref.s(162955545315895464L, var1, var37);
         Object[] var10015 = Registry.emptyArgs();
         var39 = 311724385945399618L;
         Object[] var38 = var10015;
         var10015 = Ref.h(311724385945399618L, var38, var39);
         long var41 = 461249878665463746L;
         Object var40 = var10015;
         Ref.s(461249878665463746L, var40, var41);
         long var43 = 158293829082319616L;
         Ref.s(158293829082319616L, this, var43);
         this.setOpaque(true);
         this.setFocusable(false);
         this.setFont((Font)Registry.lookupField(395970988011231853L).get(null));
         Object var44 = 624766743350519726L;
         this.setForeground((Color)Ref.g(624766743350519726L, var44));
         Object var46 = 300793705977237886L;
         this.setBackground((Color)Ref.g(300793705977237886L, var46));
         int var9 = b((int)this, (long)this);
         Color var10 = new Color(var9, var9, var9);
         CompoundBorder var11 = BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(b(9395, 4617997373717946353L), b(7482, 4915632447285896829L), b(14248, 5602972193452002545L))),
            BorderFactory.createEmptyBorder(0, 0, 0, 0)
         );
         CompoundBorder var12 = BorderFactory.createCompoundBorder(var11, BorderFactory.createEmptyBorder(0, 1, 4, 4));
         Bq2 var10016 = (Bq2)var3;
         if (this == null) {
            if (var3 == false) {
               Color var10017 = new Color(b(420, 3750912443984067298L), b(1070, 6792388483839180662L), b(1070, 6792388483839180662L));
               long var49 = 293415747511525795L;
               Color var48 = var10017;
               Ref.s(293415747511525795L, var48, var49);
               Color var10018 = new Color(b(8124, 3502411527172564199L), b(32468, 1866864467146622352L), b(32468, 1866864467146622352L));
               long var51 = 627386361665190277L;
               Color var50 = var10018;
               Ref.s(627386361665190277L, var50, var51);
               CompoundBorder var10019 = BorderFactory.createCompoundBorder(
                  BorderFactory.createMatteBorder(1, 1, 1, 1, var10), BorderFactory.createEmptyBorder(0, 1, 2, 4)
               );
               long var53 = 377102286771712366L;
               CompoundBorder var52 = var10019;
               Ref.s(377102286771712366L, var52, var53);
               CompoundBorder var10020 = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 1, 1, var10), var12);
               long var55 = 307353262184556454L;
               CompoundBorder var54 = var10020;
               Ref.s(307353262184556454L, var54, var55);
               CompoundBorder var10021 = BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0, 1, 0, 1, var10), var12);
               var57 = 443819559899318671L;
               CompoundBorder var56 = var10021;
               Ref.s(443819559899318671L, var56, var57);
               Object var58 = 377102286771712366L;
               this.setBorder((Border)Ref.g(377102286771712366L, var58));
               this.m(var6);
               this.a(b(32468, 1866864467146622352L));
               if (this == null) {
                  break label216;
               }

               Ky4.K(new String[5]);
            }

            var10016 = this;
            Color var193 = new Color(b(21892, 822893476570984151L), b(15624, 6693053654224078456L), b(15624, 6693053654224078456L));
            long var61 = 293415747511525795L;
            Color var60 = var193;
            Ref.s(293415747511525795L, var60, var61);
            Color var196 = new Color(0, 0, 0);
            long var63 = 627386361665190277L;
            Color var62 = var196;
            Ref.s(627386361665190277L, var62, var63);
            Color var199 = new Color(b(269, 75068276785527422L), b(315, 3040994367110298215L), b(315, 3040994367110298215L));
            long var65 = 300793705977237886L;
            Color var64 = var199;
            Ref.s(300793705977237886L, var64, var65);
            Color var201 = new Color(b(10822, 75000017991602459L), b(10282, 586643745592972131L), b(23568, 8350837898814351198L));
            long var67 = 544542606382447190L;
            Color var66 = var201;
            Ref.s(544542606382447190L, var66, var67);
            Color var203 = new Color(b(27823, 5997479627151857636L), b(27823, 5997479627151857636L), b(27823, 5997479627151857636L));
            long var69 = 372692518757921471L;
            Color var68 = var203;
            Ref.s(372692518757921471L, var68, var69);
         }

         if (this == null) {
            if (var10016 == null) {
               Color var194 = new Color(b(21297, 8102616426695846011L), b(21211, 1732522469089700239L), b(21211, 1732522469089700239L));
               long var71 = 544542606382447190L;
               Color var70 = var194;
               Ref.s(544542606382447190L, var70, var71);
            }

            var10 = new Color(b(6408, 8131986073360114247L), b(6408, 8131986073360114247L), b(6408, 8131986073360114247L), 0);
            CompoundBorder var195 = BorderFactory.createCompoundBorder(
               BorderFactory.createMatteBorder(1, 0, 1, 0, var10), BorderFactory.createEmptyBorder(0, 0, 1, 0)
            );
            long var73 = 377102286771712366L;
            CompoundBorder var72 = var195;
            Ref.s(377102286771712366L, var72, var73);
            boolean var197 = false;
            Object var74 = 544542606382447190L;
            CompoundBorder var200 = BorderFactory.createCompoundBorder(
               BorderFactory.createMatteBorder(0, 0, 0, (int)this, (Color)Ref.g(544542606382447190L, var74)), BorderFactory.createEmptyBorder(1, 0, 2, 0)
            );
            long var77 = 307353262184556454L;
            CompoundBorder var76 = var200;
            Ref.s(307353262184556454L, var76, var77);
            Object var78 = 307353262184556454L;
            Object var204 = Ref.g(307353262184556454L, var78);
            long var81 = 443819559899318671L;
            Object var80 = var204;
            Ref.s(443819559899318671L, var80, var81);
            boolean var205 = false;
         }

         Object var82 = 544542606382447190L;
         CompoundBorder var13 = BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(0, 0, 0, (int)this, (Color)Ref.g(544542606382447190L, var82)), BorderFactory.createEmptyBorder(1, 0, 1, 0)
         );
         CompoundBorder var198 = BorderFactory.createCompoundBorder(var13, BorderFactory.createEmptyBorder(1, 0, 0, 0));
         long var85 = 458932370313530971L;
         CompoundBorder var84 = var198;
         Ref.s(458932370313530971L, var84, var85);
         Object var86 = 377102286771712366L;
         this.setBorder((Border)Ref.g(377102286771712366L, var86));
         this.m(0);
         this.a(0);
      }

      Bq2 var206;
      label205: {
         label217: {
            this.addMouseListener(new YN3(this, var2, var1, (boolean)var3));
            this.addMouseMotionListener(new GK(this, var2));
            JLabel var202 = new JLabel();
            long var89 = 379501722659427188L;
            JLabel var88 = var202;
            Ref.s(379501722659427188L, var88, var89);
            Object var90 = 379501722659427188L;
            ((JLabel)Ref.g(379501722659427188L, var90)).setOpaque(false);
            Object var92 = 379501722659427188L;
            ((JLabel)Ref.g(379501722659427188L, var92)).setForeground(Color.black);
            Object var94 = 379501722659427188L;
            ((JLabel)Ref.g(379501722659427188L, var94)).setFont(((Font)Registry.lookupField(395970988011231853L).get(null)).deriveFont(1));
            Object var96 = 379501722659427188L;
            JLabel var10024 = (JLabel)Ref.g(379501722659427188L, var96);
            Object var98 = 293415747511525795L;
            this.setForeground((Color)Ref.g(293415747511525795L, var98));
            byte var188 = 5;
            var206 = (Bq2)var3;
            if (this == null) {
               if (var3 == false) {
                  if (var5) {
                  }

                  label199: {
                     this.setLayout(new MigLayout(a(-30241, 1738), a(-30250, 24338), ""));
                     var206 = this;
                     JPanel var10026 = new JPanel();
                     long var101 = 230343044027405758L;
                     JPanel var100 = var10026;
                     Ref.s(230343044027405758L, var100, var101);
                     Object var102 = 230343044027405758L;
                     ((JPanel)Ref.g(230343044027405758L, var102)).setOpaque(false);
                     Object var104 = 230343044027405758L;
                     ((JPanel)Ref.g(230343044027405758L, var104)).setLayout(new MigLayout(a(-30246, 4155)));
                     if (this == null) {
                        Object var106 = 230343044027405758L;
                        this.add((JPanel)Ref.g(230343044027405758L, var106));
                        if (var5) {
                           Object var108 = 230343044027405758L;
                           ((JPanel)Ref.g(230343044027405758L, var108)).setLayout(new MigLayout(a(-30243, -944), a(-30253, -30861), a(-30245, -27024)));
                           Registry.packArgs("\uf111");
                           long var110 = 360256375153447639L;
                           Object var10032 = Ref.h2(360256375153447639L, var110);
                           long var113 = 352540136562697034L;
                           Object var112 = var10032;
                           Ref.s(352540136562697034L, var112, var113);
                           Object var114 = 352540136562697034L;
                           ((T2)Ref.g(352540136562697034L, var114)).setFont((Font)Registry.lookupField(274038791171154177L).get(null));
                           Object var116 = 352540136562697034L;
                           ((T2)Ref.g(352540136562697034L, var116)).setForeground(new Color(0, b(28264, 7667561913138861353L), 0));
                           RenderingHints var14 = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                           Object var118 = 352540136562697034L;
                           Ref.g(352540136562697034L, var118);
                           Object[] var10036 = Registry.packArgs(var14);
                           long var121 = 220446426539185335L;
                           Object[] var120 = var10036;
                           Ref.h(220446426539185335L, var120, var121);

                           try {
                              ;
                           } catch (InvocationTargetException var186) {
                              throw var186.getTargetException();
                           }

                           Object var122 = 230343044027405758L;
                           JPanel var10037 = (JPanel)Ref.g(230343044027405758L, var122);
                           Object var124 = 352540136562697034L;
                           this.add((T2)Ref.g(352540136562697034L, var124));
                           if (this == null) {
                              break label199;
                           }
                        }
                     }

                     Object var126 = 230343044027405758L;
                     ((JPanel)Ref.g(230343044027405758L, var126)).setLayout(new MigLayout(a(-30248, -20102), a(-30251, 8831), a(-30251, 8831)));
                  }

                  if (this != null) {
                     break label205;
                  }

                  if (!var7) {
                     break label217;
                  }

                  Object var10030 = Registry.emptyArgs();
                  long var129 = 504747349565446806L;
                  Object var128 = var10030;
                  var10030 = Ref.h(504747349565446806L, var128, var129);

                  try {
                     var217 = (Boolean)var10030;
                  } catch (InvocationTargetException var185) {
                     throw var185.getTargetException();
                  }

                  if (this != null) {
                     break label205;
                  }

                  if (!var217) {
                     break label217;
                  }

                  Object var130 = 230343044027405758L;
                  JPanel var10031 = (JPanel)Ref.g(230343044027405758L, var130);
                  Object var132 = 379501722659427188L;
                  this.add((JLabel)Ref.g(379501722659427188L, var132));
                  if (this == null) {
                     break label217;
                  }
               }

               var206 = (Bq2)var4;
            }

            if (var206 == null) {
               this.setLayout(new MigLayout(a(-30256, 13795), a(-30255, 22655), ""));
               if (this == null) {
                  break label217;
               }
            }

            this.setLayout(new MigLayout(a(-30252, 9046), a(-30254, 4316), ""));
         }

         var206 = (Bq2)var3;
      }

      if (this == null) {
         label159:
         if (var206 == null) {
            String var189 = "\uf114";
            if (var4 != false) {
               var189 = "";
            }

            Registry.packArgs(var189);
            long var134 = 360256375153447639L;
            Object var207 = Ref.h2(360256375153447639L, var134);

            try {
               var207 = (T2)var207;
            } catch (InvocationTargetException var184) {
               throw var184.getTargetException();
            }

            T2 var15;
            label165: {
               var15 = (T2)var207;
               if (this == null) {
                  if (var4 != false) {
                     var15.setForeground(
                        new Color(
                           b(10218, 7432331215134661813L), b(26383, 5748563541720259651L), b(26383, 5748563541720259651L), b(27212, 5423888949988970814L)
                        )
                     );
                     var15.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
                     if (this == null) {
                        break label165;
                     }
                  }

                  var15.setForeground(new Color(b(32468, 1866864467146622352L), b(32468, 1866864467146622352L), b(32468, 1866864467146622352L)));
               }

               var15.setFont((Font)Registry.lookupField(215818181678426769L).get(null));
            }

            if (var4 != false) {
               var15.setForeground(
                  new Color(b(26383, 5748563541720259651L), b(26383, 5748563541720259651L), b(26383, 5748563541720259651L), b(29679, 1973385342572120234L))
               );
               var15.setFont((Font)Registry.lookupField(164046876459002055L).get(null));
               this.add(var15, a(-30247, -26813));
               if (this == null) {
                  break label159;
               }
            }

            this.add(var15, a(-30244, -2960));
         }

         var206 = this;
         JLabel var209 = new JLabel();
         long var137 = 184969517688200929L;
         JLabel var136 = var209;
         Ref.s(184969517688200929L, var136, var137);
         Object var138 = 184969517688200929L;
         this.add((JLabel)Ref.g(184969517688200929L, var138), a(-30242, 17231));
      }

      if (this == null) {
         if (var206 == null) {
            Registry.packArgs("\uf013");
            long var140 = 378399160856121064L;
            Object var10027 = Ref.h2(378399160856121064L, var140);
            long var143 = 142636479780034040L;
            Object var142 = var10027;
            Ref.s(142636479780034040L, var142, var143);
            Color var190 = new Color(
               b(26383, 5748563541720259651L), b(26593, 2311198898304015521L), b(5209, 444215567343955726L), b(31027, 8257738072422302274L)
            );
            Object var144 = 142636479780034040L;
            ((C)Ref.g(142636479780034040L, var144)).setForeground(var190);
            Object var146 = 142636479780034040L;
            ((C)Ref.g(142636479780034040L, var146)).addMouseMotionListener(new X_(this));
            Object var148 = 142636479780034040L;
            ((C)Ref.g(142636479780034040L, var148)).addActionListener(new Kp2(this, var2, var1));
            Object var150 = 142636479780034040L;
            this.add((C)Ref.g(142636479780034040L, var150));
            Object var152 = 142636479780034040L;
            ((C)Ref.g(142636479780034040L, var152)).addMouseListener(new O62(this, var1, var2));
            Registry.packArgs("\uf040");
            long var154 = 378399160856121064L;
            Object var10034 = Ref.h2(378399160856121064L, var154);
            long var157 = 262513755368574019L;
            Object var156 = var10034;
            Ref.s(262513755368574019L, var156, var157);
            Object var158 = 262513755368574019L;
            ((C)Ref.g(262513755368574019L, var158)).setForeground(new Color(0, 0, 0, b(29679, 1973385342572120234L)));
            Object var160 = 262513755368574019L;
            ((C)Ref.g(262513755368574019L, var160)).addMouseMotionListener(new JQ(this));
         }

         var206 = (Bq2)var3;
      }

      if (this == null) {
         if (var206 == null) {
            Object var162 = 184969517688200929L;
            ((JLabel)Ref.g(184969517688200929L, var162)).setFont(((Font)Registry.lookupField(395970988011231853L).get(null)).deriveFont(1));
         }

         var206 = this;
         Yg2 var210 = new Yg2();
         long var165 = 275545539772972982L;
         Yg2 var164 = var210;
         Ref.s(275545539772972982L, var164, var165);
         if (this != null) {
            return;
         }
      }

      label223: {
         label144:
         if (var206 == null) {
            Boolean var211 = (Boolean)(Registry.emptyArgs());
            long var167 = 120571880662107930L;
            Object var166 = var211;
            var211 = Ref.h(120571880662107930L, var166, var167);

            try {
               var211 = (Boolean)var211;
            } catch (InvocationTargetException var183) {
               throw var183.getTargetException();
            }

            if (this == null) {
               if (var211 == null) {
                  break label144;
               }

               var211 = (Boolean)(this);
               if (this != null) {
                  break label223;
               }

               Object[] var214 = Registry.emptyArgs();
               long var169 = 589411218730404657L;
               Object[] var168 = var214;
               var214 = Ref.h(589411218730404657L, var168, var169);

               try {
               } catch (InvocationTargetException var182) {
                  throw var182.getTargetException();
               }
            }

            if (var211 == null) {
               Object var170 = 275545539772972982L;
               this.add((Yg2)Ref.g(275545539772972982L, var170), a(-30249, 21314));
            }
         }

         Object var172 = 275545539772972982L;
         ((Yg2)Ref.g(275545539772972982L, var172)).addMouseListener(new BC3(this, var2, var1));
         Object var174 = 275545539772972982L;
         ((Yg2)Ref.g(275545539772972982L, var174)).addMouseMotionListener(new YX(this));
         Object[] var10028 = Registry.packArgs(var1);
         long var177 = 379860037679905473L;
         Object[] var176 = var10028;
         Ref.h(379860037679905473L, var176, var177);

         try {
            ;
         } catch (InvocationTargetException var181) {
            throw var181.getTargetException();
         }
      }

      Object[] var10029 = Registry.emptyArgs();
      long var179 = 617560774607040089L;
      Object[] var178 = var10029;
      Ref.h(617560774607040089L, var178, var179);

      try {
         ;
      } catch (InvocationTargetException var180) {
         throw var180.getTargetException();
      }
   }

   public void r() {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 273754091082965916L;
      Object[] var1 = var10001;
      Ref.h(273754091082965916L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var5) {
         throw var5.getTargetException();
      }

      Registry.lookupField(388376917454860932L).get(null);
      Object[] var10002 = Registry.packArgs(new Ff4(this), b(5209, 444215567343955726L));
      long var4 = 266288712085965362L;
      Object[] var3 = var10002;
      Ref.h(266288712085965362L, var3, var4);
   }

   public void d() {
      String[] var10000 = AM.s$arrString();
      boolean var2 = false;
      String[] var1 = var10000;
      if (var1 == null && this.getMousePosition() != null) {
         var2 = true;
      }

      label71: {
         Object var3 = 262513755368574019L;
         Object var10001 = (C)Ref.g(262513755368574019L, var3);
         if (var1 == null) {
            if (var10001 == null) {
               break label71;
            }

            var10001 = this;
            Object var5 = 262513755368574019L;
            C var10002 = (C)Ref.g(262513755368574019L, var5);
         }

         if (((C)var10001).getMousePosition() != null) {
            var2 = true;
         }
      }

      Bq2 var21;
      label75: {
         label76: {
            boolean var20 = var2;
            if (var1 == null) {
               var21 = (Bq2)(Registry.lookupField(120501553429581714L).getBoolean(this));
               if (var2 == var21) {
                  break label76;
               }

               var20 = var2;
            }

            label77: {
               if (var20) {
                  Object[] var22 = Registry.emptyArgs();
                  long var8 = 168016210297284127L;
                  Object[] var7 = var22;
                  Ref.h(168016210297284127L, var7, var8);

                  try {
                     ;
                  } catch (InvocationTargetException var19) {
                     throw var19.getTargetException();
                  }

                  if (var1 == null) {
                     break label77;
                  }
               }

               Object[] var23 = Registry.emptyArgs();
               long var10 = 467250021884313480L;
               Object[] var9 = var23;
               Ref.h(467250021884313480L, var9, var10);

               try {
                  ;
               } catch (InvocationTargetException var18) {
                  throw var18.getTargetException();
               }
            }

            var21 = this;
            if (var1 != null) {
               break label75;
            }

            Object var11 = 262513755368574019L;
            if ((C)Ref.g(262513755368574019L, var11) != null) {
               Object var13 = 262513755368574019L;
               ((C)Ref.g(262513755368574019L, var13)).setVisible(var2);
            }
         }

         Object[] var10004 = Registry.packArgs(var2);
         long var16 = 620216792979765238L;
         Object[] var15 = var10004;
         Ref.h(620216792979765238L, var15, var16);

         try {
            ;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }
      }

      Registry.lookupField(120501553429581714L).setBoolean(var21, var2);
   }

   public void z(boolean var1) {
      Registry.lookupField(223239328082186834L).setBoolean(this, var1);
   }

   public void G() {
      Object[] var36;
      long var37;
      long var39;
      Object[] var40;
      long var57;
      String[] var1;
      byte var2;
      label181: {
         label184: {
            String[] var10000 = AM.s$arrString();
            var2 = 0;
            var1 = var10000;
            Object var4 = 293938313616336078L;
            Object var10001 = (AM)Ref.g(293938313616336078L, var4);
            if (var1 == null) {
               if (((AM)var10001).getMousePosition() != null) {
                  break label184;
               }

               var10001 = this;
               Object var6 = 293938313616336078L;
               Ref.g(293938313616336078L, var6);
               Registry.emptyArgs();
               long var8 = 299368763907830673L;
               Ref.h2(299368763907830673L, var8);
               Object[] var10004 = Registry.emptyArgs();
               long var11 = 404411013658768945L;
               Object[] var10 = var10004;
               Ref.h(404411013658768945L, var10, var11);

               try {
                  ;
               } catch (InvocationTargetException var79) {
                  throw var79.getTargetException();
               }
            }

            label174: {
               Object var3 = var10001;
               var10001 = var3;
               if (var1 == null) {
                  if (var3 == null) {
                     break label174;
                  }

                  var10001 = var3;
               }

               if (((AM)var10001).getMousePosition() != null) {
                  var2 = 1;
               }
            }

            if (var1 == null) {
               break label181;
            }
         }

         var2 = 1;
      }

      int var80 = -1;
      Object var12 = 293938313616336078L;
      Ref.g(293938313616336078L, var12);
      Registry.emptyArgs();
      long var14 = 299368763907830673L;
      Ref.h2(299368763907830673L, var14);
      Object var16 = 285898895368671213L;
      Object[] var10005 = Registry.packArgs(Ref.g(285898895368671213L, var16));
      long var19 = 183250126819599698L;
      Object[] var18 = var10005;
      Ref.h(183250126819599698L, var18, var19);

      try {
         ;
      } catch (InvocationTargetException var78) {
         throw var78.getTargetException();
      }

      Registry.emptyArgs();
      long var20 = 270389152141252877L;
      Ref.h2(270389152141252877L, var20);
      Object var10007 = Registry.emptyArgs();
      long var23 = 634817973682994708L;
      Object var22 = var10007;
      Ref.h(634817973682994708L, var22, var23);
      Window var10008 = Registry.emptyArgs();
      long var25 = 150426696032422115L;
      Object var24 = var10008;
      var10008 = Ref.h(150426696032422115L, var24, var25);

      try {
         var10008 = (Window)var10008;
      } catch (InvocationTargetException var77) {
         throw var77.getTargetException();
      }

      label186: {
         label164: {
            if (var1 == null) {
               Object var26 = 285898895368671213L;
               if (this.equals((Window)Ref.g(285898895368671213L, var26))) {
                  Object var28 = 285898895368671213L;
                  Point var10010 = ((Window)Ref.g(285898895368671213L, var28)).getMousePosition();
                  if (var1 != null) {
                     break label164;
                  }

                  if (var10010 != null) {
                     Object var30 = 293938313616336078L;
                     Ref.g(293938313616336078L, var30);
                     Registry.emptyArgs();
                     long var32 = 299368763907830673L;
                     Ref.h2(299368763907830673L, var32);
                     Registry.emptyArgs();
                     long var34 = 270389152141252877L;
                     Ref.h2(270389152141252877L, var34);
                     Object[] var10015 = Registry.emptyArgs();
                     var37 = 634817973682994708L;
                     var36 = var10015;
                     Ref.h(634817973682994708L, var36, var37);
                     Object[] var10016 = Registry.emptyArgs();
                     var39 = 150426696032422115L;
                     Object[] var38 = var10016;
                     var10016 = Registry.packArgs(Ref.h(150426696032422115L, var38, var39));
                     long var41 = 502455063883555969L;
                     var40 = var10016;
                     Ref.h(502455063883555969L, var40, var41);

                     try {
                        ;
                     } catch (InvocationTargetException var76) {
                        throw var76.getTargetException();
                     }

                     int var90 = var2;
                     if (var1 == null) {
                        if (var2 != 0) {
                           var80 = Registry.lookupField(299739253213373636L).getInt(null);
                           if (var1 == null) {
                              break label186;
                           }
                        }

                        var90 = Registry.lookupField(581124220784366544L).getInt(null);
                     }

                     var80 = var90;
                     if (var1 == null) {
                        break label186;
                     }
                  }
               }

               Registry.emptyArgs();
               long var42 = 270389152141252877L;
               Ref.h2(270389152141252877L, var42);
               Object[] var10011 = Registry.emptyArgs();
               long var45 = 634817973682994708L;
               Object[] var44 = var10011;
               Ref.h(634817973682994708L, var44, var45);
               Object[] var10012 = Registry.emptyArgs();
               long var47 = 150426696032422115L;
               Object[] var46 = var10012;
               Ref.h(150426696032422115L, var46, var47);

               try {
                  ;
               } catch (InvocationTargetException var75) {
                  throw var75.getTargetException();
               }
            }

            var10008 = (Window)(var10008.getMousePosition());
         }

         if (var10008 != null) {
            Object var48 = 293938313616336078L;
            Ref.g(293938313616336078L, var48);
            Registry.emptyArgs();
            long var50 = 299368763907830673L;
            Ref.h2(299368763907830673L, var50);
            Registry.emptyArgs();
            long var52 = 270389152141252877L;
            Ref.h2(270389152141252877L, var52);
            Object[] var10013 = Registry.emptyArgs();
            long var55 = 634817973682994708L;
            Object[] var54 = var10013;
            Ref.h(634817973682994708L, var54, var55);
            Object[] var10014 = Registry.emptyArgs();
            var57 = 150426696032422115L;
            Object[] var56 = var10014;
            var10014 = Registry.packArgs(Ref.h(150426696032422115L, var56, var57));
            long var59 = 502455063883555969L;
            Object[] var58 = var10014;
            Ref.h(502455063883555969L, var58, var59);

            try {
               ;
            } catch (InvocationTargetException var74) {
               throw var74.getTargetException();
            }

            int var87 = var2;
            if (var1 == null) {
               if (var2 != 0) {
                  var80 = Registry.lookupField(489009438537732568L).getInt(null);
                  if (var1 == null) {
                     break label186;
                  }
               }

               var87 = Registry.lookupField(617945104086657545L).getInt(null);
            }

            var80 = var87;
            if (var1 == null) {
               break label186;
            }
         }

         Object var60 = 293938313616336078L;
         Ref.g(293938313616336078L, var60);
         Registry.emptyArgs();
         long var62 = 299368763907830673L;
         Ref.h2(299368763907830673L, var62);
         Object[] var85 = Registry.packArgs(null);
         long var65 = 502455063883555969L;
         Object[] var64 = var85;
         Ref.h(502455063883555969L, var64, var65);

         try {
            ;
         } catch (InvocationTargetException var73) {
            throw var73.getTargetException();
         }

         var80 = Registry.lookupField(470891030811937041L).getInt(null);
      }

      Object var66 = 293938313616336078L;
      Ref.g(293938313616336078L, var66);
      Registry.emptyArgs();
      long var68 = 299368763907830673L;
      Ref.h2(299368763907830673L, var68);
      Object[] var88 = Registry.packArgs(var80);
      long var71 = 273888125386462853L;
      Object[] var70 = var88;
      Ref.h(273888125386462853L, var70, var71);

      try {
         ;
      } catch (InvocationTargetException var72) {
         throw var72.getTargetException();
      }
   }

   public void y() {
      boolean var36;
      Object[] var37;
      boolean var39;
      Object[] var40;
      AM.s$arrString();
      Object var3 = 293938313616336078L;
      Object var10002 = Ref.g(293938313616336078L, var3);
      Bq2 var10003 = (Bq2)(Registry.emptyArgs());
      long var6 = 480814573823095012L;
      Object var5 = var10003;
      var10003 = Ref.h(480814573823095012L, var5, var6);

      try {
         var10003 = (Bq2)var10003;
      } catch (InvocationTargetException var32) {
         throw var32.getTargetException();
      }

      label83: {
         Object var1;
         label84: {
            Bq2 var2 = var10003;
            var1 = var10002;
            var10002 = var2;
            if (var1 == null) {
               if (var2 != null) {
                  var10002 = this;
                  Object var7 = 158293829082319616L;
                  var36 = ((Bq2)Ref.g(158293829082319616L, var7)).equals(var2);
                  if (var1 != null) {
                     break label84;
                  }

                  if (!var36) {
                     Object[] var10004 = Registry.emptyArgs();
                     long var10 = 467250021884313480L;
                     Object[] var9 = var10004;
                     Ref.h(467250021884313480L, var9, var10);

                     try {
                        ;
                     } catch (InvocationTargetException var31) {
                        throw var31.getTargetException();
                     }

                     Object var11 = 158293829082319616L;
                     Ref.g(158293829082319616L, var11);
                     Object[] var10006 = Registry.emptyArgs();
                     long var14 = 168016210297284127L;
                     Object[] var13 = var10006;
                     Ref.h(168016210297284127L, var13, var14);

                     try {
                        ;
                     } catch (InvocationTargetException var30) {
                        throw var30.getTargetException();
                     }
                  }
               }

               var10002 = this;
               Object var15 = 293938313616336078L;
               Ref.g(293938313616336078L, var15);
               var37 = Registry.packArgs(null);
               long var18 = 172435224701198715L;
               Object[] var17 = var37;
               Ref.h(172435224701198715L, var17, var18);

               try {
                  ;
               } catch (InvocationTargetException var29) {
                  throw var29.getTargetException();
               }
            }

            if (var1 != null) {
               break label83;
            }

            Object var19 = 461249878665463746L;
            var36 = ((TH3)Ref.g(461249878665463746L, var19)).isVisible();
         }

         if (!var36 && var1 == null) {
            Object var21 = 293938313616336078L;
            Ref.g(293938313616336078L, var21);
            Object var10005 = Registry.emptyArgs();
            long var24 = 193033702979442502L;
            Object var23 = var10005;
            var10005 = Ref.h(193033702979442502L, var23, var24);

            try {
               var39 = (Boolean)var10005;
            } catch (InvocationTargetException var28) {
               throw var28.getTargetException();
            }

            if (!var39) {
               Registry.lookupField(388376917454860932L).get(null);
               var40 = Registry.packArgs(new Di2(this));
               long var26 = 434592463220957006L;
               Object[] var25 = var40;
               Ref.h(434592463220957006L, var25, var26);

               try {
                  ;
               } catch (InvocationTargetException var27) {
                  throw var27.getTargetException();
               }
            }
         }
      }

      Registry.lookupField(444246150125769098L).setLong(var10002, System.currentTimeMillis());
   }

   public void N() {
   }

   public void I() {
      String[] var1 = AM.s$arrString();
      if (var1 == null && !Registry.lookupField(515313227049281099L).getBoolean(this)) {
         Registry.emptyArgs();
         long var2 = 270389152141252877L;
         Ref.h2(270389152141252877L, var2);
         Object[] var10005 = Registry.emptyArgs();
         long var5 = 399585344452154517L;
         Object[] var4 = var10005;
         var10005 = Ref.h(399585344452154517L, var4, var5);
         Color var10006 = Registry.emptyArgs();
         long var7 = 149968465491171480L;
         Object var6 = var10006;
         var10006 = (Color)Ref.h(149968465491171480L, var6, var7);
         XF3 var10007 = (XF3)(Registry.emptyArgs());
         long var9 = 605008073331144146L;
         Object var8 = var10007;
         var10007 = Ref.h(605008073331144146L, var8, var9);

         try {
            var10007 = (XF3)var10007;
         } catch (InvocationTargetException var17) {
            throw var17.getTargetException();
         }

         var10006 = (Color)(new boolean[var10007.p()]);
         long var11 = 544542606382447190L;
         Object var10 = var10005;
         Ref.s(544542606382447190L, var10, var11);
         var10006 = (Color)Registry.lookupField(575518801661014217L).get(null);
         long var13 = 544542606382447190L;
         Object var12 = var10006;
         Ref.s(544542606382447190L, var12, var13);
      }

      Object[] var10001 = Registry.emptyArgs();
      long var15 = 467250021884313480L;
      Object[] var14 = var10001;
      Ref.h(467250021884313480L, var14, var15);

      try {
         ;
      } catch (InvocationTargetException var16) {
         throw var16.getTargetException();
      }
   }

   public void h() {
      Color var36;
      Boolean var40;
      String[] var10000 = AM.s$arrString();
      byte var2 = 0;
      String[] var1 = var10000;
      Object var6 = 307353262184556454L;
      Border var3 = (Border)Ref.g(307353262184556454L, var6);
      if (var1 == null) {
         if (!Registry.lookupField(292988288778102177L).getBoolean(this)) {
            int var38;
            label79: {
               label87: {
                  JComponent var4 = (JComponent)this.getParent();
                  JComponent var10001 = var4;
                  if (var1 == null) {
                     if (var4 == null) {
                        break label87;
                     }

                     var10001 = var4;
                  }

                  int var5 = var10001.getHeight() - (this.getY() + this.getHeight());
                  var38 = var5;
                  if (var1 != null) {
                     break label79;
                  }

                  if (var5 < 5) {
                     var2 = 1;
                  }
               }

               var38 = var2;
            }

            if (var38 != 0) {
               Object var8 = 443819559899318671L;
               var3 = (Border)Ref.g(443819559899318671L, var8);
            }
         }

         Registry.lookupField(327725816926172471L).setBoolean(this, false);
      }

      Object var10 = 300793705977237886L;
      Color var35 = (Color)Ref.g(300793705977237886L, var10);
      Object var12 = 624766743350519726L;
      var36 = (Color)Ref.g(624766743350519726L, var12);
      Object var14 = 162955545315895464L;
      Ref.g(162955545315895464L, var14);
      Object var10005 = Registry.emptyArgs();
      long var17 = 258040024224799506L;
      Object var16 = var10005;
      var10005 = Ref.h(258040024224799506L, var16, var17);

      try {
         var40 = (Boolean)var10005;
      } catch (InvocationTargetException var34) {
         throw var34.getTargetException();
      }

      boolean var10006;
      var10006 = Registry.lookupField(292988288778102177L).getBoolean(this);
      label66:
      if (var1 == null) {
         if (var10006) {
            var10006 = Registry.lookupField(223239328082186834L).getBoolean(this);
            if (var1 != null) {
               break label66;
            }

            if (!var10006) {
               var10006 = false;
               break label66;
            }
         }

         var10006 = true;
      }

      label88: {
         if (var40 & var10006) {
            Object var18 = 544542606382447190L;
            var35 = (Color)Ref.g(544542606382447190L, var18);
            Object var20 = 627386361665190277L;
            var36 = (Color)Ref.g(627386361665190277L, var20);
            this.setBorder(var3);
            this.setOpaque(true);
            if (var1 == null) {
               break label88;
            }
         }

         Object var22 = 293415747511525795L;
         var36 = (Color)Ref.g(293415747511525795L, var22);
         Object var24 = 377102286771712366L;
         this.setBorder((Border)Ref.g(377102286771712366L, var24));
         boolean var10008 = Registry.lookupField(515313227049281099L).getBoolean(this);
         if (var1 == null) {
            var10008 = !var10008;
         }

         this.setOpaque(var10008);
      }

      this.setBackground(var35);
      Object var26 = 184969517688200929L;
      ((JLabel)Ref.g(184969517688200929L, var26)).setForeground(var36);
      Object var28 = 379501722659427188L;
      JLabel var10009 = (JLabel)Ref.g(379501722659427188L, var28);
      if (var1 == null) {
         if (var10009 == null) {
            return;
         }

         Object var30 = 379501722659427188L;
         JLabel var10010 = (JLabel)Ref.g(379501722659427188L, var30);
      }

      Object var32 = 184969517688200929L;
      this.setForeground(((JLabel)Ref.g(184969517688200929L, var32)).getForeground());
   }

   public void c() {
      Color var33;
      boolean var37;
      byte var2 = 0;
      AM.s$arrString();
      Object var6 = 307353262184556454L;
      Border var3 = (Border)Ref.g(307353262184556454L, var6);
      if (this == null) {
         if (!Registry.lookupField(292988288778102177L).getBoolean(this)) {
            int var35;
            label60: {
               label68: {
                  JComponent var4 = (JComponent)this.getParent();
                  JComponent var10001 = var4;
                  if (this == null) {
                     if (var4 == null) {
                        break label68;
                     }

                     var10001 = var4;
                  }

                  int var5 = var10001.getHeight() - (this.getY() + this.getHeight());
                  var35 = var5;
                  if (this != null) {
                     break label60;
                  }

                  if (var5 < 5) {
                     var2 = 1;
                  }
               }

               var35 = var2;
            }

            if (var35 != 0) {
               Object var8 = 443819559899318671L;
               var3 = (Border)Ref.g(443819559899318671L, var8);
            }
         }

         this.setOpaque(true);
         Registry.lookupField(327725816926172471L).setBoolean(this, true);
      }

      Color var34;
      label48: {
         Object var10 = 372692518757921471L;
         var33 = (Color)Ref.g(372692518757921471L, var10);
         Object var12 = 132907106891851987L;
         var34 = (Color)Ref.g(132907106891851987L, var12);
         if (this == null) {
            Object var14 = 162955545315895464L;
            Ref.g(162955545315895464L, var14);
            Object var10005 = Registry.emptyArgs();
            long var17 = 258040024224799506L;
            Object var16 = var10005;
            var10005 = Ref.h(258040024224799506L, var16, var17);

            try {
               var37 = (Boolean)var10005;
            } catch (InvocationTargetException var32) {
               throw var32.getTargetException();
            }

            if (var37) {
               Object var18 = 544542606382447190L;
               var33 = (Color)Ref.g(544542606382447190L, var18);
               this.setBorder(var3);
               if (this == null) {
                  break label48;
               }
            }

            Object var20 = 293415747511525795L;
            var34 = (Color)Ref.g(293415747511525795L, var20);
         }

         Object var22 = 377102286771712366L;
         this.setBorder((Border)Ref.g(377102286771712366L, var22));
      }

      this.setBackground(var33);
      Object var24 = 184969517688200929L;
      ((JLabel)Ref.g(184969517688200929L, var24)).setForeground(var34);
      Object var26 = 379501722659427188L;
      JLabel var10006 = (JLabel)Ref.g(379501722659427188L, var26);
      if (this == null) {
         if (var10006 == null) {
            return;
         }

         Object var28 = 379501722659427188L;
         JLabel var10007 = (JLabel)Ref.g(379501722659427188L, var28);
      }

      Object var30 = 184969517688200929L;
      this.setForeground(((JLabel)Ref.g(184969517688200929L, var30)).getForeground());
   }

   public void Q(T32 var1) {
      Object[] var39;
      long var40;
      Integer var57;
      long var10 = 162955545315895464L;
      Ref.s(162955545315895464L, var1, var10);
      AM.s$arrString();
      Object[] var10003 = Registry.emptyArgs();
      long var12 = 532019896893594989L;
      Object[] var11 = var10003;
      Ref.h(532019896893594989L, var11, var12);

      try {
         ;
      } catch (InvocationTargetException var44) {
         throw var44.getTargetException();
      }

      int var4 = var1.hashCode();
      Object var13 = 184969517688200929L;
      JLabel var10004 = (JLabel)Ref.g(184969517688200929L, var13);
      String var10006 = (String)(Registry.emptyArgs());
      long var16 = 532019896893594989L;
      Object var15 = var10006;
      var10006 = Ref.h(532019896893594989L, var15, var16);

      try {
         var10006 = (String)var10006;
      } catch (InvocationTargetException var43) {
         throw var43.getTargetException();
      }

      var1.setText(var10006);
      this.doLayout();
      this.validate();
      var10006 = Registry.emptyArgs();
      long var18 = 160719341149611325L;
      Object var17 = var10006;
      var10006 = Ref.h(160719341149611325L, var17, var18);

      try {
         var10006 = (ConnectionProperty)var10006;
      } catch (InvocationTargetException var42) {
         throw var42.getTargetException();
      }

      ConnectionProperty var5 = var10006;
      if (var1 == null) {
         label91: {
            if (var5 != null) {
               Object var19 = 352540136562697034L;
               T2 var51 = (T2)Ref.g(352540136562697034L, var19);
               if (var1 != null) {
                  break label91;
               }

               label88:
               if (var51 != null) {
                  ConnectHost var6;
                  Fv2_2 var8;
                  label86: {
                     var6 = null;
                     Object var7 = null;
                     var8 = var5.s$Fv_2();
                     Fv2_2 var52 = var8;
                     if (var1 == null) {
                        if (var8 == null) {
                           break label86;
                        }

                        var52 = var8;
                     }

                     var6 = var52.e();
                     var7 = var8.E();
                  }

                  if (var8 == null) {
                     Object var21 = 352540136562697034L;
                     ((T2)Ref.g(352540136562697034L, var21)).setEnabled(false);
                     if (var1 == null) {
                        break label88;
                     }
                  }

                  label99: {
                     ConnectHost var53 = var6;
                     if (var1 == null) {
                        if (var6 == null) {
                           break label99;
                        }

                        var53 = var6;
                     }

                     boolean var54 = var53.t$boolean();
                     if (var1 == null) {
                        if (var54) {
                           Object var23 = 352540136562697034L;
                           ((T2)Ref.g(352540136562697034L, var23)).setEnabled(true);
                           Object var25 = 352540136562697034L;
                           ((T2)Ref.g(352540136562697034L, var25)).setForeground(new Color(0, b(5209, 444215567343955726L), 0, b(8865, 3538897718776076780L)));
                           if (var1 == null) {
                              break label88;
                           }
                        }

                        var54 = var6.i$boolean();
                     }

                     if (var54) {
                        Object var27 = 352540136562697034L;
                        ((T2)Ref.g(352540136562697034L, var27)).setEnabled(false);
                        Object var29 = 352540136562697034L;
                        ((T2)Ref.g(352540136562697034L, var29))
                           .setForeground(
                              new Color(
                                 b(29373, 3419710809736071656L), b(6408, 8131986073360114247L), b(30621, 6860886057269546188L), b(8865, 3538897718776076780L)
                              )
                           );
                        if (var1 == null) {
                           break label88;
                        }
                     }

                     Object var31 = 352540136562697034L;
                     ((T2)Ref.g(352540136562697034L, var31)).setEnabled(true);
                     Object var33 = 352540136562697034L;
                     ((T2)Ref.g(352540136562697034L, var33))
                        .setForeground(
                           new Color(
                              b(31027, 8257738072422302274L), b(32468, 1866864467146622352L), b(32468, 1866864467146622352L), b(8865, 3538897718776076780L)
                           )
                        );
                     if (var1 == null) {
                        break label88;
                     }
                  }

                  Object var35 = 352540136562697034L;
                  ((T2)Ref.g(352540136562697034L, var35)).setEnabled(true);
               }
            }

            Object var37 = 379501722659427188L;
            JLabel var55 = (JLabel)Ref.g(379501722659427188L, var37);
         }

         StringBuilder var10007 = new StringBuilder();
         Object var10009 = Registry.emptyArgs();
         var40 = 229192454276026216L;
         var39 = var10009;
         var10009 = Ref.h(229192454276026216L, var39, var40);

         try {
            var57 = (Integer)var10009;
         } catch (InvocationTargetException var41) {
            throw var41.getTargetException();
         }

         var10007.setText(var1.append(var57).append("").toString());
      }
   }

   public T32 Q() {
      Object var1 = 162955545315895464L;
      return (T32)Ref.g(162955545315895464L, var1);
   }

   public void M(T32 var1) {
      long var3 = 162955545315895464L;
      Ref.s(162955545315895464L, var1, var3);
   }

   public long D() {
      return Registry.lookupField(215842448089483238L).getLong(this);
   }

   public void u(long var1) {
      Registry.lookupField(215842448089483238L).setLong(this, var1);
   }

   public boolean S() {
      return Registry.lookupField(466539178470875130L).getBoolean(this);
   }

   public void T(boolean var1) {
      Registry.lookupField(466539178470875130L).setBoolean(this, var1);
   }

   public boolean g() {
      return Registry.lookupField(166665882978501038L).getBoolean(this);
   }

   public void x(boolean var1) {
      Registry.lookupField(166665882978501038L).setBoolean(this, var1);
   }

   public boolean T() {
      return Registry.lookupField(451154194190924563L).getBoolean(this);
   }

   public void h(boolean var1) {
      Registry.lookupField(451154194190924563L).setBoolean(this, var1);
   }

   public static void H(Bq2 var0) {
      Object[] var10001 = Registry.emptyArgs();
      long var2 = 273754091082965916L;
      Object[] var1 = var10001;
      Ref.h(273754091082965916L, var1, var2);

      try {
         ;
      } catch (InvocationTargetException var3) {
         throw var3.getTargetException();
      }
   }

   static {
      __vfClinit__();
   }

   public static String a(int var0, int var1) {
      int var2 = (var0 ^ -30250) & 65535;
      if (q[var2] == null) {
         char[] var3 = c[var2].toCharArray();
         short var10000;
         switch (var3[0] & 0xFF) {
            case 0:
               var10000 = 71;
               break;
            case 1:
               var10000 = 210;
               break;
            case 2:
               var10000 = 131;
               break;
            case 3:
               var10000 = 31;
               break;
            case 4:
               var10000 = 81;
               break;
            case 5:
               var10000 = 201;
               break;
            case 6:
               var10000 = 118;
               break;
            case 7:
               var10000 = 184;
               break;
            case 8:
               var10000 = 214;
               break;
            case 9:
               var10000 = 120;
               break;
            case 10:
               var10000 = 43;
               break;
            case 11:
               var10000 = 3;
               break;
            case 12:
               var10000 = 233;
               break;
            case 13:
               var10000 = 74;
               break;
            case 14:
               var10000 = 30;
               break;
            case 15:
               var10000 = 153;
               break;
            case 16:
               var10000 = 64;
               break;
            case 17:
               var10000 = 94;
               break;
            case 18:
               var10000 = 255;
               break;
            case 19:
               var10000 = 157;
               break;
            case 20:
               var10000 = 84;
               break;
            case 21:
               var10000 = 168;
               break;
            case 22:
               var10000 = 177;
               break;
            case 23:
               var10000 = 198;
               break;
            case 24:
               var10000 = 53;
               break;
            case 25:
               var10000 = 151;
               break;
            case 26:
               var10000 = 208;
               break;
            case 27:
               var10000 = 100;
               break;
            case 28:
               var10000 = 247;
               break;
            case 29:
               var10000 = 7;
               break;
            case 30:
               var10000 = 156;
               break;
            case 31:
               var10000 = 202;
               break;
            case 32:
               var10000 = 67;
               break;
            case 33:
               var10000 = 181;
               break;
            case 34:
               var10000 = 144;
               break;
            case 35:
               var10000 = 52;
               break;
            case 36:
               var10000 = 80;
               break;
            case 37:
               var10000 = 24;
               break;
            case 38:
               var10000 = 175;
               break;
            case 39:
               var10000 = 41;
               break;
            case 40:
               var10000 = 119;
               break;
            case 41:
               var10000 = 95;
               break;
            case 42:
               var10000 = 97;
               break;
            case 43:
               var10000 = 85;
               break;
            case 44:
               var10000 = 58;
               break;
            case 45:
               var10000 = 169;
               break;
            case 46:
               var10000 = 204;
               break;
            case 47:
               var10000 = 46;
               break;
            case 48:
               var10000 = 32;
               break;
            case 49:
               var10000 = 35;
               break;
            case 50:
               var10000 = 224;
               break;
            case 51:
               var10000 = 235;
               break;
            case 52:
               var10000 = 188;
               break;
            case 53:
               var10000 = 221;
               break;
            case 54:
               var10000 = 182;
               break;
            case 55:
               var10000 = 161;
               break;
            case 56:
               var10000 = 93;
               break;
            case 57:
               var10000 = 4;
               break;
            case 58:
               var10000 = 117;
               break;
            case 59:
               var10000 = 105;
               break;
            case 60:
               var10000 = 130;
               break;
            case 61:
               var10000 = 88;
               break;
            case 62:
               var10000 = 26;
               break;
            case 63:
               var10000 = 27;
               break;
            case 64:
               var10000 = 223;
               break;
            case 65:
               var10000 = 15;
               break;
            case 66:
               var10000 = 13;
               break;
            case 67:
               var10000 = 16;
               break;
            case 68:
               var10000 = 246;
               break;
            case 69:
               var10000 = 148;
               break;
            case 70:
               var10000 = 162;
               break;
            case 71:
               var10000 = 18;
               break;
            case 72:
               var10000 = 159;
               break;
            case 73:
               var10000 = 114;
               break;
            case 74:
               var10000 = 160;
               break;
            case 75:
               var10000 = 61;
               break;
            case 76:
               var10000 = 244;
               break;
            case 77:
               var10000 = 38;
               break;
            case 78:
               var10000 = 203;
               break;
            case 79:
               var10000 = 248;
               break;
            case 80:
               var10000 = 101;
               break;
            case 81:
               var10000 = 136;
               break;
            case 82:
               var10000 = 211;
               break;
            case 83:
               var10000 = 132;
               break;
            case 84:
               var10000 = 254;
               break;
            case 85:
               var10000 = 122;
               break;
            case 86:
               var10000 = 228;
               break;
            case 87:
               var10000 = 152;
               break;
            case 88:
               var10000 = 66;
               break;
            case 89:
               var10000 = 245;
               break;
            case 90:
               var10000 = 142;
               break;
            case 91:
               var10000 = 200;
               break;
            case 92:
               var10000 = 158;
               break;
            case 93:
               var10000 = 191;
               break;
            case 94:
               var10000 = 113;
               break;
            case 95:
               var10000 = 219;
               break;
            case 96:
               var10000 = 45;
               break;
            case 97:
               var10000 = 40;
               break;
            case 98:
               var10000 = 133;
               break;
            case 99:
               var10000 = 14;
               break;
            case 100:
               var10000 = 28;
               break;
            case 101:
               var10000 = 116;
               break;
            case 102:
               var10000 = 234;
               break;
            case 103:
               var10000 = 170;
               break;
            case 104:
               var10000 = 186;
               break;
            case 105:
               var10000 = 253;
               break;
            case 106:
               var10000 = 225;
               break;
            case 107:
               var10000 = 183;
               break;
            case 108:
               var10000 = 78;
               break;
            case 109:
               var10000 = 83;
               break;
            case 110:
               var10000 = 44;
               break;
            case 111:
               var10000 = 207;
               break;
            case 112:
               var10000 = 232;
               break;
            case 113:
               var10000 = 10;
               break;
            case 114:
               var10000 = 79;
               break;
            case 115:
               var10000 = 36;
               break;
            case 116:
               var10000 = 17;
               break;
            case 117:
               var10000 = 185;
               break;
            case 118:
               var10000 = 25;
               break;
            case 119:
               var10000 = 134;
               break;
            case 120:
               var10000 = 63;
               break;
            case 121:
               var10000 = 154;
               break;
            case 122:
               var10000 = 205;
               break;
            case 123:
               var10000 = 174;
               break;
            case 124:
               var10000 = 68;
               break;
            case 125:
               var10000 = 199;
               break;
            case 126:
               var10000 = 171;
               break;
            case 127:
               var10000 = 73;
               break;
            case 128:
               var10000 = 90;
               break;
            case 129:
               var10000 = 34;
               break;
            case 130:
               var10000 = 209;
               break;
            case 131:
               var10000 = 220;
               break;
            case 132:
               var10000 = 103;
               break;
            case 133:
               var10000 = 135;
               break;
            case 134:
               var10000 = 123;
               break;
            case 135:
               var10000 = 87;
               break;
            case 136:
               var10000 = 128;
               break;
            case 137:
               var10000 = 197;
               break;
            case 138:
               var10000 = 190;
               break;
            case 139:
               var10000 = 180;
               break;
            case 140:
               var10000 = 218;
               break;
            case 141:
               var10000 = 51;
               break;
            case 142:
               var10000 = 77;
               break;
            case 143:
               var10000 = 217;
               break;
            case 144:
               var10000 = 166;
               break;
            case 145:
               var10000 = 237;
               break;
            case 146:
               var10000 = 155;
               break;
            case 147:
               var10000 = 11;
               break;
            case 148:
               var10000 = 138;
               break;
            case 149:
               var10000 = 82;
               break;
            case 150:
               var10000 = 139;
               break;
            case 151:
               var10000 = 146;
               break;
            case 152:
               var10000 = 6;
               break;
            case 153:
               var10000 = 23;
               break;
            case 154:
               var10000 = 49;
               break;
            case 155:
               var10000 = 250;
               break;
            case 156:
               var10000 = 89;
               break;
            case 157:
               var10000 = 178;
               break;
            case 158:
               var10000 = 33;
               break;
            case 159:
               var10000 = 20;
               break;
            case 160:
               var10000 = 229;
               break;
            case 161:
               var10000 = 226;
               break;
            case 162:
               var10000 = 96;
               break;
            case 163:
               var10000 = 124;
               break;
            case 164:
               var10000 = 47;
               break;
            case 165:
               var10000 = 9;
               break;
            case 166:
               var10000 = 243;
               break;
            case 167:
               var10000 = 70;
               break;
            case 168:
               var10000 = 149;
               break;
            case 169:
               var10000 = 127;
               break;
            case 170:
               var10000 = 231;
               break;
            case 171:
               var10000 = 227;
               break;
            case 172:
               var10000 = 112;
               break;
            case 173:
               var10000 = 239;
               break;
            case 174:
               var10000 = 106;
               break;
            case 175:
               var10000 = 240;
               break;
            case 176:
               var10000 = 206;
               break;
            case 177:
               var10000 = 242;
               break;
            case 178:
               var10000 = 129;
               break;
            case 179:
               var10000 = 2;
               break;
            case 180:
               var10000 = 140;
               break;
            case 181:
               var10000 = 252;
               break;
            case 182:
               var10000 = 213;
               break;
            case 183:
               var10000 = 39;
               break;
            case 184:
               var10000 = 145;
               break;
            case 185:
               var10000 = 121;
               break;
            case 186:
               var10000 = 50;
               break;
            case 187:
               var10000 = 176;
               break;
            case 188:
               var10000 = 72;
               break;
            case 189:
               var10000 = 98;
               break;
            case 190:
               var10000 = 192;
               break;
            case 191:
               var10000 = 69;
               break;
            case 192:
               var10000 = 91;
               break;
            case 193:
               var10000 = 212;
               break;
            case 194:
               var10000 = 76;
               break;
            case 195:
               var10000 = 55;
               break;
            case 196:
               var10000 = 187;
               break;
            case 197:
               var10000 = 167;
               break;
            case 198:
               var10000 = 147;
               break;
            case 199:
               var10000 = 48;
               break;
            case 200:
               var10000 = 194;
               break;
            case 201:
               var10000 = 163;
               break;
            case 202:
               var10000 = 37;
               break;
            case 203:
               var10000 = 104;
               break;
            case 204:
               var10000 = 164;
               break;
            case 205:
               var10000 = 29;
               break;
            case 206:
               var10000 = 216;
               break;
            case 207:
               var10000 = 0;
               break;
            case 208:
               var10000 = 173;
               break;
            case 209:
               var10000 = 92;
               break;
            case 210:
               var10000 = 196;
               break;
            case 211:
               var10000 = 99;
               break;
            case 212:
               var10000 = 241;
               break;
            case 213:
               var10000 = 236;
               break;
            case 214:
               var10000 = 172;
               break;
            case 215:
               var10000 = 115;
               break;
            case 216:
               var10000 = 75;
               break;
            case 217:
               var10000 = 215;
               break;
            case 218:
               var10000 = 86;
               break;
            case 219:
               var10000 = 111;
               break;
            case 220:
               var10000 = 60;
               break;
            case 221:
               var10000 = 108;
               break;
            case 222:
               var10000 = 65;
               break;
            case 223:
               var10000 = 21;
               break;
            case 224:
               var10000 = 249;
               break;
            case 225:
               var10000 = 5;
               break;
            case 226:
               var10000 = 222;
               break;
            case 227:
               var10000 = 150;
               break;
            case 228:
               var10000 = 137;
               break;
            case 229:
               var10000 = 126;
               break;
            case 230:
               var10000 = 110;
               break;
            case 231:
               var10000 = 179;
               break;
            case 232:
               var10000 = 8;
               break;
            case 233:
               var10000 = 62;
               break;
            case 234:
               var10000 = 57;
               break;
            case 235:
               var10000 = 22;
               break;
            case 236:
               var10000 = 102;
               break;
            case 237:
               var10000 = 12;
               break;
            case 238:
               var10000 = 189;
               break;
            case 239:
               var10000 = 54;
               break;
            case 240:
               var10000 = 165;
               break;
            case 241:
               var10000 = 251;
               break;
            case 242:
               var10000 = 1;
               break;
            case 243:
               var10000 = 56;
               break;
            case 244:
               var10000 = 59;
               break;
            case 245:
               var10000 = 109;
               break;
            case 246:
               var10000 = 143;
               break;
            case 247:
               var10000 = 238;
               break;
            case 248:
               var10000 = 125;
               break;
            case 249:
               var10000 = 141;
               break;
            case 250:
               var10000 = 42;
               break;
            case 251:
               var10000 = 19;
               break;
            case 252:
               var10000 = 107;
               break;
            case 253:
               var10000 = 230;
               break;
            case 254:
               var10000 = 195;
               break;
            default:
               var10000 = 193;
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

         q[var2] = new String(var3).intern();
      }

      return q[var2];
   }

   public static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15187;
      if (D[var3] == null) {
         D[var3] = (int)(t[var3] ^ var1);
      }

      return D[var3];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
      char[] var33;
      long var37;
      String[] var13 = new String[16];
      int var11 = 0;
      String var10 = "ù Ì\u0099µ\nHdÔÒ|Î\u009fÃ0\u0011\nB!C40'H\u009e&)(\u0099¯áSÎâ@)KTôÔ~E\u0085,lWÖ¤\u0081\u009b\u008fCYU\u0005wù* ß\u0016¯ÜÚ\u009d\u000e\u0097\u001a\u0005:S±ç\u0085\u0005¤z`Âý\u0005\u000b=\u0092*D(x\u000bÝÇIp°{U\u001e7\u009d\u0006l\u008a\t\u008dóê0\u0006\t\u007f\u0011G\u001fÆ>\u0081\u0003¯ú÷\tàJ\u001aÚg\u0086\u0005;j\u0093À\u0083\u0012±×=êÿüºï\u0019F$\u0016å\u0089\t×\u009c ({>½aE¤1áeM1÷Æ!\u0092 \u008eÆ\u008a\u0096\nÝþ\u008bwLÀTAN·Sô>\u0080ê\u0016Jæ\u0092\nøn\u0014ÝÚ\u001a\u0015<\u008dØ\u000e}Ún½|vO\u008dïAÙöDÂ\u001cQuëHÌÈYZ-»\u0081©O)\u008fpÂ\n\u0006\u0010(ï2J\u0007,]\u0017\u0005Ue\\!8";
      int var12 = "ù Ì\u0099µ\nHdÔÒ|Î\u009fÃ0\u0011\nB!C40'H\u009e&)(\u0099¯áSÎâ@)KTôÔ~E\u0085,lWÖ¤\u0081\u009b\u008fCYU\u0005wù* ß\u0016¯ÜÚ\u009d\u000e\u0097\u001a\u0005:S±ç\u0085\u0005¤z`Âý\u0005\u000b=\u0092*D(x\u000bÝÇIp°{U\u001e7\u009d\u0006l\u008a\t\u008dóê0\u0006\t\u007f\u0011G\u001fÆ>\u0081\u0003¯ú÷\tàJ\u001aÚg\u0086\u0005;j\u0093À\u0083\u0012±×=êÿüºï\u0019F$\u0016å\u0089\t×\u009c ({>½aE¤1áeM1÷Æ!\u0092 \u008eÆ\u008a\u0096\nÝþ\u008bwLÀTAN·Sô>\u0080ê\u0016Jæ\u0092\nøn\u0014ÝÚ\u001a\u0015<\u008dØ\u000e}Ún½|vO\u008dïAÙöDÂ\u001cQuëHÌÈYZ-»\u0081©O)\u008fpÂ\n\u0006\u0010(ï2J\u0007,]\u0017\u0005Ue\\!8"
         .length();
      char var9 = 16;
      int var17 = -1;

      label70:
      while (true) {
         byte var10000 = 7;
         String var10001 = var10.substring(++var17, var17 + var9);
         byte var10002 = -1;

         while (true) {
            label65: {
               char[] var39 = var10001.toCharArray();
               int var10004 = var39.length;
               int var14 = 0;
               byte var42 = var10000;
               var33 = var39;
               int var24 = var10004;
               byte var49;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               } else {
                  var42 = var10000;
                  var24 = var10004;
                  if (var10004 <= var14) {
                     break label65;
                  }

                  var55 = var39;
                  var49 = var10000;
                  var10006 = var14;
               }

               while (true) {
                  char var64 = var55[var10006];
                  byte var65;
                  switch (var14 % 7) {
                     case 0:
                        var65 = 2;
                        break;
                     case 1:
                        var65 = 14;
                        break;
                     case 2:
                        var65 = 81;
                        break;
                     case 3:
                        var65 = 6;
                        break;
                     case 4:
                        var65 = 21;
                        break;
                     case 5:
                        var65 = 92;
                        break;
                     default:
                        var65 = 95;
                  }

                  var55[var10006] = (char)(var64 ^ var49 ^ var65);
                  var14++;
                  if (var42 == 0) {
                     var10006 = var42;
                     var55 = var33;
                     var49 = var42;
                  } else {
                     if (var24 <= var14) {
                        break;
                     }

                     var55 = var33;
                     var49 = var42;
                     var10006 = var14;
                  }
               }
            }

            String var44 = new String(var33).intern();
            switch (var10002) {
               case 0:
                  var13[var11++] = var44;
                  if ((var17 += var9) >= var12) {
                     c = var13;
                     q = new String[16];
                     long var0 = 1951566969205254751L;
                     long[] var6 = new long[37];
                     int var3 = 0;
                     String var4 = "|i¾\u008d\\\"\u0084\u0096©5\u001c\u0089\u0081®\u009bãq\u009d?°-&&\u0087l]p_SI\u0095\u0019×u\u0003KåáE\u0099C9\u000fY\u0018\u008cnÂí¶¼\rb<£Ó\u009b\u0088D\u0016\r¤\u00038³ $À¤\u0087Î\u008aÜ\ràoÊ q=\u001fÒ\u0002|¿ÄfQ\u0010¤\u0016Ñ1mUsÂX\u0082\u00059ûv\u0092ïE\râ¬û\u000eî\u001d÷Â±äTû\u0098wý-\u0095EOÐÓ#Pq\u008cÜqh~\u0004\u0003Dÿxøu¤'±1eï)¿¾1T]F\u0088r6^\fP²\u00138\u0001L¦\u0084ZGö\r\u009ePçïXBòî$\"cUï\t5\u0012Ï¯ý.}FûvÚ=Z(¨\u001e\u0090z®\u0002Ì\u0090w'ks\u001byÝP§/óôd´xÜæ.þ7ÐÈÄñR§M\u0095o\u008dç=\u0090\u009b´\"ËóUú\u0000x7\u0012\"6d`%\u0013;¡nÐÊ\u0099k\u0091\rÇ\u009f;÷0S\u009aÆ\u0014.(â";
                     int var5 = "|i¾\u008d\\\"\u0084\u0096©5\u001c\u0089\u0081®\u009bãq\u009d?°-&&\u0087l]p_SI\u0095\u0019×u\u0003KåáE\u0099C9\u000fY\u0018\u008cnÂí¶¼\rb<£Ó\u009b\u0088D\u0016\r¤\u00038³ $À¤\u0087Î\u008aÜ\ràoÊ q=\u001fÒ\u0002|¿ÄfQ\u0010¤\u0016Ñ1mUsÂX\u0082\u00059ûv\u0092ïE\râ¬û\u000eî\u001d÷Â±äTû\u0098wý-\u0095EOÐÓ#Pq\u008cÜqh~\u0004\u0003Dÿxøu¤'±1eï)¿¾1T]F\u0088r6^\fP²\u00138\u0001L¦\u0084ZGö\r\u009ePçïXBòî$\"cUï\t5\u0012Ï¯ý.}FûvÚ=Z(¨\u001e\u0090z®\u0002Ì\u0090w'ks\u001byÝP§/óôd´xÜæ.þ7ÐÈÄñR§M\u0095o\u008dç=\u0090\u009b´\"ËóUú\u0000x7\u0012\"6d`%\u0013;¡nÐÊ\u0099k\u0091\rÇ\u009f;÷0S\u009aÆ\u0014.(â"
                        .length();
                     byte var2 = 0;

                     label44:
                     while (true) {
                        byte var26 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        long[] var19 = var6;
                        int var27 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56
                           | ((long)var7[1] & 255L) << 48
                           | ((long)var7[2] & 255L) << 40
                           | ((long)var7[3] & 255L) << 32
                           | ((long)var7[4] & 255L) << 24
                           | ((long)var7[5] & 255L) << 16
                           | ((long)var7[6] & 255L) << 8
                           | (long)var7[7] & 255L;
                        byte var45 = -1;

                        while (true) {
                           long var54 = var37 ^ var0;
                           switch (var45) {
                              case 0:
                                 var19[var27] = var54;
                                 if (var2 >= var5) {
                                    t = var6;
                                    D = new Integer[37];
                                    return;
                                 }
                                 break;
                              default:
                                 var19[var27] = var54;
                                 if (var2 < var5) {
                                    continue label44;
                                 }

                                 var4 = "í`kNÀul9\u0016\u00ad\u0015WrãÞï";
                                 var5 = "í`kNÀul9\u0016\u00ad\u0015WrãÞï".length();
                                 var2 = 0;
                           }

                           byte var28 = var2;
                           var2 += 8;
                           var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                           var19 = var6;
                           var27 = var3++;
                           var37 = ((long)var7[0] & 255L) << 56
                              | ((long)var7[1] & 255L) << 48
                              | ((long)var7[2] & 255L) << 40
                              | ((long)var7[3] & 255L) << 32
                              | ((long)var7[4] & 255L) << 24
                              | ((long)var7[5] & 255L) << 16
                              | ((long)var7[6] & 255L) << 8
                              | (long)var7[7] & 255L;
                           var45 = 0;
                        }
                     }
                  }

                  var9 = var10.charAt(var17);
                  break;
               default:
                  var13[var11++] = var44;
                  if ((var17 += var9) < var12) {
                     var9 = var10.charAt(var17);
                     continue label70;
                  }

                  var10 = "¥ñ\u0083.7òÐëê{\u008fGx\u0002\b¿Ù\nÝïìN\u001b";
                  var12 = "¥ñ\u0083.7òÐëê{\u008fGx\u0002\b¿Ù\nÝïìN\u001b".length();
                  var9 = 14;
                  var17 = -1;
            }

            var10000 = 90;
            var10001 = var10.substring(++var17, var17 + var9);
            var10002 = 0;
         }
      }
   }
}





