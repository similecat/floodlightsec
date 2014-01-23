package ConsLan;
// Generated from constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class constraintParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, LET=13, APP=14, UNION=15, ASSERT=16, EITHER=17, 
		PERM=18, LIMITING=19, ACTION=20, OWN_FLOWS=21, OTHERS_FLOWS=22, ALL_FLOWS=23, 
		MAX_PRIORITY=24, EVENT_INTERCEPTION=25, MODIFY_EVENT_ORDER=26, FLOW_LEVEL=27, 
		PORT_LEVEL=28, SWITCH_LEVEL=29, IP_SRC=30, IP_DST=31, TCP_SRC=32, TCP_DST=33, 
		VLAN_ID=34, INT=35, FLOAT=36, IP=37, WITH=38, MASK=39, IP_FORMAT=40, SWITCH=41, 
		LINK=42, ALL_SWITCHES=43, BORDER_SWITCHES=44, ALL_DIRECT_LINKS=45, ALL_PATHS_AS_LINKS=46, 
		VIRTUAL=47, SINGLE_BIG_SWITCH=48, DROP=49, FORWARD=50, MODIFY=51, FIELD=52, 
		AND=53, OR=54, NOT=55, AS=56, RULE_COUNT_PER_SWITCH=57, SIZE_PERCENTAGE_PER_SWITCH=58, 
		STRING=59, WS=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'>'", "')'", "','", "'-'", "'('", "':'", "'<'", "'='", 
		"'}'", "'>='", "'<='", "'LET'", "'APP'", "'UNION'", "'ASSERT'", "'EITHER'", 
		"'PERM'", "'LIMITING'", "'ACTION'", "'OWN_FLOWS'", "'OTHERS_FLOWS'", "'ALL_FLOWS'", 
		"'MAX_PRIORITY'", "'EVENT_INTERCEPTION'", "'MODIFY_EVENT_ORDER'", "'FLOW_LEVEL'", 
		"'PORT_LEVEL'", "'SWITCH_LEVEL'", "'IP_SRC'", "'IP_DST'", "'TCP_SRC'", 
		"'TCP_DST'", "'VLAN_ID'", "INT", "FLOAT", "'IP'", "'WITH'", "'MASK'", 
		"IP_FORMAT", "'SWITCH'", "'LINK'", "'ALL_SWITCHES'", "'BORDER_SWITCHES'", 
		"'ALL_DIRECT_LINKS'", "'ALL_PATHS_AS_LINKS'", "'VIRTUAL'", "'SINGLE_BIG_SWITCH'", 
		"'DROP'", "'FORWARD'", "'MODIFY'", "'FIELD'", "'AND'", "'OR'", "'NOT'", 
		"'AS'", "'RULE_COUNT_PER_SWITCH'", "'SIZE_PERCENTAGE_PER_SWITCH'", "STRING", 
		"WS"
	};
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_binding = 2, RULE_var_perm = 3, 
		RULE_app_name = 4, RULE_perm_expr = 5, RULE_assert_list = 6, RULE_assert_stmt = 7, 
		RULE_assert_expr = 8, RULE_boolean_expr = 9, RULE_cmp_operator = 10, RULE_exclusive = 11, 
		RULE_perm_list = 12, RULE_perm = 13, RULE_filter_expr = 14, RULE_filter_term = 15, 
		RULE_filter_factor = 16, RULE_filter_not_factor = 17, RULE_flow_predicate = 18, 
		RULE_field = 19, RULE_value_list = 20, RULE_value_range = 21, RULE_ip_range = 22, 
		RULE_ip_format = 23, RULE_topo = 24, RULE_physical_topo = 25, RULE_switch_set = 26, 
		RULE_sw_idx_list = 27, RULE_sw_idx = 28, RULE_link_set = 29, RULE_link_list = 30, 
		RULE_link = 31, RULE_path = 32, RULE_link_idx = 33, RULE_virtual_topo = 34, 
		RULE_switch_mapping = 35, RULE_virtual_switch_set = 36, RULE_action = 37, 
		RULE_field_list = 38, RULE_ownership = 39, RULE_max_priority = 40, RULE_flow_table = 41, 
		RULE_notification = 42, RULE_statistics = 43, RULE_perm_name = 44;
	public static final String[] ruleNames = {
		"program", "stat", "binding", "var_perm", "app_name", "perm_expr", "assert_list", 
		"assert_stmt", "assert_expr", "boolean_expr", "cmp_operator", "exclusive", 
		"perm_list", "perm", "filter_expr", "filter_term", "filter_factor", "filter_not_factor", 
		"flow_predicate", "field", "value_list", "value_range", "ip_range", "ip_format", 
		"topo", "physical_topo", "switch_set", "sw_idx_list", "sw_idx", "link_set", 
		"link_list", "link", "path", "link_idx", "virtual_topo", "switch_mapping", 
		"virtual_switch_set", "action", "field_list", "ownership", "max_priority", 
		"flow_table", "notification", "statistics", "perm_name"
	};

	@Override
	public String getGrammarFileName() { return "constraint.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public constraintParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET || _la==ASSERT) {
				{
				{
				setState(90); stat();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_list_Context extends StatContext {
		public Assert_listContext assert_list() {
			return getRuleContext(Assert_listContext.class,0);
		}
		public Assert_list_Context(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_list_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_list_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_list_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bind_Context extends StatContext {
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public Bind_Context(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new Bind_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96); binding();
				}
				break;
			case ASSERT:
				_localctx = new Assert_list_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97); assert_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindingContext extends ParserRuleContext {
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
	 
		public BindingContext() { }
		public void copyFrom(BindingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Bind_exprContext extends BindingContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_exprContext perm_expr() {
			return getRuleContext(Perm_exprContext.class,0);
		}
		public TerminalNode LET() { return getToken(constraintParser.LET, 0); }
		public Bind_exprContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bind_listContext extends BindingContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public TerminalNode LET() { return getToken(constraintParser.LET, 0); }
		public Bind_listContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_list(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bind_appContext extends BindingContext {
		public TerminalNode APP() { return getToken(constraintParser.APP, 0); }
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public TerminalNode LET() { return getToken(constraintParser.LET, 0); }
		public App_nameContext app_name() {
			return getRuleContext(App_nameContext.class,0);
		}
		public Bind_appContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBind_app(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBind_app(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBind_app(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binding);
		try {
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Bind_listContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100); match(LET);
				setState(101); var_perm();
				setState(102); match(9);
				setState(103); match(1);
				setState(104); perm_list();
				setState(105); match(10);
				}
				break;

			case 2:
				_localctx = new Bind_appContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(LET);
				setState(108); var_perm();
				setState(109); match(9);
				setState(110); match(APP);
				setState(111); app_name();
				}
				break;

			case 3:
				_localctx = new Bind_exprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113); match(LET);
				setState(114); var_perm();
				setState(115); match(9);
				setState(116); perm_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_permContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(constraintParser.STRING, 0); }
		public Var_permContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_perm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVar_perm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVar_perm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVar_perm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_permContext var_perm() throws RecognitionException {
		Var_permContext _localctx = new Var_permContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_perm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class App_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(constraintParser.STRING, 0); }
		public App_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterApp_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitApp_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitApp_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final App_nameContext app_name() throws RecognitionException {
		App_nameContext _localctx = new App_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_app_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Perm_exprContext extends ParserRuleContext {
		public Perm_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_expr; }
	 
		public Perm_exprContext() { }
		public void copyFrom(Perm_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Perm_expr_unionContext extends Perm_exprContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_exprContext perm_expr() {
			return getRuleContext(Perm_exprContext.class,0);
		}
		public TerminalNode UNION() { return getToken(constraintParser.UNION, 0); }
		public Perm_expr_unionContext(Perm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_expr_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_expr_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_expr_union(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Perm_expr__woContext extends Perm_exprContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_expr__woContext(Perm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_expr__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_expr__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_expr__wo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_exprContext perm_expr() throws RecognitionException {
		Perm_exprContext _localctx = new Perm_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_perm_expr);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Perm_expr__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124); var_perm();
				}
				break;

			case 2:
				_localctx = new Perm_expr_unionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125); var_perm();
				setState(126); match(UNION);
				setState(127); perm_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assert_listContext extends ParserRuleContext {
		public Assert_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_list; }
	 
		public Assert_listContext() { }
		public void copyFrom(Assert_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_stmt__woContext extends Assert_listContext {
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Assert_stmt__woContext(Assert_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_stmt__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_stmt__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_stmt__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_stmt__wContext extends Assert_listContext {
		public Assert_listContext assert_list() {
			return getRuleContext(Assert_listContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Assert_stmt__wContext(Assert_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_stmt__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_stmt__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_stmt__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_listContext assert_list() throws RecognitionException {
		Assert_listContext _localctx = new Assert_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assert_list);
		try {
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Assert_stmt__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131); assert_stmt();
				}
				break;

			case 2:
				_localctx = new Assert_stmt__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132); assert_stmt();
				setState(133); assert_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assert_stmtContext extends ParserRuleContext {
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
	 
		public Assert_stmtContext() { }
		public void copyFrom(Assert_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_st_exprContext extends Assert_stmtContext {
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(constraintParser.ASSERT, 0); }
		public Assert_st_exprContext(Assert_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_st_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_st_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_st_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_st_excContext extends Assert_stmtContext {
		public ExclusiveContext exclusive() {
			return getRuleContext(ExclusiveContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(constraintParser.ASSERT, 0); }
		public Assert_st_excContext(Assert_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_st_exc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_st_exc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_st_exc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assert_stmt);
		try {
			setState(141);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Assert_st_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(ASSERT);
				setState(138); assert_expr();
				}
				break;

			case 2:
				_localctx = new Assert_st_excContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(ASSERT);
				setState(140); exclusive();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assert_exprContext extends ParserRuleContext {
		public Assert_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_expr; }
	 
		public Assert_exprContext() { }
		public void copyFrom(Assert_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assert_andContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public Assert_andContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_and(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_notContext extends Assert_exprContext {
		public TerminalNode NOT() { return getToken(constraintParser.NOT, 0); }
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public Assert_notContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_not(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_boolContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Assert_boolContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Assert_orContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public TerminalNode OR() { return getToken(constraintParser.OR, 0); }
		public Assert_orContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAssert_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAssert_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAssert_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_exprContext assert_expr() throws RecognitionException {
		Assert_exprContext _localctx = new Assert_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assert_expr);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Assert_notContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143); match(NOT);
				setState(144); assert_expr();
				}
				break;

			case 2:
				_localctx = new Assert_orContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145); boolean_expr();
				setState(146); match(OR);
				setState(147); assert_expr();
				}
				break;

			case 3:
				_localctx = new Assert_andContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149); boolean_expr();
				setState(150); match(AND);
				setState(151); assert_expr();
				}
				break;

			case 4:
				_localctx = new Assert_boolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153); boolean_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Boolean_exprContext extends ParserRuleContext {
		public List<Perm_exprContext> perm_expr() {
			return getRuleContexts(Perm_exprContext.class);
		}
		public Perm_exprContext perm_expr(int i) {
			return getRuleContext(Perm_exprContext.class,i);
		}
		public Cmp_operatorContext cmp_operator() {
			return getRuleContext(Cmp_operatorContext.class,0);
		}
		public Boolean_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBoolean_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBoolean_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBoolean_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); perm_expr();
			setState(157); cmp_operator();
			setState(158); perm_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_operatorContext extends ParserRuleContext {
		public Cmp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterCmp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitCmp_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitCmp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_operatorContext cmp_operator() throws RecognitionException {
		Cmp_operatorContext _localctx = new Cmp_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveContext extends ParserRuleContext {
		public List<Perm_exprContext> perm_expr() {
			return getRuleContexts(Perm_exprContext.class);
		}
		public TerminalNode EITHER() { return getToken(constraintParser.EITHER, 0); }
		public Perm_exprContext perm_expr(int i) {
			return getRuleContext(Perm_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(constraintParser.OR, 0); }
		public ExclusiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterExclusive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitExclusive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitExclusive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveContext exclusive() throws RecognitionException {
		ExclusiveContext _localctx = new ExclusiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exclusive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(EITHER);
			setState(163); perm_expr();
			setState(164); match(OR);
			setState(165); perm_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Perm_listContext extends ParserRuleContext {
		public Perm_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_list; }
	 
		public Perm_listContext() { }
		public void copyFrom(Perm_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Perm_list__woContext extends Perm_listContext {
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public Perm_list__woContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_list__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_list__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_list__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Perm_list__wContext extends Perm_listContext {
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public Perm_list__wContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_list__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_listContext perm_list() throws RecognitionException {
		Perm_listContext _localctx = new Perm_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_perm_list);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new Perm_list__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167); perm();
				}
				break;

			case 2:
				_localctx = new Perm_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); perm();
				setState(169); perm_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PermContext extends ParserRuleContext {
		public PermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm; }
	 
		public PermContext() { }
		public void copyFrom(PermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Perm__wContext extends PermContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public TerminalNode LIMITING() { return getToken(constraintParser.LIMITING, 0); }
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(constraintParser.PERM, 0); }
		public Perm__wContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm__w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Perm__woContext extends PermContext {
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(constraintParser.PERM, 0); }
		public Perm__woContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm__wo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermContext perm() throws RecognitionException {
		PermContext _localctx = new PermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_perm);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Perm__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173); match(PERM);
				setState(174); perm_name();
				}
				break;

			case 2:
				_localctx = new Perm__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175); match(PERM);
				setState(176); perm_name();
				setState(177); match(LIMITING);
				setState(178); filter_expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_exprContext extends ParserRuleContext {
		public int _p;
		public Filter_exprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_exprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_expr; }
	 
		public Filter_exprContext() { }
		public void copyFrom(Filter_exprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Filter_expr__termContext extends Filter_exprContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public Filter_expr__termContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_expr__term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_expr__term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_expr__term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_expr__expr_and_termContext extends Filter_exprContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public Filter_expr__expr_and_termContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_expr__expr_and_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_expr__expr_and_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_expr__expr_and_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_exprContext filter_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_exprContext _localctx = new Filter_exprContext(_ctx, _parentState, _p);
		Filter_exprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, RULE_filter_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Filter_expr__termContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(183); filter_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Filter_expr__expr_and_termContext(new Filter_exprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_expr);
					setState(185);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(186); match(AND);
					setState(187); filter_term(0);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Filter_termContext extends ParserRuleContext {
		public int _p;
		public Filter_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Filter_termContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_filter_term; }
	 
		public Filter_termContext() { }
		public void copyFrom(Filter_termContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Filter_term__factorContext extends Filter_termContext {
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public Filter_term__factorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_term__factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_term__factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_term__factor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_term__term_or_factorContext extends Filter_termContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public TerminalNode OR() { return getToken(constraintParser.OR, 0); }
		public Filter_term__term_or_factorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_term__term_or_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_term__term_or_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_term__term_or_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_termContext filter_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Filter_termContext _localctx = new Filter_termContext(_ctx, _parentState, _p);
		Filter_termContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, RULE_filter_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Filter_term__factorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(194); filter_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Filter_term__term_or_factorContext(new Filter_termContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_term);
					setState(196);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(197); match(OR);
					setState(198); filter_factor();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Filter_factorContext extends ParserRuleContext {
		public Filter_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_factor; }
	 
		public Filter_factorContext() { }
		public void copyFrom(Filter_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filter_factor__NOTContext extends Filter_factorContext {
		public TerminalNode NOT() { return getToken(constraintParser.NOT, 0); }
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public Filter_factor__NOTContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_factor__NOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_factor__NOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_factor__NOT(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_factor__not_factorContext extends Filter_factorContext {
		public Filter_not_factorContext filter_not_factor() {
			return getRuleContext(Filter_not_factorContext.class,0);
		}
		public Filter_factor__not_factorContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_factor__not_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_factor__not_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_factor__not_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_factorContext filter_factor() throws RecognitionException {
		Filter_factorContext _localctx = new Filter_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_filter_factor);
		try {
			setState(207);
			switch (_input.LA(1)) {
			case 6:
			case ACTION:
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
			case MAX_PRIORITY:
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case IP:
			case SWITCH:
			case VIRTUAL:
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new Filter_factor__not_factorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204); filter_not_factor();
				}
				break;
			case NOT:
				_localctx = new Filter_factor__NOTContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(NOT);
				setState(206); filter_factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Filter_not_factorContext extends ParserRuleContext {
		public Filter_not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_not_factor; }
	 
		public Filter_not_factorContext() { }
		public void copyFrom(Filter_not_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Statistics_Context extends Filter_not_factorContext {
		public StatisticsContext statistics() {
			return getRuleContext(StatisticsContext.class,0);
		}
		public Statistics_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterStatistics_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitStatistics_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitStatistics_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Max_priority_Context extends Filter_not_factorContext {
		public Max_priorityContext max_priority() {
			return getRuleContext(Max_priorityContext.class,0);
		}
		public Max_priority_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterMax_priority_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitMax_priority_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitMax_priority_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Topo_Context extends Filter_not_factorContext {
		public TopoContext topo() {
			return getRuleContext(TopoContext.class,0);
		}
		public Topo_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterTopo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitTopo_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitTopo_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Flow_table_Context extends Filter_not_factorContext {
		public Flow_tableContext flow_table() {
			return getRuleContext(Flow_tableContext.class,0);
		}
		public Flow_table_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_table_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_table_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_table_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Filter_expr_Context extends Filter_not_factorContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public Filter_expr_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFilter_expr_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFilter_expr_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFilter_expr_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Flow_predicate_Context extends Filter_not_factorContext {
		public Flow_predicateContext flow_predicate() {
			return getRuleContext(Flow_predicateContext.class,0);
		}
		public Flow_predicate_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_predicate_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_predicate_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_predicate_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Notification_Context extends Filter_not_factorContext {
		public NotificationContext notification() {
			return getRuleContext(NotificationContext.class,0);
		}
		public Notification_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterNotification_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitNotification_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitNotification_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Action_Context extends Filter_not_factorContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(constraintParser.ACTION, 0); }
		public Action_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAction_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ownership_Context extends Filter_not_factorContext {
		public OwnershipContext ownership() {
			return getRuleContext(OwnershipContext.class,0);
		}
		public Ownership_Context(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterOwnership_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitOwnership_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitOwnership_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_not_factorContext filter_not_factor() throws RecognitionException {
		Filter_not_factorContext _localctx = new Filter_not_factorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_filter_not_factor);
		try {
			setState(222);
			switch (_input.LA(1)) {
			case 6:
				_localctx = new Filter_expr_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(6);
				setState(210); filter_expr(0);
				setState(211); match(3);
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case IP:
				_localctx = new Flow_predicate_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213); flow_predicate();
				}
				break;
			case SWITCH:
			case VIRTUAL:
				_localctx = new Topo_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214); topo();
				}
				break;
			case ACTION:
				_localctx = new Action_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215); match(ACTION);
				setState(216); action();
				}
				break;
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
				_localctx = new Ownership_Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217); ownership();
				}
				break;
			case MAX_PRIORITY:
				_localctx = new Max_priority_Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(218); max_priority();
				}
				break;
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new Flow_table_Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(219); flow_table();
				}
				break;
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
				_localctx = new Notification_Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(220); notification();
				}
				break;
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
				_localctx = new Statistics_Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(221); statistics();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_predicateContext extends ParserRuleContext {
		public Flow_predicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_predicate; }
	 
		public Flow_predicateContext() { }
		public void copyFrom(Flow_predicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Field_Context extends Flow_predicateContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public Field_Context(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterField_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitField_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitField_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Ip_range_Context extends Flow_predicateContext {
		public Ip_rangeContext ip_range() {
			return getRuleContext(Ip_rangeContext.class,0);
		}
		public Ip_range_Context(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterIp_range_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitIp_range_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitIp_range_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_predicateContext flow_predicate() throws RecognitionException {
		Flow_predicateContext _localctx = new Flow_predicateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_flow_predicate);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case IP:
				_localctx = new Ip_range_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224); ip_range();
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
				_localctx = new Field_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225); field();
				setState(226); match(1);
				setState(227); value_list();
				setState(228); match(10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IP_SRC() { return getToken(constraintParser.IP_SRC, 0); }
		public TerminalNode TCP_DST() { return getToken(constraintParser.TCP_DST, 0); }
		public TerminalNode VLAN_ID() { return getToken(constraintParser.VLAN_ID, 0); }
		public TerminalNode TCP_SRC() { return getToken(constraintParser.TCP_SRC, 0); }
		public TerminalNode IP_DST() { return getToken(constraintParser.IP_DST, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IP_SRC) | (1L << IP_DST) | (1L << TCP_SRC) | (1L << TCP_DST) | (1L << VLAN_ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
	 
		public Value_listContext() { }
		public void copyFrom(Value_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Value_list__wContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public Value_list__wContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_list__w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_list__sContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public Value_list__sContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_list__s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_list__s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_list__s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value_list);
		try {
			setState(239);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Value_list__sContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234); value_range();
				}
				break;

			case 2:
				_localctx = new Value_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235); value_range();
				setState(236); match(4);
				setState(237); value_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_rangeContext extends ParserRuleContext {
		public Value_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_range; }
	 
		public Value_rangeContext() { }
		public void copyFrom(Value_rangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Value_range_wContext extends Value_rangeContext {
		public List<TerminalNode> INT() { return getTokens(constraintParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(constraintParser.INT, i);
		}
		public Value_range_wContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_range_w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_range_w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_range_w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value_range_sContext extends Value_rangeContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Value_range_sContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterValue_range_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitValue_range_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitValue_range_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_rangeContext value_range() throws RecognitionException {
		Value_rangeContext _localctx = new Value_rangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value_range);
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Value_range_sContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(241); match(INT);
				}
				break;

			case 2:
				_localctx = new Value_range_wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242); match(INT);
				setState(243); match(5);
				setState(244); match(INT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_rangeContext extends ParserRuleContext {
		public TerminalNode MASK() { return getToken(constraintParser.MASK, 0); }
		public Ip_formatContext ip_format(int i) {
			return getRuleContext(Ip_formatContext.class,i);
		}
		public List<Ip_formatContext> ip_format() {
			return getRuleContexts(Ip_formatContext.class);
		}
		public TerminalNode IP() { return getToken(constraintParser.IP, 0); }
		public TerminalNode WITH() { return getToken(constraintParser.WITH, 0); }
		public Ip_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterIp_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitIp_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitIp_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_rangeContext ip_range() throws RecognitionException {
		Ip_rangeContext _localctx = new Ip_rangeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ip_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(IP);
			setState(248); ip_format();
			setState(249); match(WITH);
			setState(250); match(MASK);
			setState(251); ip_format();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ip_formatContext extends ParserRuleContext {
		public TerminalNode IP_FORMAT() { return getToken(constraintParser.IP_FORMAT, 0); }
		public Ip_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterIp_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitIp_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitIp_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_formatContext ip_format() throws RecognitionException {
		Ip_formatContext _localctx = new Ip_formatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ip_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(IP_FORMAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopoContext extends ParserRuleContext {
		public TopoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topo; }
	 
		public TopoContext() { }
		public void copyFrom(TopoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Physical_topo_Context extends TopoContext {
		public Physical_topoContext physical_topo() {
			return getRuleContext(Physical_topoContext.class,0);
		}
		public Physical_topo_Context(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPhysical_topo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPhysical_topo_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPhysical_topo_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Virtual_topo_Context extends TopoContext {
		public Virtual_topoContext virtual_topo() {
			return getRuleContext(Virtual_topoContext.class,0);
		}
		public Virtual_topo_Context(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_topo_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_topo_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_topo_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopoContext topo() throws RecognitionException {
		TopoContext _localctx = new TopoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_topo);
		try {
			setState(257);
			switch (_input.LA(1)) {
			case SWITCH:
				_localctx = new Physical_topo_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255); physical_topo();
				}
				break;
			case VIRTUAL:
				_localctx = new Virtual_topo_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256); virtual_topo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Physical_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(constraintParser.LINK, 0); }
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public TerminalNode SWITCH() { return getToken(constraintParser.SWITCH, 0); }
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Physical_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPhysical_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPhysical_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPhysical_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_topoContext physical_topo() throws RecognitionException {
		Physical_topoContext _localctx = new Physical_topoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_physical_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(SWITCH);
			setState(260); switch_set();
			setState(261); match(AND);
			setState(262); match(LINK);
			setState(263); link_set();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_setContext extends ParserRuleContext {
		public Switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_set; }
	 
		public Switch_setContext() { }
		public void copyFrom(Switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class All_switches_Context extends Switch_setContext {
		public TerminalNode ALL_SWITCHES() { return getToken(constraintParser.ALL_SWITCHES, 0); }
		public All_switches_Context(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_switches_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_switches_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_switches_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sw_idx_list_Context extends Switch_setContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public Sw_idx_list_Context(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx_list_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx_list_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx_list_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Border_switches_Context extends Switch_setContext {
		public TerminalNode BORDER_SWITCHES() { return getToken(constraintParser.BORDER_SWITCHES, 0); }
		public Border_switches_Context(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterBorder_switches_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitBorder_switches_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitBorder_switches_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_setContext switch_set() throws RecognitionException {
		Switch_setContext _localctx = new Switch_setContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch_set);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case ALL_SWITCHES:
				_localctx = new All_switches_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(265); match(ALL_SWITCHES);
				}
				break;
			case BORDER_SWITCHES:
				_localctx = new Border_switches_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(266); match(BORDER_SWITCHES);
				}
				break;
			case 1:
				_localctx = new Sw_idx_list_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(267); match(1);
				setState(268); sw_idx_list();
				setState(269); match(10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sw_idx_listContext extends ParserRuleContext {
		public Sw_idx_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx_list; }
	 
		public Sw_idx_listContext() { }
		public void copyFrom(Sw_idx_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sw_idx_list__woContext extends Sw_idx_listContext {
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Sw_idx_list__woContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx_list__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx_list__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx_list__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sw_idx_list__wContext extends Sw_idx_listContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Sw_idx_list__wContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx_list__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idx_listContext sw_idx_list() throws RecognitionException {
		Sw_idx_listContext _localctx = new Sw_idx_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sw_idx_list);
		try {
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new Sw_idx_list__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(273); sw_idx();
				}
				break;

			case 2:
				_localctx = new Sw_idx_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(274); sw_idx();
				setState(275); match(4);
				setState(276); sw_idx_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sw_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Sw_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSw_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSw_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSw_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idxContext sw_idx() throws RecognitionException {
		Sw_idxContext _localctx = new Sw_idxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sw_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Link_setContext extends ParserRuleContext {
		public Link_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_set; }
	 
		public Link_setContext() { }
		public void copyFrom(Link_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class All_driect_links_Context extends Link_setContext {
		public TerminalNode ALL_DIRECT_LINKS() { return getToken(constraintParser.ALL_DIRECT_LINKS, 0); }
		public All_driect_links_Context(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_driect_links_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_driect_links_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_driect_links_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class All_paths_as_links_Context extends Link_setContext {
		public TerminalNode ALL_PATHS_AS_LINKS() { return getToken(constraintParser.ALL_PATHS_AS_LINKS, 0); }
		public All_paths_as_links_Context(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_paths_as_links_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_paths_as_links_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_paths_as_links_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Link_list_Context extends Link_setContext {
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public Link_list_Context(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_list_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_list_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_list_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_setContext link_set() throws RecognitionException {
		Link_setContext _localctx = new Link_setContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_link_set);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case ALL_DIRECT_LINKS:
				_localctx = new All_driect_links_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282); match(ALL_DIRECT_LINKS);
				}
				break;
			case ALL_PATHS_AS_LINKS:
				_localctx = new All_paths_as_links_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283); match(ALL_PATHS_AS_LINKS);
				}
				break;
			case 6:
			case INT:
				_localctx = new Link_list_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(284); link_list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Link_listContext extends ParserRuleContext {
		public Link_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_list; }
	 
		public Link_listContext() { }
		public void copyFrom(Link_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Link_list__woContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Link_list__woContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_list__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_list__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_list__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Link_list__wContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public Link_list__wContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_list__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_list__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_list__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_listContext link_list() throws RecognitionException {
		Link_listContext _localctx = new Link_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_link_list);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Link_list__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287); link();
				}
				break;

			case 2:
				_localctx = new Link_list__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288); link();
				setState(289); match(4);
				setState(290); link_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkContext extends ParserRuleContext {
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
	 
		public LinkContext() { }
		public void copyFrom(LinkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Link__woContext extends LinkContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public Link__woContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Link__wContext extends LinkContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Link__wContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_link);
		try {
			setState(299);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new Link__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294); link_idx();
				}
				break;
			case 6:
				_localctx = new Link__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295); match(6);
				setState(296); path();
				setState(297); match(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathContext extends ParserRuleContext {
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	 
		public PathContext() { }
		public void copyFrom(PathContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Path__wContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public Path__wContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPath__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPath__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPath__w(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Path__woContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public Path__woContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPath__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPath__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPath__wo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_path);
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new Path__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301); link_idx();
				}
				break;

			case 2:
				_localctx = new Path__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302); link_idx();
				setState(303); match(7);
				setState(304); path();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Link_idxContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Link_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterLink_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitLink_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitLink_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_idxContext link_idx() throws RecognitionException {
		Link_idxContext _localctx = new Link_idxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_link_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Virtual_topoContext extends ParserRuleContext {
		public Link_setContext link_set() {
			return getRuleContext(Link_setContext.class,0);
		}
		public TerminalNode LINK() { return getToken(constraintParser.LINK, 0); }
		public TerminalNode AND() { return getToken(constraintParser.AND, 0); }
		public Switch_mappingContext switch_mapping() {
			return getRuleContext(Switch_mappingContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(constraintParser.VIRTUAL, 0); }
		public TerminalNode SWITCH() { return getToken(constraintParser.SWITCH, 0); }
		public Virtual_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_topoContext virtual_topo() throws RecognitionException {
		Virtual_topoContext _localctx = new Virtual_topoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_virtual_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(VIRTUAL);
			setState(311); match(SWITCH);
			setState(312); switch_mapping();
			setState(313); match(AND);
			setState(314); match(LINK);
			setState(315); link_set();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_mappingContext extends ParserRuleContext {
		public Switch_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_mapping; }
	 
		public Switch_mappingContext() { }
		public void copyFrom(Switch_mappingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single_big_switch_Context extends Switch_mappingContext {
		public TerminalNode SINGLE_BIG_SWITCH() { return getToken(constraintParser.SINGLE_BIG_SWITCH, 0); }
		public Single_big_switch_Context(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSingle_big_switch_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSingle_big_switch_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSingle_big_switch_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Virtual_switch_set_Context extends Switch_mappingContext {
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public Virtual_switch_set_Context(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_switch_set_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_switch_set_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_switch_set_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_mappingContext switch_mapping() throws RecognitionException {
		Switch_mappingContext _localctx = new Switch_mappingContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switch_mapping);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case SINGLE_BIG_SWITCH:
				_localctx = new Single_big_switch_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(317); match(SINGLE_BIG_SWITCH);
				}
				break;
			case 1:
				_localctx = new Virtual_switch_set_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318); match(1);
				setState(319); virtual_switch_set();
				setState(320); match(10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Virtual_switch_setContext extends ParserRuleContext {
		public Virtual_switch_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_switch_set; }
	 
		public Virtual_switch_setContext() { }
		public void copyFrom(Virtual_switch_setContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Virtual_switch_set__woContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(constraintParser.AS, 0); }
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Virtual_switch_set__woContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_switch_set__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_switch_set__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_switch_set__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Virtual_switch_set__wContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(constraintParser.AS, 0); }
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Virtual_switch_set__wContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterVirtual_switch_set__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitVirtual_switch_set__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitVirtual_switch_set__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_switch_setContext virtual_switch_set() throws RecognitionException {
		Virtual_switch_setContext _localctx = new Virtual_switch_setContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_virtual_switch_set);
		try {
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new Virtual_switch_set__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324); switch_set();
				setState(325); match(AS);
				setState(326); sw_idx();
				}
				break;

			case 2:
				_localctx = new Virtual_switch_set__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(328); switch_set();
				setState(329); match(AS);
				setState(330); sw_idx();
				setState(331); match(4);
				setState(332); virtual_switch_set();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	 
		public ActionContext() { }
		public void copyFrom(ActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Modify_Context extends ActionContext {
		public TerminalNode MODIFY() { return getToken(constraintParser.MODIFY, 0); }
		public Modify_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterModify_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitModify_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitModify_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Modify_field_Context extends ActionContext {
		public TerminalNode MODIFY() { return getToken(constraintParser.MODIFY, 0); }
		public TerminalNode FIELD() { return getToken(constraintParser.FIELD, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Modify_field_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterModify_field_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitModify_field_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitModify_field_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Forward_Context extends ActionContext {
		public TerminalNode FORWARD() { return getToken(constraintParser.FORWARD, 0); }
		public Forward_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterForward_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitForward_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitForward_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Drop_Context extends ActionContext {
		public TerminalNode DROP() { return getToken(constraintParser.DROP, 0); }
		public Drop_Context(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterDrop_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitDrop_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitDrop_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_action);
		try {
			setState(342);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new Drop_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336); match(DROP);
				}
				break;

			case 2:
				_localctx = new Forward_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337); match(FORWARD);
				}
				break;

			case 3:
				_localctx = new Modify_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(338); match(MODIFY);
				}
				break;

			case 4:
				_localctx = new Modify_field_Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(339); match(MODIFY);
				setState(340); match(FIELD);
				setState(341); field_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_listContext extends ParserRuleContext {
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
	 
		public Field_listContext() { }
		public void copyFrom(Field_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Filed__woContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Filed__woContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFiled__wo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFiled__wo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFiled__wo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Field__wContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Field__wContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterField__w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitField__w(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitField__w(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_field_list);
		try {
			setState(349);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Filed__woContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344); field();
				}
				break;

			case 2:
				_localctx = new Field__wContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(345); field();
				setState(346); match(4);
				setState(347); field_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnershipContext extends ParserRuleContext {
		public OwnershipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownership; }
	 
		public OwnershipContext() { }
		public void copyFrom(OwnershipContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Own_flows_Context extends OwnershipContext {
		public TerminalNode OWN_FLOWS() { return getToken(constraintParser.OWN_FLOWS, 0); }
		public Own_flows_Context(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterOwn_flows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitOwn_flows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitOwn_flows_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class All_flows_Context extends OwnershipContext {
		public TerminalNode ALL_FLOWS() { return getToken(constraintParser.ALL_FLOWS, 0); }
		public All_flows_Context(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterAll_flows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitAll_flows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitAll_flows_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Others_flows_Context extends OwnershipContext {
		public TerminalNode OTHERS_FLOWS() { return getToken(constraintParser.OTHERS_FLOWS, 0); }
		public Others_flows_Context(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterOthers_flows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitOthers_flows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitOthers_flows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnershipContext ownership() throws RecognitionException {
		OwnershipContext _localctx = new OwnershipContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ownership);
		try {
			setState(354);
			switch (_input.LA(1)) {
			case OWN_FLOWS:
				_localctx = new Own_flows_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351); match(OWN_FLOWS);
				}
				break;
			case OTHERS_FLOWS:
				_localctx = new Others_flows_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352); match(OTHERS_FLOWS);
				}
				break;
			case ALL_FLOWS:
				_localctx = new All_flows_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(353); match(ALL_FLOWS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Max_priorityContext extends ParserRuleContext {
		public TerminalNode MAX_PRIORITY() { return getToken(constraintParser.MAX_PRIORITY, 0); }
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public Max_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterMax_priority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitMax_priority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitMax_priority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_priorityContext max_priority() throws RecognitionException {
		Max_priorityContext _localctx = new Max_priorityContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_max_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356); match(MAX_PRIORITY);
			setState(357); match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Flow_tableContext extends ParserRuleContext {
		public Flow_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_table; }
	 
		public Flow_tableContext() { }
		public void copyFrom(Flow_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Flow_table_2Context extends Flow_tableContext {
		public TerminalNode SIZE_PERCENTAGE_PER_SWITCH() { return getToken(constraintParser.SIZE_PERCENTAGE_PER_SWITCH, 0); }
		public TerminalNode FLOAT() { return getToken(constraintParser.FLOAT, 0); }
		public Flow_table_2Context(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_table_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_table_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_table_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Flow_table__1Context extends Flow_tableContext {
		public TerminalNode INT() { return getToken(constraintParser.INT, 0); }
		public TerminalNode RULE_COUNT_PER_SWITCH() { return getToken(constraintParser.RULE_COUNT_PER_SWITCH, 0); }
		public Flow_table__1Context(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_table__1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_table__1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_table__1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_tableContext flow_table() throws RecognitionException {
		Flow_tableContext _localctx = new Flow_tableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_flow_table);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case RULE_COUNT_PER_SWITCH:
				_localctx = new Flow_table__1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359); match(RULE_COUNT_PER_SWITCH);
				setState(360); match(INT);
				}
				break;
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new Flow_table_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361); match(SIZE_PERCENTAGE_PER_SWITCH);
				setState(362); match(FLOAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotificationContext extends ParserRuleContext {
		public NotificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notification; }
	 
		public NotificationContext() { }
		public void copyFrom(NotificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Modify_event_order_Context extends NotificationContext {
		public TerminalNode MODIFY_EVENT_ORDER() { return getToken(constraintParser.MODIFY_EVENT_ORDER, 0); }
		public Modify_event_order_Context(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterModify_event_order_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitModify_event_order_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitModify_event_order_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Event_interception_Context extends NotificationContext {
		public TerminalNode EVENT_INTERCEPTION() { return getToken(constraintParser.EVENT_INTERCEPTION, 0); }
		public Event_interception_Context(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterEvent_interception_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitEvent_interception_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitEvent_interception_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationContext notification() throws RecognitionException {
		NotificationContext _localctx = new NotificationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_notification);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case EVENT_INTERCEPTION:
				_localctx = new Event_interception_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365); match(EVENT_INTERCEPTION);
				}
				break;
			case MODIFY_EVENT_ORDER:
				_localctx = new Modify_event_order_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366); match(MODIFY_EVENT_ORDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticsContext extends ParserRuleContext {
		public StatisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics; }
	 
		public StatisticsContext() { }
		public void copyFrom(StatisticsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Flow_level_Context extends StatisticsContext {
		public TerminalNode FLOW_LEVEL() { return getToken(constraintParser.FLOW_LEVEL, 0); }
		public Flow_level_Context(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterFlow_level_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitFlow_level_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitFlow_level_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Switch_level_Context extends StatisticsContext {
		public TerminalNode SWITCH_LEVEL() { return getToken(constraintParser.SWITCH_LEVEL, 0); }
		public Switch_level_Context(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterSwitch_level_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitSwitch_level_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitSwitch_level_(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Port_level_Context extends StatisticsContext {
		public TerminalNode PORT_LEVEL() { return getToken(constraintParser.PORT_LEVEL, 0); }
		public Port_level_Context(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPort_level_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPort_level_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPort_level_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsContext statistics() throws RecognitionException {
		StatisticsContext _localctx = new StatisticsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statistics);
		try {
			setState(372);
			switch (_input.LA(1)) {
			case FLOW_LEVEL:
				_localctx = new Flow_level_Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369); match(FLOW_LEVEL);
				}
				break;
			case PORT_LEVEL:
				_localctx = new Port_level_Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(370); match(PORT_LEVEL);
				}
				break;
			case SWITCH_LEVEL:
				_localctx = new Switch_level_Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(371); match(SWITCH_LEVEL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Perm_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(constraintParser.STRING, 0); }
		public Perm_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).enterPerm_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof constraintListener ) ((constraintListener)listener).exitPerm_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof constraintVisitor ) return ((constraintVisitor<? extends T>)visitor).visitPerm_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_nameContext perm_name() throws RecognitionException {
		Perm_nameContext _localctx = new Perm_nameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_perm_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14: return filter_expr_sempred((Filter_exprContext)_localctx, predIndex);

		case 15: return filter_term_sempred((Filter_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_expr_sempred(Filter_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean filter_term_sempred(Filter_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3>\u017b\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\3\3\3"+
		"\5\3e\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4y\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0084\n"+
		"\7\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ae\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b7\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00bf\n\20\f\20\16\20\u00c2\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00ca\n\21\f\21\16\21\u00cd\13\21\3\22\3\22\3\22\5\22\u00d2"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00e1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e9\n\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\5\26\u00f2\n\26\3\27\3\27\3\27\3\27\5\27"+
		"\u00f8\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\5\32\u0104"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0112\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0119\n\35\3\36\3\36\3\37\3"+
		"\37\3\37\5\37\u0120\n\37\3 \3 \3 \3 \3 \5 \u0127\n \3!\3!\3!\3!\3!\5!"+
		"\u012e\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0135\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\5%\u0145\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0151\n"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0159\n\'\3(\3(\3(\3(\3(\5(\u0160\n(\3)"+
		"\3)\3)\5)\u0165\n)\3*\3*\3*\3+\3+\3+\3+\5+\u016e\n+\3,\3,\5,\u0172\n,"+
		"\3-\3-\3-\5-\u0177\n-\3.\3.\3.\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\4\5\4\4\n\13\r\16\3 $\u017c"+
		"\2_\3\2\2\2\4d\3\2\2\2\6x\3\2\2\2\bz\3\2\2\2\n|\3\2\2\2\f\u0083\3\2\2"+
		"\2\16\u0089\3\2\2\2\20\u008f\3\2\2\2\22\u009c\3\2\2\2\24\u009e\3\2\2\2"+
		"\26\u00a2\3\2\2\2\30\u00a4\3\2\2\2\32\u00ad\3\2\2\2\34\u00b6\3\2\2\2\36"+
		"\u00b8\3\2\2\2 \u00c3\3\2\2\2\"\u00d1\3\2\2\2$\u00e0\3\2\2\2&\u00e8\3"+
		"\2\2\2(\u00ea\3\2\2\2*\u00f1\3\2\2\2,\u00f7\3\2\2\2.\u00f9\3\2\2\2\60"+
		"\u00ff\3\2\2\2\62\u0103\3\2\2\2\64\u0105\3\2\2\2\66\u0111\3\2\2\28\u0118"+
		"\3\2\2\2:\u011a\3\2\2\2<\u011f\3\2\2\2>\u0126\3\2\2\2@\u012d\3\2\2\2B"+
		"\u0134\3\2\2\2D\u0136\3\2\2\2F\u0138\3\2\2\2H\u0144\3\2\2\2J\u0150\3\2"+
		"\2\2L\u0158\3\2\2\2N\u015f\3\2\2\2P\u0164\3\2\2\2R\u0166\3\2\2\2T\u016d"+
		"\3\2\2\2V\u0171\3\2\2\2X\u0176\3\2\2\2Z\u0178\3\2\2\2\\^\5\4\3\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\3\3\2\2\2a_\3\2\2\2be\5\6\4\2ce"+
		"\5\16\b\2db\3\2\2\2dc\3\2\2\2e\5\3\2\2\2fg\7\17\2\2gh\5\b\5\2hi\7\13\2"+
		"\2ij\7\3\2\2jk\5\32\16\2kl\7\f\2\2ly\3\2\2\2mn\7\17\2\2no\5\b\5\2op\7"+
		"\13\2\2pq\7\20\2\2qr\5\n\6\2ry\3\2\2\2st\7\17\2\2tu\5\b\5\2uv\7\13\2\2"+
		"vw\5\f\7\2wy\3\2\2\2xf\3\2\2\2xm\3\2\2\2xs\3\2\2\2y\7\3\2\2\2z{\7=\2\2"+
		"{\t\3\2\2\2|}\7=\2\2}\13\3\2\2\2~\u0084\5\b\5\2\177\u0080\5\b\5\2\u0080"+
		"\u0081\7\21\2\2\u0081\u0082\5\f\7\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2"+
		"\u0083\177\3\2\2\2\u0084\r\3\2\2\2\u0085\u008a\5\20\t\2\u0086\u0087\5"+
		"\20\t\2\u0087\u0088\5\16\b\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\7\22\2\2\u008c\u0090\5\22"+
		"\n\2\u008d\u008e\7\22\2\2\u008e\u0090\5\30\r\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092\79\2\2\u0092\u009d\5\22\n"+
		"\2\u0093\u0094\5\24\13\2\u0094\u0095\78\2\2\u0095\u0096\5\22\n\2\u0096"+
		"\u009d\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7\67\2\2\u0099\u009a"+
		"\5\22\n\2\u009a\u009d\3\2\2\2\u009b\u009d\5\24\13\2\u009c\u0091\3\2\2"+
		"\2\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2\2\2\u009d\23"+
		"\3\2\2\2\u009e\u009f\5\f\7\2\u009f\u00a0\5\26\f\2\u00a0\u00a1\5\f\7\2"+
		"\u00a1\25\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7\23"+
		"\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a7\78\2\2\u00a7\u00a8\5\f\7\2\u00a8"+
		"\31\3\2\2\2\u00a9\u00ae\5\34\17\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\5"+
		"\32\16\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\33\3\2\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b7\5Z.\2\u00b1\u00b2\7\24\2"+
		"\2\u00b2\u00b3\5Z.\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\5\36\20\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00af\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\35\3\2\2"+
		"\2\u00b8\u00b9\b\20\1\2\u00b9\u00ba\5 \21\2\u00ba\u00c0\3\2\2\2\u00bb"+
		"\u00bc\6\20\2\3\u00bc\u00bd\7\67\2\2\u00bd\u00bf\5 \21\2\u00be\u00bb\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\37\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\21\1\2\u00c4\u00c5\5\"\22"+
		"\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\6\21\3\3\u00c7\u00c8\78\2\2\u00c8\u00ca"+
		"\5\"\22\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\5"+
		"$\23\2\u00cf\u00d0\79\2\2\u00d0\u00d2\5\"\22\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2#\3\2\2\2\u00d3\u00d4\7\b\2\2\u00d4\u00d5\5\36\20"+
		"\2\u00d5\u00d6\7\5\2\2\u00d6\u00e1\3\2\2\2\u00d7\u00e1\5&\24\2\u00d8\u00e1"+
		"\5\62\32\2\u00d9\u00da\7\26\2\2\u00da\u00e1\5L\'\2\u00db\u00e1\5P)\2\u00dc"+
		"\u00e1\5R*\2\u00dd\u00e1\5T+\2\u00de\u00e1\5V,\2\u00df\u00e1\5X-\2\u00e0"+
		"\u00d3\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00d9\3\2"+
		"\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1%\3\2\2\2\u00e2\u00e9\5.\30\2"+
		"\u00e3\u00e4\5(\25\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7"+
		"\7\f\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e9"+
		"\'\3\2\2\2\u00ea\u00eb\t\3\2\2\u00eb)\3\2\2\2\u00ec\u00f2\5,\27\2\u00ed"+
		"\u00ee\5,\27\2\u00ee\u00ef\7\6\2\2\u00ef\u00f0\5*\26\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ec\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2+\3\2\2\2\u00f3\u00f8"+
		"\7%\2\2\u00f4\u00f5\7%\2\2\u00f5\u00f6\7\7\2\2\u00f6\u00f8\7%\2\2\u00f7"+
		"\u00f3\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8-\3\2\2\2\u00f9\u00fa\7\'\2\2"+
		"\u00fa\u00fb\5\60\31\2\u00fb\u00fc\7(\2\2\u00fc\u00fd\7)\2\2\u00fd\u00fe"+
		"\5\60\31\2\u00fe/\3\2\2\2\u00ff\u0100\7*\2\2\u0100\61\3\2\2\2\u0101\u0104"+
		"\5\64\33\2\u0102\u0104\5F$\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\63\3\2\2\2\u0105\u0106\7+\2\2\u0106\u0107\5\66\34\2\u0107\u0108\7\67"+
		"\2\2\u0108\u0109\7,\2\2\u0109\u010a\5<\37\2\u010a\65\3\2\2\2\u010b\u0112"+
		"\7-\2\2\u010c\u0112\7.\2\2\u010d\u010e\7\3\2\2\u010e\u010f\58\35\2\u010f"+
		"\u0110\7\f\2\2\u0110\u0112\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010c\3\2"+
		"\2\2\u0111\u010d\3\2\2\2\u0112\67\3\2\2\2\u0113\u0119\5:\36\2\u0114\u0115"+
		"\5:\36\2\u0115\u0116\7\6\2\2\u0116\u0117\58\35\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u01199\3\2\2\2\u011a\u011b\7%\2\2\u011b"+
		";\3\2\2\2\u011c\u0120\7/\2\2\u011d\u0120\7\60\2\2\u011e\u0120\5> \2\u011f"+
		"\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120=\3\2\2\2"+
		"\u0121\u0127\5@!\2\u0122\u0123\5@!\2\u0123\u0124\7\6\2\2\u0124\u0125\5"+
		"> \2\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0127"+
		"?\3\2\2\2\u0128\u012e\5D#\2\u0129\u012a\7\b\2\2\u012a\u012b\5B\"\2\u012b"+
		"\u012c\7\5\2\2\u012c\u012e\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2"+
		"\2\2\u012eA\3\2\2\2\u012f\u0135\5D#\2\u0130\u0131\5D#\2\u0131\u0132\7"+
		"\t\2\2\u0132\u0133\5B\"\2\u0133\u0135\3\2\2\2\u0134\u012f\3\2\2\2\u0134"+
		"\u0130\3\2\2\2\u0135C\3\2\2\2\u0136\u0137\7%\2\2\u0137E\3\2\2\2\u0138"+
		"\u0139\7\61\2\2\u0139\u013a\7+\2\2\u013a\u013b\5H%\2\u013b\u013c\7\67"+
		"\2\2\u013c\u013d\7,\2\2\u013d\u013e\5<\37\2\u013eG\3\2\2\2\u013f\u0145"+
		"\7\62\2\2\u0140\u0141\7\3\2\2\u0141\u0142\5J&\2\u0142\u0143\7\f\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0145I\3\2\2\2"+
		"\u0146\u0147\5\66\34\2\u0147\u0148\7:\2\2\u0148\u0149\5:\36\2\u0149\u0151"+
		"\3\2\2\2\u014a\u014b\5\66\34\2\u014b\u014c\7:\2\2\u014c\u014d\5:\36\2"+
		"\u014d\u014e\7\6\2\2\u014e\u014f\5J&\2\u014f\u0151\3\2\2\2\u0150\u0146"+
		"\3\2\2\2\u0150\u014a\3\2\2\2\u0151K\3\2\2\2\u0152\u0159\7\63\2\2\u0153"+
		"\u0159\7\64\2\2\u0154\u0159\7\65\2\2\u0155\u0156\7\65\2\2\u0156\u0157"+
		"\7\66\2\2\u0157\u0159\5N(\2\u0158\u0152\3\2\2\2\u0158\u0153\3\2\2\2\u0158"+
		"\u0154\3\2\2\2\u0158\u0155\3\2\2\2\u0159M\3\2\2\2\u015a\u0160\5(\25\2"+
		"\u015b\u015c\5(\25\2\u015c\u015d\7\6\2\2\u015d\u015e\5N(\2\u015e\u0160"+
		"\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2\2\2\u0160O\3\2\2\2\u0161"+
		"\u0165\7\27\2\2\u0162\u0165\7\30\2\2\u0163\u0165\7\31\2\2\u0164\u0161"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165Q\3\2\2\2\u0166"+
		"\u0167\7\32\2\2\u0167\u0168\7%\2\2\u0168S\3\2\2\2\u0169\u016a\7;\2\2\u016a"+
		"\u016e\7%\2\2\u016b\u016c\7<\2\2\u016c\u016e\7&\2\2\u016d\u0169\3\2\2"+
		"\2\u016d\u016b\3\2\2\2\u016eU\3\2\2\2\u016f\u0172\7\33\2\2\u0170\u0172"+
		"\7\34\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172W\3\2\2\2\u0173"+
		"\u0177\7\35\2\2\u0174\u0177\7\36\2\2\u0175\u0177\7\37\2\2\u0176\u0173"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177Y\3\2\2\2\u0178"+
		"\u0179\7=\2\2\u0179[\3\2\2\2!_dx\u0083\u0089\u008f\u009c\u00ad\u00b6\u00c0"+
		"\u00cb\u00d1\u00e0\u00e8\u00f1\u00f7\u0103\u0111\u0118\u011f\u0126\u012d"+
		"\u0134\u0144\u0150\u0158\u015f\u0164\u016d\u0171\u0176";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}