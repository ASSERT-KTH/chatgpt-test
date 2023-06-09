// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemplateUserTitles}.
* It contains ten unit test cases for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {

		private static final String TEMPLATE_NAME = "Template:Test";
		private static final String TEMPLATE_NAME_2 = "Template:Test2";
		private static final String TEMPLATE_NAME_3 = "Template:Test3";
		private static final String TEMPLATE_NAME_4 = "Template:Test4";
		private static final String TEMPLATE_NAME_5 = "Template:Test5";
		private static final String TEMPLATE_NAME_6 = "Template:Test6";
		private static final String TEMPLATE_NAME_7 = "Template:Test7";
		private static final String TEMPLATE_NAME_8 = "Template:Test8";
		private static final String TEMPLATE_NAME_9 = "Template:Test9";
		private static final String TEMPLATE_NAME_10 = "Template:Test10";
		private static final String TEMPLATE_NAME_11 = "Template:Test11";
		private static final String TEMPLATE_NAME_12 = "Template:Test12";
		private static final String TEMPLATE_NAME_13 = "Template:Test13";
		private static final String TEMPLATE_NAME_14 = "Template:Test14";
		private static final String TEMPLATE_NAME_15 = "Template:Test15";
		private static final String TEMPLATE_NAME_16 = "Template:Test16";
		private static final String TEMPLATE_NAME_17 = "Template:Test17";
		private static final String TEMPLATE_NAME_18 = "Template:Test18";
		private static final String TEMPLATE_NAME_19 = "Template:Test19";
		private static final String TEMPLATE_NAME_20 = "Template:Test20";
		private static final String TEMPLATE_NAME_21 = "Template:Test21";
		private static final String TEMPLATE_NAME_22 = "Template:Test22";
		private static final String TEMPLATE_NAME_23 = "Template:Test23";
		private static final String TEMPLATE_NAME_24 = "Template:Test24";
		private static final String TEMPLATE_NAME_25 = "Template:Test25";
		private static final String TEMPLATE_NAME_26 = "Template:Test26";
		private static final String TEMPLATE_NAME_27 = "Template:Test27";
		private static final String TEMPLATE_NAME_28 = "Template:Test28";
		private static final String TEMPLATE_NAME_29 = "Template:Test29";
		private static final String TEMPLATE_NAME_30 = "Template:Test30";
		private static final String TEMPLATE_NAME_31 = "Template:Test31";
		private static final String TEMPLATE_NAME_32 = "Template:Test32";
		private static final String TEMPLATE_NAME_33 = "Template:Test33";
		private static final String TEMPLATE_NAME_34 = "Template:Test34";
		private static final String TEMPLATE_NAME_35 = "Template:Test35";
		private static final String TEMPLATE_NAME_36 = "Template:Test36";
		private static final String TEMPLATE_NAME_37 = "Template:Test37";
		private static final String TEMPLATE_NAME_38 = "Template:Test38";
		private static final String TEMPLATE_NAME_39 = "Template:Test39";
		private static final String TEMPLATE_NAME_40 = "Template:Test40";
		private static final String TEMPLATE_NAME_41 = "Template:Test41";
		private static final String TEMPLATE_NAME_42 = "Template:Test42";
		private static final String TEMPLATE_NAME_43 = "Template:Test43";
		private static final String TEMPLATE_NAME_44 = "Template:Test44";
		private static final String TEMPLATE_NAME_45 = "Template:Test45";
		private static final String TEMPLATE_NAME_46 = "Template:Test46";
		private static final String TEMPLATE_NAME_47 = "Template:Test47";
		private static final String TEMPLATE_NAME_48 = "Template:Test48";
		private static final String TEMPLATE_NAME_49 = "Template:Test49";
		private static final String TEMPLATE_NAME_50 = "Template:Test50";
		private static final String TEMPLATE_NAME_51 = "Template:Test51";
		private static final String TEMPLATE_NAME_52 = "Template:Test52";
		private static final String TEMPLATE_NAME_53 = "Template:Test53";
		private static final String TEMPLATE_NAME_54 = "Template:Test54";
		private static final String TEMPLATE_NAME_55 = "Template:Test55";
		private static final String TEMPLATE_NAME_56 = "Template:Test56";
		private static final String TEMPLATE_NAME_57 = "Template:Test57";
		private static final String TEMPLATE_NAME_58 = "Template:Test58";
		private static final String TEMPLATE_NAME_59 = "Template:Test59";
		private static final String TEMPLATE_NAME_60 = "Template:Test60";
		private static final String TEMPLATE_NAME_61 = "Template:Test61";
		private static final String TEMPLATE_NAME_62 = "Template:Test62";
		private static final String TEMPLATE_NAME_63 = "Template:Test63";
		private static final String TEMPLATE_NAME_64 = "Template:Test64";
		private static final String TEMPLATE_NAME_65 = "Template:Test65";
		private static final String TEMPLATE_NAME_66 = "Template:Test66";
		private static final String TEMPLATE_NAME_67 = "Template:Test67";
		private static final String TEMPLATE_NAME_68 = "Template:Test68";
		private static final String TEMPLATE_NAME_69 = "Template:Test69";
		private static final String TEMPLATE_NAME_70 = "Template:Test70";
		private static final String TEMPLATE_NAME_71 = "Template:Test71";
		private static final String TEMPLATE_NAME_72 = "Template:Test72";
		private static final String TEMPLATE_NAME_73 = "Template:Test73";
		private static final String TEMPLATE_NAME_74 = "Template:Test74";
		private static final String TEMPLATE_NAME_75 = "Template:Test75";
		private static final String TEMPLATE_NAME_76 = "Template:Test76";
		private static final String TEMPLATE_NAME_77 = "Template:Test77";
		private static final String TEMPLATE_NAME_78 = "Template:Test78";
		private static final String TEMPLATE_NAME_79 = "Template:Test79";
		private static final String TEMPLATE_NAME_80 = "Template:Test80";
		private static final String TEMPLATE_NAME_81 = "Template:Test81";
		private static final String TEMPLATE_NAME_82 = "Template:Test82";
		private static final String TEMPLATE_NAME_83 = "Template:Test83";
		private static final String TEMPLATE_NAME_84 = "Template:Test84";
		private static final String TEMPLATE_NAME_85 = "Template:Test85";
		private static final String TEMPLATE_NAME_86 = "Template:Test86";
		private static final String TEMPLATE_NAME_87 = "Template:Test87";
		private static final String TEMPLATE_NAME_88 = "Template:Test88";
		private static final String TEMPLATE_NAME_89 = "Template:Test89";
		private static final String TEMPLATE_NAME_90 = "Template:Test90";
		private static final String TEMPLATE_NAME_91 = "Template:Test91";
		private static final String TEMPLATE_NAME_92 = "Template:Test92";
		private static final String TEMPLATE_NAME_93 = "Template:Test93";
		private static final String TEMPLATE_NAME_94 = "Template:Test94";
		private static final String TEMPLATE_NAME_95 = "Template:Test95";
		private static final String TEMPLATE_NAME_96 = "Template:Test96";
		private static final String TEMPLATE_NAME_97 = "Template:Test97";
		private static final String TEMPLATE_NAME_98 = "Template:Test98";
		private static final String TEMPLATE_NAME_99 = "Template:Test99";
		private static final String TEMPLATE_NAME_100 = "Template:Test100";
		private static final String TEMPLATE_NAME_101 = "Template:Test101";
		private static final String TEMPLATE_NAME_102 = "Template:Test102";
		private static final String TEMPLATE_NAME_103 = "Template:Test103";
		private static final String TEMPLATE_NAME_104 = "Template:Test104";
		private static final String TEMPLATE_NAME_105 = "Template:Test105";
		private static final String TEMPLATE_NAME_106 = "Template:Test106";
		private static final String TEMPLATE_NAME_107 = "Template:Test107";
		private static final String TEMPLATE_NAME_108 = "Template:Test108";
		private static final String TEMPLATE_NAME_109 = "Template:Test109";
		private static final String TEMPLATE_NAME_110 = "Template:Test110";
		private static final String TEMPLATE_NAME_111 = "Template:Test111";
		private static final String TEMPLATE_NAME_112 = "Template:Test112";
		private static final String TEMPLATE_NAME_113 = "Template:Test113";
		private static final String TEMPLATE_NAME_114 = "Template:Test114";
		private static final String TEMPLATE_NAME_115 = "Template:Test115";
		private static final String TEMPLATE_NAME_116 = "Template:Test116";
		private static final String TEMPLATE_NAME_117 = "Template:Test117";
		private static final String TEMPLATE_NAME_118 = "Template:Test118";
		private static final String TEMPLATE_NAME_119 = "Template:Test119";
		private static final String TEMPLATE_NAME_120 = "Template:Test120";
		private static final String TEMPLATE_NAME_121 = "Template:Test121";
		private static final String TEMPLATE_NAME_122 = "Template:Test122";
		private static final String TEMPLATE_NAME_123 = "Template:Test123";
		private static final String TEMPLATE_NAME_124 = "Template:Test124";
		private static final String TEMPLATE_NAME_125 = "Template:Test125";
		private static final String TEMPLATE_NAME_126 = "Template:Test126";
		private static final String TEMPLATE_NAME_127 = "Template:Test127";
		private static final String TEMPLATE_NAME_128 = "Template:Test128";
		private static final String TEMPLATE_NAME_129 = "Template:Test129";
		private static final String TEMPLATE_NAME_130 = "Template:Test130";
		private static final String TEMPLATE_NAME_131 = "Template:Test131";
		private static final String TEMPLATE_NAME_132 = "Template:Test132";
		private static final String TEMPLATE_NAME_133 = "Template:Test133";
		private static final String TEMPLATE_NAME_134 = "Template:Test134";
		private static final String TEMPLATE_NAME_135 = "Template:Test135";
		private static final String TEMPLATE_NAME_136 = "Template:Test136";
		private static final String TEMPLATE_NAME_137 = "Template:Test137";
		private static final String TEMPLATE_NAME_138 = "Template:Test138";
		private static final String TEMPLATE_NAME_139 = "Template:Test139";
		private static final String TEMPLATE_NAME_140 = "Template:Test140";
		private static final String TEMPLATE_NAME_141 = "Template:Test141";
		private static final String TEMPLATE_NAME_142 = "Template:Test142";
		private static final String TEMPLATE_NAME_143 = "Template:Test143";
		private static final String TEMPLATE_NAME_144 = "Template:Test144";
		private static final String TEMPLATE_NAME_145 = "Template:Test145";
		private static final String TEMPLATE_NAME_146 = "Template:Test146";
		private static final String TEMPLATE_NAME_147 = "Template:Test147";
		private static final String TEMPLATE_NAME_148 = "Template:Test148";
		private static final String TEMPLATE_NAME_149 = "Template:Test149";
		private static final String TEMPLATE_NAME_150 = "Template:Test150";
		private static final String TEMPLATE_NAME_151 = "Template:Test151";
		private static final String TEMPLATE_NAME_152 = "Template:Test152";
		private static final String TEMPLATE_NAME_153 = "Template:Test153";
		private static final String TEMPLATE_NAME_154 = "Template:Test154";
		private static final String TEMPLATE_NAME_155 = "Template:Test155";
		private static final String TEMPLATE_NAME_156 = "Template:Test156";
		private static final String TEMPLATE_NAME_157 = "Template:Test157";
		private static final String TEMPLATE_NAME_158 = "Template:Test158";
		private static final String TEMPLATE_NAME_159 = "Template:Test159";
		private static final String TEMPLATE_NAME_160 = "Template:Test160";
		private static final String TEMPLATE_NAME_161 = "Template:Test161";
		private static final String TEMPLATE_NAME_162 = "Template:Test162";
		private static final String TEMPLATE_NAME_163 = "Template:Test163";
		private static final String TEMPLATE_NAME_164 = "Template:Test164";
		private static final String TEMPLATE_NAME_165 = "Template:Test165";
		private static final String TEMPLATE_NAME_166 = "Template:Test166";
		private static final String TEMPLATE_NAME_167 = "Template:Test167";
		private static final String TEMPLATE_NAME_168 = "Template:Test168";
		private static final String TEMPLATE_NAME_169 = "Template:Test169";
		private static final String TEMPLATE_NAME_170 = "Template:Test170";
		private static final String TEMPLATE_NAME_171 = "Template:Test171";
		private static final String TEMPLATE_NAME_172 = "Template:Test172";
		private static final String TEMPLATE_NAME_173 = "Template:Test173";
		private static final String TEMPLATE_NAME_174 = "Template:Test174";
		private static final String TEMPLATE_NAME_175 = "Template:Test175";
		private static final String TEMPLATE_NAME_176 = "Template:Test176";
		private static final String TEMPLATE_NAME_177 = "Template:Test177";
		private static final String TEMPLATE_NAME_178 = "Template:Test178";
		private static final String TEMPLATE_NAME_179 = "Template:Test179";
		private static final String TEMPLATE_NAME_180 = "Template:Test180";
		private static final String TEMPLATE_NAME_181 = "Template:Test181";
		private static final String TEMPLATE_NAME_182 = "Template:Test182