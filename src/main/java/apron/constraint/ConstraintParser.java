package apron.constraint;
// Generated from Constraint.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConstraintParser extends Parser {
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
		FROM_PKT_IN=59, ARBITRARY=60, AllowNetworkAccess=61, DenyNetworkAccess=62, 
		AllowFileSystem=63, DenyFileSystem=64, AllowProcessRuntime=65, DenyProcessRuntime=66, 
		STRING=67, WS=68;
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
		"'AS'", "'RULE_COUNT_PER_SWITCH'", "'SIZE_PERCENTAGE_PER_SWITCH'", "'FROM_PKT_IN'", 
		"'ARBITRARY'", "'AllowNetworkAccess'", "'DenyNetworkAccess'", "'AllowFileSystem'", 
		"'DenyFileSystem'", "'AllowProcessRuntime'", "'DenyProcessRuntime'", "STRING", 
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
		RULE_notification = 42, RULE_statistics = 43, RULE_pkt_out = 44, RULE_perm_name = 45, 
		RULE_system = 46;
	public static final String[] ruleNames = {
		"program", "stat", "binding", "var_perm", "app_name", "perm_expr", "assert_list", 
		"assert_stmt", "assert_expr", "boolean_expr", "cmp_operator", "exclusive", 
		"perm_list", "perm", "filter_expr", "filter_term", "filter_factor", "filter_not_factor", 
		"flow_predicate", "field", "value_list", "value_range", "ip_range", "ip_format", 
		"topo", "physical_topo", "switch_set", "sw_idx_list", "sw_idx", "link_set", 
		"link_list", "link", "path", "link_idx", "virtual_topo", "switch_mapping", 
		"virtual_switch_set", "action", "field_list", "ownership", "max_priority", 
		"flow_table", "notification", "statistics", "pkt_out", "perm_name", "system"
	};

	@Override
	public String getGrammarFileName() { return "Constraint.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConstraintParser(TokenStream input) {
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
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET || _la==ASSERT) {
				{
				{
				setState(94); stat();
				}
				}
				setState(99);
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
	public static class AssertListContext extends StatContext {
		public Assert_listContext assert_list() {
			return getRuleContext(Assert_listContext.class,0);
		}
		public AssertListContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BindContext extends StatContext {
		public BindingContext binding() {
			return getRuleContext(BindingContext.class,0);
		}
		public BindContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterBind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitBind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(102);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new BindContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100); binding();
				}
				break;
			case ASSERT:
				_localctx = new AssertListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101); assert_list();
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
	public static class BindAppContext extends BindingContext {
		public TerminalNode APP() { return getToken(ConstraintParser.APP, 0); }
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public TerminalNode LET() { return getToken(ConstraintParser.LET, 0); }
		public App_nameContext app_name() {
			return getRuleContext(App_nameContext.class,0);
		}
		public BindAppContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterBindApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitBindApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitBindApp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BindListContext extends BindingContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public TerminalNode LET() { return getToken(ConstraintParser.LET, 0); }
		public BindListContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterBindList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitBindList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitBindList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BindExprContext extends BindingContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_exprContext perm_expr() {
			return getRuleContext(Perm_exprContext.class,0);
		}
		public TerminalNode LET() { return getToken(ConstraintParser.LET, 0); }
		public BindExprContext(BindingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterBindExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitBindExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitBindExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_binding);
		try {
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BindListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(LET);
				setState(105); var_perm();
				setState(106); match(9);
				setState(107); match(1);
				setState(108); perm_list();
				setState(109); match(10);
				}
				break;

			case 2:
				_localctx = new BindAppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(LET);
				setState(112); var_perm();
				setState(113); match(9);
				setState(114); match(APP);
				setState(115); app_name();
				}
				break;

			case 3:
				_localctx = new BindExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117); match(LET);
				setState(118); var_perm();
				setState(119); match(9);
				setState(120); perm_expr(0);
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
		public TerminalNode STRING() { return getToken(ConstraintParser.STRING, 0); }
		public Var_permContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_perm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterVar_perm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitVar_perm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitVar_perm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_permContext var_perm() throws RecognitionException {
		Var_permContext _localctx = new Var_permContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_perm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(STRING);
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
		public TerminalNode STRING() { return getToken(ConstraintParser.STRING, 0); }
		public App_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterApp_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitApp_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitApp_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final App_nameContext app_name() throws RecognitionException {
		App_nameContext _localctx = new App_nameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_app_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(STRING);
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
		public int _p;
		public Perm_exprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Perm_exprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_perm_expr; }
	 
		public Perm_exprContext() { }
		public void copyFrom(Perm_exprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class VarPermContext extends Perm_exprContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public VarPermContext(Perm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterVarPerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitVarPerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitVarPerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermExprUnionContext extends Perm_exprContext {
		public Var_permContext var_perm() {
			return getRuleContext(Var_permContext.class,0);
		}
		public Perm_exprContext perm_expr() {
			return getRuleContext(Perm_exprContext.class,0);
		}
		public TerminalNode UNION() { return getToken(ConstraintParser.UNION, 0); }
		public PermExprUnionContext(Perm_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPermExprUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPermExprUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPermExprUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_exprContext perm_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Perm_exprContext _localctx = new Perm_exprContext(_ctx, _parentState, _p);
		Perm_exprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_perm_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarPermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(129); var_perm();
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PermExprUnionContext(new Perm_exprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_perm_expr);
					setState(131);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(132); match(UNION);
					setState(133); var_perm();
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class AssertStmtMContext extends Assert_listContext {
		public Assert_listContext assert_list() {
			return getRuleContext(Assert_listContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public AssertStmtMContext(Assert_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertStmtM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertStmtM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertStmtM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertStmtSContext extends Assert_listContext {
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public AssertStmtSContext(Assert_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertStmtS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertStmtS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertStmtS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_listContext assert_list() throws RecognitionException {
		Assert_listContext _localctx = new Assert_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assert_list);
		try {
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssertStmtSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139); assert_stmt();
				}
				break;

			case 2:
				_localctx = new AssertStmtMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140); assert_stmt();
				setState(141); assert_list();
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
	public static class AssertExclusiveContext extends Assert_stmtContext {
		public ExclusiveContext exclusive() {
			return getRuleContext(ExclusiveContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ConstraintParser.ASSERT, 0); }
		public AssertExclusiveContext(Assert_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertExclusive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertExclusive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertExclusive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertExprContext extends Assert_stmtContext {
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ConstraintParser.ASSERT, 0); }
		public AssertExprContext(Assert_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assert_stmt);
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssertExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(ASSERT);
				setState(146); assert_expr(0);
				}
				break;

			case 2:
				_localctx = new AssertExclusiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147); match(ASSERT);
				setState(148); exclusive();
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
		public int _p;
		public Assert_exprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assert_exprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_assert_expr; }
	 
		public Assert_exprContext() { }
		public void copyFrom(Assert_exprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AssertAndContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public TerminalNode AND() { return getToken(ConstraintParser.AND, 0); }
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public AssertAndContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExprContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public BooleanExprContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitBooleanExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertNotContext extends Assert_exprContext {
		public TerminalNode NOT() { return getToken(ConstraintParser.NOT, 0); }
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public AssertNotContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssertOrContext extends Assert_exprContext {
		public Boolean_exprContext boolean_expr() {
			return getRuleContext(Boolean_exprContext.class,0);
		}
		public Assert_exprContext assert_expr() {
			return getRuleContext(Assert_exprContext.class,0);
		}
		public TerminalNode OR() { return getToken(ConstraintParser.OR, 0); }
		public AssertOrContext(Assert_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAssertOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAssertOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAssertOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_exprContext assert_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Assert_exprContext _localctx = new Assert_exprContext(_ctx, _parentState, _p);
		Assert_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_assert_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new AssertNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152); match(NOT);
				setState(153); assert_expr(4);
				}
				break;
			case STRING:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154); boolean_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AssertOrContext(new Assert_exprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_assert_expr);
						setState(157);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(158); match(OR);
						setState(159); boolean_expr();
						}
						break;

					case 2:
						{
						_localctx = new AssertAndContext(new Assert_exprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_assert_expr);
						setState(160);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(161); match(AND);
						setState(162); boolean_expr();
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterBoolean_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitBoolean_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitBoolean_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_exprContext boolean_expr() throws RecognitionException {
		Boolean_exprContext _localctx = new Boolean_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); perm_expr(0);
			setState(169); cmp_operator();
			setState(170); perm_expr(0);
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
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterCmp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitCmp_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitCmp_operator(this);
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
			setState(172);
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
		public TerminalNode EITHER() { return getToken(ConstraintParser.EITHER, 0); }
		public Perm_exprContext perm_expr(int i) {
			return getRuleContext(Perm_exprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ConstraintParser.OR, 0); }
		public ExclusiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterExclusive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitExclusive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitExclusive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveContext exclusive() throws RecognitionException {
		ExclusiveContext _localctx = new ExclusiveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exclusive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); match(EITHER);
			setState(175); perm_expr(0);
			setState(176); match(OR);
			setState(177); perm_expr(0);
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
	public static class PermListSContext extends Perm_listContext {
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public PermListSContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPermListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPermListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPermListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermListMContext extends Perm_listContext {
		public Perm_listContext perm_list() {
			return getRuleContext(Perm_listContext.class,0);
		}
		public PermContext perm() {
			return getRuleContext(PermContext.class,0);
		}
		public PermListMContext(Perm_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPermListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPermListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPermListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_listContext perm_list() throws RecognitionException {
		Perm_listContext _localctx = new Perm_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_perm_list);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PermListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179); perm();
				}
				break;

			case 2:
				_localctx = new PermListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180); perm();
				setState(181); perm_list();
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
	public static class PermSContext extends PermContext {
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(ConstraintParser.PERM, 0); }
		public PermSContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPermS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPermS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPermS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PermMContext extends PermContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public TerminalNode LIMITING() { return getToken(ConstraintParser.LIMITING, 0); }
		public Perm_nameContext perm_name() {
			return getRuleContext(Perm_nameContext.class,0);
		}
		public TerminalNode PERM() { return getToken(ConstraintParser.PERM, 0); }
		public PermMContext(PermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPermM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPermM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPermM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermContext perm() throws RecognitionException {
		PermContext _localctx = new PermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_perm);
		try {
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PermSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(PERM);
				setState(186); perm_name();
				}
				break;

			case 2:
				_localctx = new PermMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(PERM);
				setState(188); perm_name();
				setState(189); match(LIMITING);
				setState(190); filter_expr(0);
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
	public static class FilterExprAndTermContext extends Filter_exprContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public TerminalNode AND() { return getToken(ConstraintParser.AND, 0); }
		public FilterExprAndTermContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFilterExprAndTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFilterExprAndTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFilterExprAndTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterExprTermContext extends Filter_exprContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public FilterExprTermContext(Filter_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFilterExprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFilterExprTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFilterExprTerm(this);
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
			_localctx = new FilterExprTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(195); filter_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterExprAndTermContext(new Filter_exprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_expr);
					setState(197);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(198); match(AND);
					setState(199); filter_term(0);
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class FilterTermFactorContext extends Filter_termContext {
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public FilterTermFactorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFilterTermFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFilterTermFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFilterTermFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterTermOrFactorContext extends Filter_termContext {
		public Filter_termContext filter_term() {
			return getRuleContext(Filter_termContext.class,0);
		}
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public TerminalNode OR() { return getToken(ConstraintParser.OR, 0); }
		public FilterTermOrFactorContext(Filter_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFilterTermOrFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFilterTermOrFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFilterTermOrFactor(this);
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
			_localctx = new FilterTermFactorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(206); filter_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FilterTermOrFactorContext(new Filter_termContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_filter_term);
					setState(208);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(209); match(OR);
					setState(210); filter_factor();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
	public static class FilterFactorNotFactorContext extends Filter_factorContext {
		public Filter_not_factorContext filter_not_factor() {
			return getRuleContext(Filter_not_factorContext.class,0);
		}
		public FilterFactorNotFactorContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFilterFactorNotFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFilterFactorNotFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFilterFactorNotFactor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterFactorNotContext extends Filter_factorContext {
		public TerminalNode NOT() { return getToken(ConstraintParser.NOT, 0); }
		public Filter_factorContext filter_factor() {
			return getRuleContext(Filter_factorContext.class,0);
		}
		public FilterFactorNotContext(Filter_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFilterFactorNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFilterFactorNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFilterFactorNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_factorContext filter_factor() throws RecognitionException {
		Filter_factorContext _localctx = new Filter_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_filter_factor);
		try {
			setState(219);
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
			case FROM_PKT_IN:
			case ARBITRARY:
			case AllowNetworkAccess:
			case DenyNetworkAccess:
			case AllowFileSystem:
			case DenyFileSystem:
			case AllowProcessRuntime:
			case DenyProcessRuntime:
				_localctx = new FilterFactorNotFactorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(216); filter_not_factor();
				}
				break;
			case NOT:
				_localctx = new FilterFactorNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217); match(NOT);
				setState(218); filter_factor();
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
	public static class OwnershipSContext extends Filter_not_factorContext {
		public OwnershipContext ownership() {
			return getRuleContext(OwnershipContext.class,0);
		}
		public OwnershipSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterOwnershipS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitOwnershipS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitOwnershipS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowTableContext extends Filter_not_factorContext {
		public Flow_tableContext flow_table() {
			return getRuleContext(Flow_tableContext.class,0);
		}
		public FlowTableContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFlowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFlowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFlowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterExprContext extends Filter_not_factorContext {
		public Filter_exprContext filter_expr() {
			return getRuleContext(Filter_exprContext.class,0);
		}
		public FilterExprContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFilterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFilterExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowPredicateContext extends Filter_not_factorContext {
		public Flow_predicateContext flow_predicate() {
			return getRuleContext(Flow_predicateContext.class,0);
		}
		public FlowPredicateContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFlowPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFlowPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFlowPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopologyContext extends Filter_not_factorContext {
		public TopoContext topo() {
			return getRuleContext(TopoContext.class,0);
		}
		public TopologyContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterTopology(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitTopology(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitTopology(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionsContext extends Filter_not_factorContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ConstraintParser.ACTION, 0); }
		public ActionsContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PktOutContext extends Filter_not_factorContext {
		public Pkt_outContext pkt_out() {
			return getRuleContext(Pkt_outContext.class,0);
		}
		public PktOutContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPktOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPktOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPktOut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SystemSContext extends Filter_not_factorContext {
		public SystemContext system() {
			return getRuleContext(SystemContext.class,0);
		}
		public SystemSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterSystemS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitSystemS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitSystemS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaxPriorityContext extends Filter_not_factorContext {
		public Max_priorityContext max_priority() {
			return getRuleContext(Max_priorityContext.class,0);
		}
		public MaxPriorityContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterMaxPriority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitMaxPriority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitMaxPriority(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotificationSContext extends Filter_not_factorContext {
		public NotificationContext notification() {
			return getRuleContext(NotificationContext.class,0);
		}
		public NotificationSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterNotificationS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitNotificationS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitNotificationS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatisticsSContext extends Filter_not_factorContext {
		public StatisticsContext statistics() {
			return getRuleContext(StatisticsContext.class,0);
		}
		public StatisticsSContext(Filter_not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterStatisticsS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitStatisticsS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitStatisticsS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_not_factorContext filter_not_factor() throws RecognitionException {
		Filter_not_factorContext _localctx = new Filter_not_factorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_filter_not_factor);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case 6:
				_localctx = new FilterExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221); match(6);
				setState(222); filter_expr(0);
				setState(223); match(3);
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case IP:
				_localctx = new FlowPredicateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225); flow_predicate();
				}
				break;
			case SWITCH:
			case VIRTUAL:
				_localctx = new TopologyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226); topo();
				}
				break;
			case ACTION:
				_localctx = new ActionsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(227); match(ACTION);
				setState(228); action();
				}
				break;
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
				_localctx = new OwnershipSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(229); ownership();
				}
				break;
			case MAX_PRIORITY:
				_localctx = new MaxPriorityContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(230); max_priority();
				}
				break;
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(231); flow_table();
				}
				break;
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
				_localctx = new NotificationSContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(232); notification();
				}
				break;
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
				_localctx = new StatisticsSContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(233); statistics();
				}
				break;
			case FROM_PKT_IN:
			case ARBITRARY:
				_localctx = new PktOutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(234); pkt_out();
				}
				break;
			case AllowNetworkAccess:
			case DenyNetworkAccess:
			case AllowFileSystem:
			case DenyFileSystem:
			case AllowProcessRuntime:
			case DenyProcessRuntime:
				_localctx = new SystemSContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(235); system();
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
	public static class FieldListContext extends Flow_predicateContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public FieldListContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IpRangeContext extends Flow_predicateContext {
		public Ip_rangeContext ip_range() {
			return getRuleContext(Ip_rangeContext.class,0);
		}
		public IpRangeContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterIpRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitIpRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitIpRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_predicateContext flow_predicate() throws RecognitionException {
		Flow_predicateContext _localctx = new Flow_predicateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_flow_predicate);
		try {
			setState(244);
			switch (_input.LA(1)) {
			case IP:
				_localctx = new IpRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238); ip_range();
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
				_localctx = new FieldListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239); field();
				setState(240); match(1);
				setState(241); value_list();
				setState(242); match(10);
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
		public TerminalNode IP_SRC() { return getToken(ConstraintParser.IP_SRC, 0); }
		public TerminalNode TCP_DST() { return getToken(ConstraintParser.TCP_DST, 0); }
		public TerminalNode VLAN_ID() { return getToken(ConstraintParser.VLAN_ID, 0); }
		public TerminalNode TCP_SRC() { return getToken(ConstraintParser.TCP_SRC, 0); }
		public TerminalNode IP_DST() { return getToken(ConstraintParser.IP_DST, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitField(this);
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
			setState(246);
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
	public static class ValueListMContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public ValueListMContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterValueListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitValueListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitValueListM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueListSContext extends Value_listContext {
		public Value_rangeContext value_range() {
			return getRuleContext(Value_rangeContext.class,0);
		}
		public ValueListSContext(Value_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterValueListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitValueListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitValueListS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value_list);
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ValueListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248); value_range();
				}
				break;

			case 2:
				_localctx = new ValueListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249); value_range();
				setState(250); match(4);
				setState(251); value_list();
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
	public static class ValueRangeSContext extends Value_rangeContext {
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public ValueRangeSContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterValueRangeS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitValueRangeS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitValueRangeS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueRangeMContext extends Value_rangeContext {
		public List<TerminalNode> INT() { return getTokens(ConstraintParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ConstraintParser.INT, i);
		}
		public ValueRangeMContext(Value_rangeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterValueRangeM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitValueRangeM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitValueRangeM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_rangeContext value_range() throws RecognitionException {
		Value_rangeContext _localctx = new Value_rangeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value_range);
		try {
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ValueRangeSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255); match(INT);
				}
				break;

			case 2:
				_localctx = new ValueRangeMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256); match(INT);
				setState(257); match(5);
				setState(258); match(INT);
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
		public TerminalNode MASK() { return getToken(ConstraintParser.MASK, 0); }
		public Ip_formatContext ip_format(int i) {
			return getRuleContext(Ip_formatContext.class,i);
		}
		public List<Ip_formatContext> ip_format() {
			return getRuleContexts(Ip_formatContext.class);
		}
		public TerminalNode IP() { return getToken(ConstraintParser.IP, 0); }
		public TerminalNode WITH() { return getToken(ConstraintParser.WITH, 0); }
		public Ip_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterIp_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitIp_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitIp_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_rangeContext ip_range() throws RecognitionException {
		Ip_rangeContext _localctx = new Ip_rangeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ip_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); match(IP);
			setState(262); ip_format();
			setState(263); match(WITH);
			setState(264); match(MASK);
			setState(265); ip_format();
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
		public TerminalNode IP_FORMAT() { return getToken(ConstraintParser.IP_FORMAT, 0); }
		public Ip_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterIp_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitIp_format(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitIp_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ip_formatContext ip_format() throws RecognitionException {
		Ip_formatContext _localctx = new Ip_formatContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ip_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267); match(IP_FORMAT);
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
	public static class VirtualTopoContext extends TopoContext {
		public Virtual_topoContext virtual_topo() {
			return getRuleContext(Virtual_topoContext.class,0);
		}
		public VirtualTopoContext(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterVirtualTopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitVirtualTopo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitVirtualTopo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PhysicalTopoContext extends TopoContext {
		public Physical_topoContext physical_topo() {
			return getRuleContext(Physical_topoContext.class,0);
		}
		public PhysicalTopoContext(TopoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPhysicalTopo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPhysicalTopo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPhysicalTopo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopoContext topo() throws RecognitionException {
		TopoContext _localctx = new TopoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_topo);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case SWITCH:
				_localctx = new PhysicalTopoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269); physical_topo();
				}
				break;
			case VIRTUAL:
				_localctx = new VirtualTopoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270); virtual_topo();
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
		public TerminalNode LINK() { return getToken(ConstraintParser.LINK, 0); }
		public TerminalNode AND() { return getToken(ConstraintParser.AND, 0); }
		public TerminalNode SWITCH() { return getToken(ConstraintParser.SWITCH, 0); }
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public Physical_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_physical_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPhysical_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPhysical_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPhysical_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Physical_topoContext physical_topo() throws RecognitionException {
		Physical_topoContext _localctx = new Physical_topoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_physical_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(SWITCH);
			setState(274); switch_set();
			setState(275); match(AND);
			setState(276); match(LINK);
			setState(277); link_set();
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
	public static class AllSwitchesContext extends Switch_setContext {
		public TerminalNode ALL_SWITCHES() { return getToken(ConstraintParser.ALL_SWITCHES, 0); }
		public AllSwitchesContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAllSwitches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAllSwitches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAllSwitches(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwIdxListContext extends Switch_setContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public SwIdxListContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterSwIdxList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitSwIdxList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitSwIdxList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BorderSwitchesContext extends Switch_setContext {
		public TerminalNode BORDER_SWITCHES() { return getToken(ConstraintParser.BORDER_SWITCHES, 0); }
		public BorderSwitchesContext(Switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterBorderSwitches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitBorderSwitches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitBorderSwitches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_setContext switch_set() throws RecognitionException {
		Switch_setContext _localctx = new Switch_setContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_switch_set);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case ALL_SWITCHES:
				_localctx = new AllSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(ALL_SWITCHES);
				}
				break;
			case BORDER_SWITCHES:
				_localctx = new BorderSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(BORDER_SWITCHES);
				}
				break;
			case 1:
				_localctx = new SwIdxListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281); match(1);
				setState(282); sw_idx_list();
				setState(283); match(10);
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
	public static class SwIdxListSContext extends Sw_idx_listContext {
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public SwIdxListSContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterSwIdxListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitSwIdxListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitSwIdxListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwIdxListMContext extends Sw_idx_listContext {
		public Sw_idx_listContext sw_idx_list() {
			return getRuleContext(Sw_idx_listContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public SwIdxListMContext(Sw_idx_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterSwIdxListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitSwIdxListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitSwIdxListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idx_listContext sw_idx_list() throws RecognitionException {
		Sw_idx_listContext _localctx = new Sw_idx_listContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sw_idx_list);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SwIdxListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287); sw_idx();
				}
				break;

			case 2:
				_localctx = new SwIdxListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288); sw_idx();
				setState(289); match(4);
				setState(290); sw_idx_list();
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
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public Sw_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sw_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterSw_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitSw_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitSw_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sw_idxContext sw_idx() throws RecognitionException {
		Sw_idxContext _localctx = new Sw_idxContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sw_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294); match(INT);
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
	public static class AllDriectLinksContext extends Link_setContext {
		public TerminalNode ALL_DIRECT_LINKS() { return getToken(ConstraintParser.ALL_DIRECT_LINKS, 0); }
		public AllDriectLinksContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAllDriectLinks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAllDriectLinks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAllDriectLinks(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AllPathsAsLinksContext extends Link_setContext {
		public TerminalNode ALL_PATHS_AS_LINKS() { return getToken(ConstraintParser.ALL_PATHS_AS_LINKS, 0); }
		public AllPathsAsLinksContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAllPathsAsLinks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAllPathsAsLinks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAllPathsAsLinks(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkListContext extends Link_setContext {
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public LinkListContext(Link_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterLinkList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitLinkList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitLinkList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_setContext link_set() throws RecognitionException {
		Link_setContext _localctx = new Link_setContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_link_set);
		try {
			setState(299);
			switch (_input.LA(1)) {
			case ALL_DIRECT_LINKS:
				_localctx = new AllDriectLinksContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296); match(ALL_DIRECT_LINKS);
				}
				break;
			case ALL_PATHS_AS_LINKS:
				_localctx = new AllPathsAsLinksContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297); match(ALL_PATHS_AS_LINKS);
				}
				break;
			case 6:
			case INT:
				_localctx = new LinkListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(298); link_list();
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
	public static class LinkListSContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public LinkListSContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterLinkListS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitLinkListS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitLinkListS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkListMContext extends Link_listContext {
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Link_listContext link_list() {
			return getRuleContext(Link_listContext.class,0);
		}
		public LinkListMContext(Link_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterLinkListM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitLinkListM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitLinkListM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_listContext link_list() throws RecognitionException {
		Link_listContext _localctx = new Link_listContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_link_list);
		try {
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new LinkListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301); link();
				}
				break;

			case 2:
				_localctx = new LinkListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302); link();
				setState(303); match(4);
				setState(304); link_list();
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
	public static class LinkMContext extends LinkContext {
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public LinkMContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterLinkM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitLinkM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitLinkM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LinkSContext extends LinkContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public LinkSContext(LinkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterLinkS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitLinkS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitLinkS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_link);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new LinkSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(308); link_idx();
				}
				break;
			case 6:
				_localctx = new LinkMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(309); match(6);
				setState(310); path();
				setState(311); match(3);
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
	public static class PathMContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public PathMContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPathM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPathM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPathM(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PathSContext extends PathContext {
		public Link_idxContext link_idx() {
			return getRuleContext(Link_idxContext.class,0);
		}
		public PathSContext(PathContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPathS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPathS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPathS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_path);
		try {
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new PathSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315); link_idx();
				}
				break;

			case 2:
				_localctx = new PathMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316); link_idx();
				setState(317); match(7);
				setState(318); path();
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
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public Link_idxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_idx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterLink_idx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitLink_idx(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitLink_idx(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_idxContext link_idx() throws RecognitionException {
		Link_idxContext _localctx = new Link_idxContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_link_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(INT);
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
		public TerminalNode LINK() { return getToken(ConstraintParser.LINK, 0); }
		public TerminalNode AND() { return getToken(ConstraintParser.AND, 0); }
		public Switch_mappingContext switch_mapping() {
			return getRuleContext(Switch_mappingContext.class,0);
		}
		public TerminalNode VIRTUAL() { return getToken(ConstraintParser.VIRTUAL, 0); }
		public TerminalNode SWITCH() { return getToken(ConstraintParser.SWITCH, 0); }
		public Virtual_topoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtual_topo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterVirtual_topo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitVirtual_topo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitVirtual_topo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_topoContext virtual_topo() throws RecognitionException {
		Virtual_topoContext _localctx = new Virtual_topoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_virtual_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324); match(VIRTUAL);
			setState(325); match(SWITCH);
			setState(326); switch_mapping();
			setState(327); match(AND);
			setState(328); match(LINK);
			setState(329); link_set();
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
	public static class VirtualSwitchSetContext extends Switch_mappingContext {
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public VirtualSwitchSetContext(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterVirtualSwitchSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitVirtualSwitchSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitVirtualSwitchSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleBigSwitchContext extends Switch_mappingContext {
		public TerminalNode SINGLE_BIG_SWITCH() { return getToken(ConstraintParser.SINGLE_BIG_SWITCH, 0); }
		public SingleBigSwitchContext(Switch_mappingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterSingleBigSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitSingleBigSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitSingleBigSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_mappingContext switch_mapping() throws RecognitionException {
		Switch_mappingContext _localctx = new Switch_mappingContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_switch_mapping);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case SINGLE_BIG_SWITCH:
				_localctx = new SingleBigSwitchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331); match(SINGLE_BIG_SWITCH);
				}
				break;
			case 1:
				_localctx = new VirtualSwitchSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(332); match(1);
				setState(333); virtual_switch_set();
				setState(334); match(10);
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
	public static class VirtualSwitchSetSContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(ConstraintParser.AS, 0); }
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public VirtualSwitchSetSContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterVirtualSwitchSetS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitVirtualSwitchSetS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitVirtualSwitchSetS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VirtualSwitchSetMContext extends Virtual_switch_setContext {
		public TerminalNode AS() { return getToken(ConstraintParser.AS, 0); }
		public Virtual_switch_setContext virtual_switch_set() {
			return getRuleContext(Virtual_switch_setContext.class,0);
		}
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
		public Switch_setContext switch_set() {
			return getRuleContext(Switch_setContext.class,0);
		}
		public VirtualSwitchSetMContext(Virtual_switch_setContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterVirtualSwitchSetM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitVirtualSwitchSetM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitVirtualSwitchSetM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Virtual_switch_setContext virtual_switch_set() throws RecognitionException {
		Virtual_switch_setContext _localctx = new Virtual_switch_setContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_virtual_switch_set);
		try {
			setState(348);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new VirtualSwitchSetSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338); switch_set();
				setState(339); match(AS);
				setState(340); sw_idx();
				}
				break;

			case 2:
				_localctx = new VirtualSwitchSetMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(342); switch_set();
				setState(343); match(AS);
				setState(344); sw_idx();
				setState(345); match(4);
				setState(346); virtual_switch_set();
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
	public static class DropContext extends ActionContext {
		public TerminalNode DROP() { return getToken(ConstraintParser.DROP, 0); }
		public DropContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyFieldContext extends ActionContext {
		public TerminalNode MODIFY() { return getToken(ConstraintParser.MODIFY, 0); }
		public TerminalNode FIELD() { return getToken(ConstraintParser.FIELD, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public ModifyFieldContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterModifyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitModifyField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitModifyField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyContext extends ActionContext {
		public TerminalNode MODIFY() { return getToken(ConstraintParser.MODIFY, 0); }
		public ModifyContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForwardContext extends ActionContext {
		public TerminalNode FORWARD() { return getToken(ConstraintParser.FORWARD, 0); }
		public ForwardContext(ActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterForward(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitForward(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitForward(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_action);
		try {
			setState(356);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new DropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350); match(DROP);
				}
				break;

			case 2:
				_localctx = new ForwardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(351); match(FORWARD);
				}
				break;

			case 3:
				_localctx = new ModifyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(352); match(MODIFY);
				}
				break;

			case 4:
				_localctx = new ModifyFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(353); match(MODIFY);
				setState(354); match(FIELD);
				setState(355); field_list();
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
	public static class FieldSContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldSContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFieldS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFieldS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFieldS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldMContext extends Field_listContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public FieldMContext(Field_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFieldM(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFieldM(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFieldM(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_listContext field_list() throws RecognitionException {
		Field_listContext _localctx = new Field_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_field_list);
		try {
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new FieldSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358); field();
				}
				break;

			case 2:
				_localctx = new FieldMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359); field();
				setState(360); match(4);
				setState(361); field_list();
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
	public static class AllFlowsContext extends OwnershipContext {
		public TerminalNode ALL_FLOWS() { return getToken(ConstraintParser.ALL_FLOWS, 0); }
		public AllFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterAllFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitAllFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitAllFlows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OwnFlowsContext extends OwnershipContext {
		public TerminalNode OWN_FLOWS() { return getToken(ConstraintParser.OWN_FLOWS, 0); }
		public OwnFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterOwnFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitOwnFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitOwnFlows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OthersFlowsContext extends OwnershipContext {
		public TerminalNode OTHERS_FLOWS() { return getToken(ConstraintParser.OTHERS_FLOWS, 0); }
		public OthersFlowsContext(OwnershipContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterOthersFlows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitOthersFlows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitOthersFlows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnershipContext ownership() throws RecognitionException {
		OwnershipContext _localctx = new OwnershipContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ownership);
		try {
			setState(368);
			switch (_input.LA(1)) {
			case OWN_FLOWS:
				_localctx = new OwnFlowsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365); match(OWN_FLOWS);
				}
				break;
			case OTHERS_FLOWS:
				_localctx = new OthersFlowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366); match(OTHERS_FLOWS);
				}
				break;
			case ALL_FLOWS:
				_localctx = new AllFlowsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367); match(ALL_FLOWS);
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
		public TerminalNode MAX_PRIORITY() { return getToken(ConstraintParser.MAX_PRIORITY, 0); }
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public Max_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_priority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterMax_priority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitMax_priority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitMax_priority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_priorityContext max_priority() throws RecognitionException {
		Max_priorityContext _localctx = new Max_priorityContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_max_priority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(MAX_PRIORITY);
			setState(371); match(INT);
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
	public static class FlowTableBContext extends Flow_tableContext {
		public TerminalNode SIZE_PERCENTAGE_PER_SWITCH() { return getToken(ConstraintParser.SIZE_PERCENTAGE_PER_SWITCH, 0); }
		public TerminalNode FLOAT() { return getToken(ConstraintParser.FLOAT, 0); }
		public FlowTableBContext(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFlowTableB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFlowTableB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFlowTableB(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowTableAContext extends Flow_tableContext {
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public TerminalNode RULE_COUNT_PER_SWITCH() { return getToken(ConstraintParser.RULE_COUNT_PER_SWITCH, 0); }
		public FlowTableAContext(Flow_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFlowTableA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFlowTableA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFlowTableA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_tableContext flow_table() throws RecognitionException {
		Flow_tableContext _localctx = new Flow_tableContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_flow_table);
		try {
			setState(377);
			switch (_input.LA(1)) {
			case RULE_COUNT_PER_SWITCH:
				_localctx = new FlowTableAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(373); match(RULE_COUNT_PER_SWITCH);
				setState(374); match(INT);
				}
				break;
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(375); match(SIZE_PERCENTAGE_PER_SWITCH);
				setState(376); match(FLOAT);
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
	public static class EventInterceptionContext extends NotificationContext {
		public TerminalNode EVENT_INTERCEPTION() { return getToken(ConstraintParser.EVENT_INTERCEPTION, 0); }
		public EventInterceptionContext(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterEventInterception(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitEventInterception(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitEventInterception(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModifyEventOrderContext extends NotificationContext {
		public TerminalNode MODIFY_EVENT_ORDER() { return getToken(ConstraintParser.MODIFY_EVENT_ORDER, 0); }
		public ModifyEventOrderContext(NotificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterModifyEventOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitModifyEventOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitModifyEventOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationContext notification() throws RecognitionException {
		NotificationContext _localctx = new NotificationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_notification);
		try {
			setState(381);
			switch (_input.LA(1)) {
			case EVENT_INTERCEPTION:
				_localctx = new EventInterceptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379); match(EVENT_INTERCEPTION);
				}
				break;
			case MODIFY_EVENT_ORDER:
				_localctx = new ModifyEventOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380); match(MODIFY_EVENT_ORDER);
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
	public static class PortLevelContext extends StatisticsContext {
		public TerminalNode PORT_LEVEL() { return getToken(ConstraintParser.PORT_LEVEL, 0); }
		public PortLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPortLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPortLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPortLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlowLevelContext extends StatisticsContext {
		public TerminalNode FLOW_LEVEL() { return getToken(ConstraintParser.FLOW_LEVEL, 0); }
		public FlowLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFlowLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFlowLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFlowLevel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchLevelContext extends StatisticsContext {
		public TerminalNode SWITCH_LEVEL() { return getToken(ConstraintParser.SWITCH_LEVEL, 0); }
		public SwitchLevelContext(StatisticsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterSwitchLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitSwitchLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitSwitchLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsContext statistics() throws RecognitionException {
		StatisticsContext _localctx = new StatisticsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_statistics);
		try {
			setState(386);
			switch (_input.LA(1)) {
			case FLOW_LEVEL:
				_localctx = new FlowLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383); match(FLOW_LEVEL);
				}
				break;
			case PORT_LEVEL:
				_localctx = new PortLevelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(384); match(PORT_LEVEL);
				}
				break;
			case SWITCH_LEVEL:
				_localctx = new SwitchLevelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(385); match(SWITCH_LEVEL);
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

	public static class Pkt_outContext extends ParserRuleContext {
		public Pkt_outContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkt_out; }
	 
		public Pkt_outContext() { }
		public void copyFrom(Pkt_outContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PktOutDenyContext extends Pkt_outContext {
		public TerminalNode FROM_PKT_IN() { return getToken(ConstraintParser.FROM_PKT_IN, 0); }
		public PktOutDenyContext(Pkt_outContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPktOutDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPktOutDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPktOutDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PktOutAllowContext extends Pkt_outContext {
		public TerminalNode ARBITRARY() { return getToken(ConstraintParser.ARBITRARY, 0); }
		public PktOutAllowContext(Pkt_outContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPktOutAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPktOutAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPktOutAllow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pkt_outContext pkt_out() throws RecognitionException {
		Pkt_outContext _localctx = new Pkt_outContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_pkt_out);
		try {
			setState(390);
			switch (_input.LA(1)) {
			case FROM_PKT_IN:
				_localctx = new PktOutDenyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388); match(FROM_PKT_IN);
				}
				break;
			case ARBITRARY:
				_localctx = new PktOutAllowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389); match(ARBITRARY);
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
		public TerminalNode STRING() { return getToken(ConstraintParser.STRING, 0); }
		public Perm_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perm_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPerm_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPerm_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPerm_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Perm_nameContext perm_name() throws RecognitionException {
		Perm_nameContext _localctx = new Perm_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_perm_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392); match(STRING);
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

	public static class SystemContext extends ParserRuleContext {
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
	 
		public SystemContext() { }
		public void copyFrom(SystemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NetworkDenyContext extends SystemContext {
		public TerminalNode DenyNetworkAccess() { return getToken(ConstraintParser.DenyNetworkAccess, 0); }
		public NetworkDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterNetworkDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitNetworkDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitNetworkDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileDenyContext extends SystemContext {
		public TerminalNode DenyFileSystem() { return getToken(ConstraintParser.DenyFileSystem, 0); }
		public FileDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFileDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFileDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFileDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NetworkAllowContext extends SystemContext {
		public TerminalNode AllowNetworkAccess() { return getToken(ConstraintParser.AllowNetworkAccess, 0); }
		public NetworkAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterNetworkAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitNetworkAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitNetworkAllow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FileAllowContext extends SystemContext {
		public TerminalNode AllowFileSystem() { return getToken(ConstraintParser.AllowFileSystem, 0); }
		public FileAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFileAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFileAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFileAllow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessDenyContext extends SystemContext {
		public TerminalNode DenyProcessRuntime() { return getToken(ConstraintParser.DenyProcessRuntime, 0); }
		public ProcessDenyContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterProcessDeny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitProcessDeny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitProcessDeny(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProcessAllowContext extends SystemContext {
		public TerminalNode AllowProcessRuntime() { return getToken(ConstraintParser.AllowProcessRuntime, 0); }
		public ProcessAllowContext(SystemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterProcessAllow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitProcessAllow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitProcessAllow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_system);
		try {
			setState(400);
			switch (_input.LA(1)) {
			case AllowNetworkAccess:
				_localctx = new NetworkAllowContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(394); match(AllowNetworkAccess);
				}
				break;
			case DenyNetworkAccess:
				_localctx = new NetworkDenyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395); match(DenyNetworkAccess);
				}
				break;
			case AllowFileSystem:
				_localctx = new FileAllowContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(396); match(AllowFileSystem);
				}
				break;
			case DenyFileSystem:
				_localctx = new FileDenyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(397); match(DenyFileSystem);
				}
				break;
			case AllowProcessRuntime:
				_localctx = new ProcessAllowContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(398); match(AllowProcessRuntime);
				}
				break;
			case DenyProcessRuntime:
				_localctx = new ProcessDenyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(399); match(DenyProcessRuntime);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return perm_expr_sempred((Perm_exprContext)_localctx, predIndex);

		case 8: return assert_expr_sempred((Assert_exprContext)_localctx, predIndex);

		case 14: return filter_expr_sempred((Filter_exprContext)_localctx, predIndex);

		case 15: return filter_term_sempred((Filter_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean filter_expr_sempred(Filter_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean perm_expr_sempred(Perm_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean filter_term_sempred(Filter_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean assert_expr_sempred(Assert_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 3 >= _localctx._p;

		case 2: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3F\u0195\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16"+
		"\2e\13\2\3\3\3\3\5\3i\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4}\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\b\3\b\3\b\3\b\5\b\u0092\n"+
		"\b\3\t\3\t\3\t\3\t\5\t\u0098\n\t\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00ba\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c3\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00cb\n\20\f\20\16\20\u00ce\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00d6\n\21\f\21\16\21\u00d9\13\21\3\22\3\22\3\22\5\22\u00de"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00ef\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0100\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u0106\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\5\32\u0112\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0120\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0127\n\35\3\36\3"+
		"\36\3\37\3\37\3\37\5\37\u012e\n\37\3 \3 \3 \3 \3 \5 \u0135\n \3!\3!\3"+
		"!\3!\3!\5!\u013c\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0143\n\"\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0153\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5"+
		"&\u015f\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0167\n\'\3(\3(\3(\3(\3(\5(\u016e"+
		"\n(\3)\3)\3)\5)\u0173\n)\3*\3*\3*\3+\3+\3+\3+\5+\u017c\n+\3,\3,\5,\u0180"+
		"\n,\3-\3-\3-\5-\u0185\n-\3.\3.\5.\u0189\n.\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u0193\n\60\3\60\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\4\5\4\4\n\13\r\16\3 $"+
		"\u019c\2c\3\2\2\2\4h\3\2\2\2\6|\3\2\2\2\b~\3\2\2\2\n\u0080\3\2\2\2\f\u0082"+
		"\3\2\2\2\16\u0091\3\2\2\2\20\u0097\3\2\2\2\22\u009d\3\2\2\2\24\u00aa\3"+
		"\2\2\2\26\u00ae\3\2\2\2\30\u00b0\3\2\2\2\32\u00b9\3\2\2\2\34\u00c2\3\2"+
		"\2\2\36\u00c4\3\2\2\2 \u00cf\3\2\2\2\"\u00dd\3\2\2\2$\u00ee\3\2\2\2&\u00f6"+
		"\3\2\2\2(\u00f8\3\2\2\2*\u00ff\3\2\2\2,\u0105\3\2\2\2.\u0107\3\2\2\2\60"+
		"\u010d\3\2\2\2\62\u0111\3\2\2\2\64\u0113\3\2\2\2\66\u011f\3\2\2\28\u0126"+
		"\3\2\2\2:\u0128\3\2\2\2<\u012d\3\2\2\2>\u0134\3\2\2\2@\u013b\3\2\2\2B"+
		"\u0142\3\2\2\2D\u0144\3\2\2\2F\u0146\3\2\2\2H\u0152\3\2\2\2J\u015e\3\2"+
		"\2\2L\u0166\3\2\2\2N\u016d\3\2\2\2P\u0172\3\2\2\2R\u0174\3\2\2\2T\u017b"+
		"\3\2\2\2V\u017f\3\2\2\2X\u0184\3\2\2\2Z\u0188\3\2\2\2\\\u018a\3\2\2\2"+
		"^\u0192\3\2\2\2`b\5\4\3\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\3\3"+
		"\2\2\2ec\3\2\2\2fi\5\6\4\2gi\5\16\b\2hf\3\2\2\2hg\3\2\2\2i\5\3\2\2\2j"+
		"k\7\17\2\2kl\5\b\5\2lm\7\13\2\2mn\7\3\2\2no\5\32\16\2op\7\f\2\2p}\3\2"+
		"\2\2qr\7\17\2\2rs\5\b\5\2st\7\13\2\2tu\7\20\2\2uv\5\n\6\2v}\3\2\2\2wx"+
		"\7\17\2\2xy\5\b\5\2yz\7\13\2\2z{\5\f\7\2{}\3\2\2\2|j\3\2\2\2|q\3\2\2\2"+
		"|w\3\2\2\2}\7\3\2\2\2~\177\7E\2\2\177\t\3\2\2\2\u0080\u0081\7E\2\2\u0081"+
		"\13\3\2\2\2\u0082\u0083\b\7\1\2\u0083\u0084\5\b\5\2\u0084\u008a\3\2\2"+
		"\2\u0085\u0086\6\7\2\3\u0086\u0087\7\21\2\2\u0087\u0089\5\b\5\2\u0088"+
		"\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\r\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0092\5\20\t\2\u008e\u008f"+
		"\5\20\t\2\u008f\u0090\5\16\b\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2"+
		"\u0091\u008e\3\2\2\2\u0092\17\3\2\2\2\u0093\u0094\7\22\2\2\u0094\u0098"+
		"\5\22\n\2\u0095\u0096\7\22\2\2\u0096\u0098\5\30\r\2\u0097\u0093\3\2\2"+
		"\2\u0097\u0095\3\2\2\2\u0098\21\3\2\2\2\u0099\u009a\b\n\1\2\u009a\u009b"+
		"\79\2\2\u009b\u009e\5\22\n\2\u009c\u009e\5\24\13\2\u009d\u0099\3\2\2\2"+
		"\u009d\u009c\3\2\2\2\u009e\u00a7\3\2\2\2\u009f\u00a0\6\n\3\3\u00a0\u00a1"+
		"\78\2\2\u00a1\u00a6\5\24\13\2\u00a2\u00a3\6\n\4\3\u00a3\u00a4\7\67\2\2"+
		"\u00a4\u00a6\5\24\13\2\u00a5\u009f\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\u00a9"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad\5"+
		"\f\7\2\u00ad\25\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\27\3\2\2\2\u00b0\u00b1"+
		"\7\23\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b3\78\2\2\u00b3\u00b4\5\f\7\2\u00b4"+
		"\31\3\2\2\2\u00b5\u00ba\5\34\17\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\5"+
		"\32\16\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba"+
		"\33\3\2\2\2\u00bb\u00bc\7\24\2\2\u00bc\u00c3\5\\/\2\u00bd\u00be\7\24\2"+
		"\2\u00be\u00bf\5\\/\2\u00bf\u00c0\7\25\2\2\u00c0\u00c1\5\36\20\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\35\3\2\2"+
		"\2\u00c4\u00c5\b\20\1\2\u00c5\u00c6\5 \21\2\u00c6\u00cc\3\2\2\2\u00c7"+
		"\u00c8\6\20\5\3\u00c8\u00c9\7\67\2\2\u00c9\u00cb\5 \21\2\u00ca\u00c7\3"+
		"\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\37\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\b\21\1\2\u00d0\u00d1\5\"\22"+
		"\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\6\21\6\3\u00d3\u00d4\78\2\2\u00d4\u00d6"+
		"\5\"\22\2\u00d5\u00d2\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\5"+
		"$\23\2\u00db\u00dc\79\2\2\u00dc\u00de\5\"\22\2\u00dd\u00da\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de#\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\5\36\20"+
		"\2\u00e1\u00e2\7\5\2\2\u00e2\u00ef\3\2\2\2\u00e3\u00ef\5&\24\2\u00e4\u00ef"+
		"\5\62\32\2\u00e5\u00e6\7\26\2\2\u00e6\u00ef\5L\'\2\u00e7\u00ef\5P)\2\u00e8"+
		"\u00ef\5R*\2\u00e9\u00ef\5T+\2\u00ea\u00ef\5V,\2\u00eb\u00ef\5X-\2\u00ec"+
		"\u00ef\5Z.\2\u00ed\u00ef\5^\60\2\u00ee\u00df\3\2\2\2\u00ee\u00e3\3\2\2"+
		"\2\u00ee\u00e4\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00e8"+
		"\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef%\3\2\2\2\u00f0\u00f7\5.\30\2"+
		"\u00f1\u00f2\5(\25\2\u00f2\u00f3\7\3\2\2\u00f3\u00f4\5*\26\2\u00f4\u00f5"+
		"\7\f\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7"+
		"\'\3\2\2\2\u00f8\u00f9\t\3\2\2\u00f9)\3\2\2\2\u00fa\u0100\5,\27\2\u00fb"+
		"\u00fc\5,\27\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\5*\26\2\u00fe\u0100\3\2"+
		"\2\2\u00ff\u00fa\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100+\3\2\2\2\u0101\u0106"+
		"\7%\2\2\u0102\u0103\7%\2\2\u0103\u0104\7\7\2\2\u0104\u0106\7%\2\2\u0105"+
		"\u0101\3\2\2\2\u0105\u0102\3\2\2\2\u0106-\3\2\2\2\u0107\u0108\7\'\2\2"+
		"\u0108\u0109\5\60\31\2\u0109\u010a\7(\2\2\u010a\u010b\7)\2\2\u010b\u010c"+
		"\5\60\31\2\u010c/\3\2\2\2\u010d\u010e\7*\2\2\u010e\61\3\2\2\2\u010f\u0112"+
		"\5\64\33\2\u0110\u0112\5F$\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\63\3\2\2\2\u0113\u0114\7+\2\2\u0114\u0115\5\66\34\2\u0115\u0116\7\67"+
		"\2\2\u0116\u0117\7,\2\2\u0117\u0118\5<\37\2\u0118\65\3\2\2\2\u0119\u0120"+
		"\7-\2\2\u011a\u0120\7.\2\2\u011b\u011c\7\3\2\2\u011c\u011d\58\35\2\u011d"+
		"\u011e\7\f\2\2\u011e\u0120\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2"+
		"\2\2\u011f\u011b\3\2\2\2\u0120\67\3\2\2\2\u0121\u0127\5:\36\2\u0122\u0123"+
		"\5:\36\2\u0123\u0124\7\6\2\2\u0124\u0125\58\35\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u01279\3\2\2\2\u0128\u0129\7%\2\2\u0129"+
		";\3\2\2\2\u012a\u012e\7/\2\2\u012b\u012e\7\60\2\2\u012c\u012e\5> \2\u012d"+
		"\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e=\3\2\2\2"+
		"\u012f\u0135\5@!\2\u0130\u0131\5@!\2\u0131\u0132\7\6\2\2\u0132\u0133\5"+
		"> \2\u0133\u0135\3\2\2\2\u0134\u012f\3\2\2\2\u0134\u0130\3\2\2\2\u0135"+
		"?\3\2\2\2\u0136\u013c\5D#\2\u0137\u0138\7\b\2\2\u0138\u0139\5B\"\2\u0139"+
		"\u013a\7\5\2\2\u013a\u013c\3\2\2\2\u013b\u0136\3\2\2\2\u013b\u0137\3\2"+
		"\2\2\u013cA\3\2\2\2\u013d\u0143\5D#\2\u013e\u013f\5D#\2\u013f\u0140\7"+
		"\t\2\2\u0140\u0141\5B\"\2\u0141\u0143\3\2\2\2\u0142\u013d\3\2\2\2\u0142"+
		"\u013e\3\2\2\2\u0143C\3\2\2\2\u0144\u0145\7%\2\2\u0145E\3\2\2\2\u0146"+
		"\u0147\7\61\2\2\u0147\u0148\7+\2\2\u0148\u0149\5H%\2\u0149\u014a\7\67"+
		"\2\2\u014a\u014b\7,\2\2\u014b\u014c\5<\37\2\u014cG\3\2\2\2\u014d\u0153"+
		"\7\62\2\2\u014e\u014f\7\3\2\2\u014f\u0150\5J&\2\u0150\u0151\7\f\2\2\u0151"+
		"\u0153\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0153I\3\2\2\2"+
		"\u0154\u0155\5\66\34\2\u0155\u0156\7:\2\2\u0156\u0157\5:\36\2\u0157\u015f"+
		"\3\2\2\2\u0158\u0159\5\66\34\2\u0159\u015a\7:\2\2\u015a\u015b\5:\36\2"+
		"\u015b\u015c\7\6\2\2\u015c\u015d\5J&\2\u015d\u015f\3\2\2\2\u015e\u0154"+
		"\3\2\2\2\u015e\u0158\3\2\2\2\u015fK\3\2\2\2\u0160\u0167\7\63\2\2\u0161"+
		"\u0167\7\64\2\2\u0162\u0167\7\65\2\2\u0163\u0164\7\65\2\2\u0164\u0165"+
		"\7\66\2\2\u0165\u0167\5N(\2\u0166\u0160\3\2\2\2\u0166\u0161\3\2\2\2\u0166"+
		"\u0162\3\2\2\2\u0166\u0163\3\2\2\2\u0167M\3\2\2\2\u0168\u016e\5(\25\2"+
		"\u0169\u016a\5(\25\2\u016a\u016b\7\6\2\2\u016b\u016c\5N(\2\u016c\u016e"+
		"\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u0169\3\2\2\2\u016eO\3\2\2\2\u016f"+
		"\u0173\7\27\2\2\u0170\u0173\7\30\2\2\u0171\u0173\7\31\2\2\u0172\u016f"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173Q\3\2\2\2\u0174"+
		"\u0175\7\32\2\2\u0175\u0176\7%\2\2\u0176S\3\2\2\2\u0177\u0178\7;\2\2\u0178"+
		"\u017c\7%\2\2\u0179\u017a\7<\2\2\u017a\u017c\7&\2\2\u017b\u0177\3\2\2"+
		"\2\u017b\u0179\3\2\2\2\u017cU\3\2\2\2\u017d\u0180\7\33\2\2\u017e\u0180"+
		"\7\34\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180W\3\2\2\2\u0181"+
		"\u0185\7\35\2\2\u0182\u0185\7\36\2\2\u0183\u0185\7\37\2\2\u0184\u0181"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185Y\3\2\2\2\u0186"+
		"\u0189\7=\2\2\u0187\u0189\7>\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2"+
		"\2\u0189[\3\2\2\2\u018a\u018b\7E\2\2\u018b]\3\2\2\2\u018c\u0193\7?\2\2"+
		"\u018d\u0193\7@\2\2\u018e\u0193\7A\2\2\u018f\u0193\7B\2\2\u0190\u0193"+
		"\7C\2\2\u0191\u0193\7D\2\2\u0192\u018c\3\2\2\2\u0192\u018d\3\2\2\2\u0192"+
		"\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2"+
		"\2\2\u0193_\3\2\2\2%ch|\u008a\u0091\u0097\u009d\u00a5\u00a7\u00b9\u00c2"+
		"\u00cc\u00d7\u00dd\u00ee\u00f6\u00ff\u0105\u0111\u011f\u0126\u012d\u0134"+
		"\u013b\u0142\u0152\u015e\u0166\u016d\u0172\u017b\u017f\u0184\u0188\u0192";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}