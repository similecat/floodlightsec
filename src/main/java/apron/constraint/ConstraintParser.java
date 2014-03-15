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
		MAX_PRIORITY=24, MIN_PRIORITY=25, EVENT_INTERCEPTION=26, MODIFY_EVENT_ORDER=27, 
		FLOW_LEVEL=28, PORT_LEVEL=29, SWITCH_LEVEL=30, IP_SRC=31, IP_DST=32, TCP_SRC=33, 
		TCP_DST=34, VLAN_ID=35, WILDCARD=36, INT=37, FLOAT=38, IP=39, WITH=40, 
		MASK=41, IP_FORMAT=42, SWITCH=43, LINK=44, ALL_SWITCHES=45, BORDER_SWITCHES=46, 
		ALL_DIRECT_LINKS=47, ALL_PATHS_AS_LINKS=48, VIRTUAL=49, SINGLE_BIG_SWITCH=50, 
		DROP=51, FORWARD=52, MODIFY=53, FIELD=54, AND=55, OR=56, NOT=57, AS=58, 
		RULE_COUNT_PER_SWITCH=59, SIZE_PERCENTAGE_PER_SWITCH=60, FROM_PKT_IN=61, 
		ARBITRARY=62, AllowNetworkAccess=63, DenyNetworkAccess=64, AllowFileSystem=65, 
		DenyFileSystem=66, AllowProcessRuntime=67, DenyProcessRuntime=68, STRING=69, 
		WS=70;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'>'", "')'", "','", "'('", "':'", "'<'", "'='", "'}'", 
		"'>='", "';'", "'<='", "'LET'", "'APP'", "'UNION'", "'ASSERT'", "'EITHER'", 
		"'PERM'", "'LIMITING'", "'ACTION'", "'OWN_FLOWS'", "'OTHERS_FLOWS'", "'ALL_FLOWS'", 
		"'MAX_PRIORITY'", "'MIN_PRIORITY'", "'EVENT_INTERCEPTION'", "'MODIFY_EVENT_ORDER'", 
		"'FLOW_LEVEL'", "'PORT_LEVEL'", "'SWITCH_LEVEL'", "'IP_SRC'", "'IP_DST'", 
		"'TCP_SRC'", "'TCP_DST'", "'VLAN_ID'", "'WILDCARD'", "INT", "FLOAT", "'IP'", 
		"'WITH'", "'MASK'", "IP_FORMAT", "'SWITCH'", "'LINK'", "'ALL_SWITCHES'", 
		"'BORDER_SWITCHES'", "'ALL_DIRECT_LINKS'", "'ALL_PATHS_AS_LINKS'", "'VIRTUAL'", 
		"'SINGLE_BIG_SWITCH'", "'DROP'", "'FORWARD'", "'MODIFY'", "'FIELD'", "'AND'", 
		"'OR'", "'NOT'", "'AS'", "'RULE_COUNT_PER_SWITCH'", "'SIZE_PERCENTAGE_PER_SWITCH'", 
		"'FROM_PKT_IN'", "'ARBITRARY'", "'AllowNetworkAccess'", "'DenyNetworkAccess'", 
		"'AllowFileSystem'", "'DenyFileSystem'", "'AllowProcessRuntime'", "'DenyProcessRuntime'", 
		"STRING", "WS"
	};
	public static final int
		RULE_program = 0, RULE_stat = 1, RULE_binding = 2, RULE_var_perm = 3, 
		RULE_app_name = 4, RULE_perm_expr = 5, RULE_assert_list = 6, RULE_assert_stmt = 7, 
		RULE_assert_expr = 8, RULE_boolean_expr = 9, RULE_cmp_operator = 10, RULE_exclusive = 11, 
		RULE_perm_list = 12, RULE_perm = 13, RULE_filter_expr = 14, RULE_filter_term = 15, 
		RULE_filter_factor = 16, RULE_filter_not_factor = 17, RULE_flow_predicate = 18, 
		RULE_field = 19, RULE_val = 20, RULE_topo = 21, RULE_physical_topo = 22, 
		RULE_switch_set = 23, RULE_sw_idx_list = 24, RULE_sw_idx = 25, RULE_link_set = 26, 
		RULE_link_list = 27, RULE_link = 28, RULE_path = 29, RULE_link_idx = 30, 
		RULE_virtual_topo = 31, RULE_switch_mapping = 32, RULE_virtual_switch_set = 33, 
		RULE_action = 34, RULE_field_list = 35, RULE_ownership = 36, RULE_max_priority = 37, 
		RULE_flow_table = 38, RULE_notification = 39, RULE_statistics = 40, RULE_pkt_out = 41, 
		RULE_perm_name = 42, RULE_system = 43;
	public static final String[] ruleNames = {
		"program", "stat", "binding", "var_perm", "app_name", "perm_expr", "assert_list", 
		"assert_stmt", "assert_expr", "boolean_expr", "cmp_operator", "exclusive", 
		"perm_list", "perm", "filter_expr", "filter_term", "filter_factor", "filter_not_factor", 
		"flow_predicate", "field", "val", "topo", "physical_topo", "switch_set", 
		"sw_idx_list", "sw_idx", "link_set", "link_list", "link", "path", "link_idx", 
		"virtual_topo", "switch_mapping", "virtual_switch_set", "action", "field_list", 
		"ownership", "max_priority", "flow_table", "notification", "statistics", 
		"pkt_out", "perm_name", "system"
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET || _la==ASSERT) {
				{
				{
				setState(88); stat();
				}
				}
				setState(93);
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
			setState(96);
			switch (_input.LA(1)) {
			case LET:
				_localctx = new BindContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(94); binding();
				}
				break;
			case ASSERT:
				_localctx = new AssertListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95); assert_list();
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
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BindListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98); match(LET);
				setState(99); var_perm();
				setState(100); match(8);
				setState(101); match(1);
				setState(102); perm_list();
				setState(103); match(9);
				}
				break;

			case 2:
				_localctx = new BindAppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(LET);
				setState(106); var_perm();
				setState(107); match(8);
				setState(108); match(APP);
				setState(109); app_name();
				}
				break;

			case 3:
				_localctx = new BindExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111); match(LET);
				setState(112); var_perm();
				setState(113); match(8);
				setState(114); perm_expr(0);
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
			setState(118); match(STRING);
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

			setState(123); var_perm();
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
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
					setState(125);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(126); match(UNION);
					setState(127); var_perm();
					}
					} 
				}
				setState(132);
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
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssertStmtSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133); assert_stmt();
				}
				break;

			case 2:
				_localctx = new AssertStmtMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134); assert_stmt();
				setState(135); assert_list();
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
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssertExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(ASSERT);
				setState(140); assert_expr(0);
				}
				break;

			case 2:
				_localctx = new AssertExclusiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(ASSERT);
				setState(142); exclusive();
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
			setState(149);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new AssertNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146); match(NOT);
				setState(147); assert_expr(4);
				}
				break;
			case STRING:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148); boolean_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(157);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AssertOrContext(new Assert_exprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_assert_expr);
						setState(151);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(152); match(OR);
						setState(153); boolean_expr();
						}
						break;

					case 2:
						{
						_localctx = new AssertAndContext(new Assert_exprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_assert_expr);
						setState(154);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(155); match(AND);
						setState(156); boolean_expr();
						}
						break;
					}
					} 
				}
				setState(161);
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
			setState(162); perm_expr(0);
			setState(163); cmp_operator();
			setState(164); perm_expr(0);
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
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 8) | (1L << 10) | (1L << 12))) != 0)) ) {
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
			setState(168); match(EITHER);
			setState(169); perm_expr(0);
			setState(170); match(OR);
			setState(171); perm_expr(0);
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
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PermListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173); perm();
				}
				break;

			case 2:
				_localctx = new PermListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174); perm();
				setState(175); perm_list();
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
			setState(186);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PermSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(PERM);
				setState(180); perm_name();
				}
				break;

			case 2:
				_localctx = new PermMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181); match(PERM);
				setState(182); perm_name();
				setState(183); match(LIMITING);
				setState(184); filter_expr(0);
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

			setState(189); filter_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
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
					setState(191);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(192); match(AND);
					setState(193); filter_term(0);
					}
					} 
				}
				setState(198);
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

			setState(200); filter_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
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
					setState(202);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(203); match(OR);
					setState(204); filter_factor();
					}
					} 
				}
				setState(209);
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
			setState(213);
			switch (_input.LA(1)) {
			case 5:
			case ACTION:
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
			case MAX_PRIORITY:
			case MIN_PRIORITY:
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
			case WILDCARD:
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
				setState(210); filter_not_factor();
				}
				break;
			case NOT:
				_localctx = new FilterFactorNotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211); match(NOT);
				setState(212); filter_factor();
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
			setState(230);
			switch (_input.LA(1)) {
			case 5:
				_localctx = new FilterExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(5);
				setState(216); filter_expr(0);
				setState(217); match(3);
				}
				break;
			case IP_SRC:
			case IP_DST:
			case TCP_SRC:
			case TCP_DST:
			case VLAN_ID:
			case WILDCARD:
				_localctx = new FlowPredicateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219); flow_predicate();
				}
				break;
			case SWITCH:
			case VIRTUAL:
				_localctx = new TopologyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220); topo();
				}
				break;
			case ACTION:
				_localctx = new ActionsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221); match(ACTION);
				setState(222); action();
				}
				break;
			case OWN_FLOWS:
			case OTHERS_FLOWS:
			case ALL_FLOWS:
				_localctx = new OwnershipSContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(223); ownership();
				}
				break;
			case MAX_PRIORITY:
			case MIN_PRIORITY:
				_localctx = new MaxPriorityContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(224); max_priority();
				}
				break;
			case RULE_COUNT_PER_SWITCH:
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(225); flow_table();
				}
				break;
			case EVENT_INTERCEPTION:
			case MODIFY_EVENT_ORDER:
				_localctx = new NotificationSContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(226); notification();
				}
				break;
			case FLOW_LEVEL:
			case PORT_LEVEL:
			case SWITCH_LEVEL:
				_localctx = new StatisticsSContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(227); statistics();
				}
				break;
			case FROM_PKT_IN:
			case ARBITRARY:
				_localctx = new PktOutContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(228); pkt_out();
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
				setState(229); system();
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
	public static class FieldMaskContext extends Flow_predicateContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode MASK() { return getToken(ConstraintParser.MASK, 0); }
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public FieldMaskContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFieldMask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFieldMask(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFieldMask(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WildcardContext extends Flow_predicateContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(ConstraintParser.WILDCARD, 0); }
		public WildcardContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldValContext extends Flow_predicateContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldValContext(Flow_predicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterFieldVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitFieldVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitFieldVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_predicateContext flow_predicate() throws RecognitionException {
		Flow_predicateContext _localctx = new Flow_predicateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_flow_predicate);
		try {
			setState(244);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new FieldValContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232); field();
				setState(233); val();
				}
				break;

			case 2:
				_localctx = new FieldMaskContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(235); field();
				setState(236); val();
				setState(237); match(MASK);
				setState(238); val();
				}
				break;

			case 3:
				_localctx = new WildcardContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240); match(WILDCARD);
				setState(241); field();
				setState(242); val();
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValIntContext extends ValContext {
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public ValIntContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIpContext extends ValContext {
		public TerminalNode IP_FORMAT() { return getToken(ConstraintParser.IP_FORMAT, 0); }
		public ValIpContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterValIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitValIp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitValIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_val);
		try {
			setState(250);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248); match(INT);
				}
				break;
			case IP_FORMAT:
				_localctx = new ValIpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249); match(IP_FORMAT);
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
		enterRule(_localctx, 42, RULE_topo);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case SWITCH:
				_localctx = new PhysicalTopoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252); physical_topo();
				}
				break;
			case VIRTUAL:
				_localctx = new VirtualTopoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253); virtual_topo();
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
		enterRule(_localctx, 44, RULE_physical_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(SWITCH);
			setState(257); switch_set();
			setState(258); match(AND);
			setState(259); match(LINK);
			setState(260); link_set();
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
		enterRule(_localctx, 46, RULE_switch_set);
		try {
			setState(268);
			switch (_input.LA(1)) {
			case ALL_SWITCHES:
				_localctx = new AllSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262); match(ALL_SWITCHES);
				}
				break;
			case BORDER_SWITCHES:
				_localctx = new BorderSwitchesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263); match(BORDER_SWITCHES);
				}
				break;
			case 1:
				_localctx = new SwIdxListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264); match(1);
				setState(265); sw_idx_list();
				setState(266); match(9);
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
		enterRule(_localctx, 48, RULE_sw_idx_list);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new SwIdxListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270); sw_idx();
				}
				break;

			case 2:
				_localctx = new SwIdxListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271); sw_idx();
				setState(272); match(4);
				setState(273); sw_idx_list();
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
		enterRule(_localctx, 50, RULE_sw_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); match(INT);
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
		enterRule(_localctx, 52, RULE_link_set);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case ALL_DIRECT_LINKS:
				_localctx = new AllDriectLinksContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(ALL_DIRECT_LINKS);
				}
				break;
			case ALL_PATHS_AS_LINKS:
				_localctx = new AllPathsAsLinksContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(280); match(ALL_PATHS_AS_LINKS);
				}
				break;
			case 5:
			case INT:
				_localctx = new LinkListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(281); link_list();
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
		enterRule(_localctx, 54, RULE_link_list);
		try {
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new LinkListSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284); link();
				}
				break;

			case 2:
				_localctx = new LinkListMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285); link();
				setState(286); match(4);
				setState(287); link_list();
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
		public List<Link_idxContext> link_idx() {
			return getRuleContexts(Link_idxContext.class);
		}
		public Link_idxContext link_idx(int i) {
			return getRuleContext(Link_idxContext.class,i);
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
		enterRule(_localctx, 56, RULE_link);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new LinkSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291); link_idx();
				setState(292); match(6);
				setState(293); link_idx();
				setState(294); match(11);
				}
				break;
			case 5:
				_localctx = new LinkMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296); match(5);
				setState(297); path();
				setState(298); match(3);
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
		enterRule(_localctx, 58, RULE_path);
		try {
			setState(307);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new PathSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302); link_idx();
				}
				break;

			case 2:
				_localctx = new PathMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303); link_idx();
				setState(304); match(6);
				setState(305); path();
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
		public Sw_idxContext sw_idx() {
			return getRuleContext(Sw_idxContext.class,0);
		}
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
		enterRule(_localctx, 60, RULE_link_idx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); sw_idx();
			setState(310); match(4);
			setState(311); match(INT);
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
		enterRule(_localctx, 62, RULE_virtual_topo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(VIRTUAL);
			setState(314); match(SWITCH);
			setState(315); switch_mapping();
			setState(316); match(AND);
			setState(317); match(LINK);
			setState(318); link_set();
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
		enterRule(_localctx, 64, RULE_switch_mapping);
		try {
			setState(325);
			switch (_input.LA(1)) {
			case SINGLE_BIG_SWITCH:
				_localctx = new SingleBigSwitchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320); match(SINGLE_BIG_SWITCH);
				}
				break;
			case 1:
				_localctx = new VirtualSwitchSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321); match(1);
				setState(322); virtual_switch_set();
				setState(323); match(9);
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
		enterRule(_localctx, 66, RULE_virtual_switch_set);
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new VirtualSwitchSetSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(327); switch_set();
				setState(328); match(AS);
				setState(329); sw_idx();
				}
				break;

			case 2:
				_localctx = new VirtualSwitchSetMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331); switch_set();
				setState(332); match(AS);
				setState(333); sw_idx();
				setState(334); match(4);
				setState(335); virtual_switch_set();
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
		enterRule(_localctx, 68, RULE_action);
		try {
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new DropContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(339); match(DROP);
				}
				break;

			case 2:
				_localctx = new ForwardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340); match(FORWARD);
				}
				break;

			case 3:
				_localctx = new ModifyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(341); match(MODIFY);
				}
				break;

			case 4:
				_localctx = new ModifyFieldContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(342); match(MODIFY);
				setState(343); match(FIELD);
				setState(344); field_list();
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
		enterRule(_localctx, 70, RULE_field_list);
		try {
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new FieldSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(347); field();
				}
				break;

			case 2:
				_localctx = new FieldMContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(348); field();
				setState(349); match(4);
				setState(350); field_list();
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
		enterRule(_localctx, 72, RULE_ownership);
		try {
			setState(357);
			switch (_input.LA(1)) {
			case OWN_FLOWS:
				_localctx = new OwnFlowsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354); match(OWN_FLOWS);
				}
				break;
			case OTHERS_FLOWS:
				_localctx = new OthersFlowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355); match(OTHERS_FLOWS);
				}
				break;
			case ALL_FLOWS:
				_localctx = new AllFlowsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356); match(ALL_FLOWS);
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
		public Max_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_priority; }
	 
		public Max_priorityContext() { }
		public void copyFrom(Max_priorityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PriorityMaxContext extends Max_priorityContext {
		public TerminalNode MAX_PRIORITY() { return getToken(ConstraintParser.MAX_PRIORITY, 0); }
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public PriorityMaxContext(Max_priorityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPriorityMax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPriorityMax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPriorityMax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorityMinContext extends Max_priorityContext {
		public TerminalNode INT() { return getToken(ConstraintParser.INT, 0); }
		public TerminalNode MIN_PRIORITY() { return getToken(ConstraintParser.MIN_PRIORITY, 0); }
		public PriorityMinContext(Max_priorityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).enterPriorityMin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ConstraintListener ) ((ConstraintListener)listener).exitPriorityMin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConstraintVisitor ) return ((ConstraintVisitor<? extends T>)visitor).visitPriorityMin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_priorityContext max_priority() throws RecognitionException {
		Max_priorityContext _localctx = new Max_priorityContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_max_priority);
		try {
			setState(363);
			switch (_input.LA(1)) {
			case MAX_PRIORITY:
				_localctx = new PriorityMaxContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359); match(MAX_PRIORITY);
				setState(360); match(INT);
				}
				break;
			case MIN_PRIORITY:
				_localctx = new PriorityMinContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(361); match(MIN_PRIORITY);
				setState(362); match(INT);
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
		enterRule(_localctx, 76, RULE_flow_table);
		try {
			setState(369);
			switch (_input.LA(1)) {
			case RULE_COUNT_PER_SWITCH:
				_localctx = new FlowTableAContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365); match(RULE_COUNT_PER_SWITCH);
				setState(366); match(INT);
				}
				break;
			case SIZE_PERCENTAGE_PER_SWITCH:
				_localctx = new FlowTableBContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(367); match(SIZE_PERCENTAGE_PER_SWITCH);
				setState(368); match(FLOAT);
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
		enterRule(_localctx, 78, RULE_notification);
		try {
			setState(373);
			switch (_input.LA(1)) {
			case EVENT_INTERCEPTION:
				_localctx = new EventInterceptionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(371); match(EVENT_INTERCEPTION);
				}
				break;
			case MODIFY_EVENT_ORDER:
				_localctx = new ModifyEventOrderContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(372); match(MODIFY_EVENT_ORDER);
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
		enterRule(_localctx, 80, RULE_statistics);
		try {
			setState(378);
			switch (_input.LA(1)) {
			case FLOW_LEVEL:
				_localctx = new FlowLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375); match(FLOW_LEVEL);
				}
				break;
			case PORT_LEVEL:
				_localctx = new PortLevelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(376); match(PORT_LEVEL);
				}
				break;
			case SWITCH_LEVEL:
				_localctx = new SwitchLevelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(377); match(SWITCH_LEVEL);
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
		enterRule(_localctx, 82, RULE_pkt_out);
		try {
			setState(382);
			switch (_input.LA(1)) {
			case FROM_PKT_IN:
				_localctx = new PktOutDenyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380); match(FROM_PKT_IN);
				}
				break;
			case ARBITRARY:
				_localctx = new PktOutAllowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(381); match(ARBITRARY);
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
		enterRule(_localctx, 84, RULE_perm_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384); match(STRING);
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
		enterRule(_localctx, 86, RULE_system);
		try {
			setState(392);
			switch (_input.LA(1)) {
			case AllowNetworkAccess:
				_localctx = new NetworkAllowContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386); match(AllowNetworkAccess);
				}
				break;
			case DenyNetworkAccess:
				_localctx = new NetworkDenyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387); match(DenyNetworkAccess);
				}
				break;
			case AllowFileSystem:
				_localctx = new FileAllowContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(388); match(AllowFileSystem);
				}
				break;
			case DenyFileSystem:
				_localctx = new FileDenyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(389); match(DenyFileSystem);
				}
				break;
			case AllowProcessRuntime:
				_localctx = new ProcessAllowContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(390); match(AllowProcessRuntime);
				}
				break;
			case DenyProcessRuntime:
				_localctx = new ProcessDenyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(391); match(DenyProcessRuntime);
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
		"\2\3H\u018d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\3\2\7\2\\\n\2\f\2\16\2_\13\2\3\3\3\3\5\3"+
		"c\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4w\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0083\n"+
		"\7\f\7\16\7\u0086\13\7\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\t\5"+
		"\t\u0092\n\t\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00a0\n\n\f\n\16\n\u00a3\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00b4\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c5\n"+
		"\20\f\20\16\20\u00c8\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00d0\n"+
		"\21\f\21\16\21\u00d3\13\21\3\22\3\22\3\22\5\22\u00d8\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e9"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00f7\n\24\3\25\3\25\3\26\3\26\5\26\u00fd\n\26\3\27\3\27\5\27\u0101\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u010f"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u0116\n\32\3\33\3\33\3\34\3\34\3\34"+
		"\5\34\u011d\n\34\3\35\3\35\3\35\3\35\3\35\5\35\u0124\n\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u012f\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0136\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\5\"\u0148\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0154\n#\3$\3$\3$"+
		"\3$\3$\3$\5$\u015c\n$\3%\3%\3%\3%\3%\5%\u0163\n%\3&\3&\3&\5&\u0168\n&"+
		"\3\'\3\'\3\'\3\'\5\'\u016e\n\'\3(\3(\3(\3(\5(\u0174\n(\3)\3)\5)\u0178"+
		"\n)\3*\3*\3*\5*\u017d\n*\3+\3+\5+\u0181\n+\3,\3,\3-\3-\3-\3-\3-\3-\5-"+
		"\u018b\n-\3-\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVX\2\4\6\4\4\t\n\f\f\16\16\3!%\u0198\2]\3\2\2\2\4"+
		"b\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\nz\3\2\2\2\f|\3\2\2\2\16\u008b\3\2\2\2"+
		"\20\u0091\3\2\2\2\22\u0097\3\2\2\2\24\u00a4\3\2\2\2\26\u00a8\3\2\2\2\30"+
		"\u00aa\3\2\2\2\32\u00b3\3\2\2\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00c9"+
		"\3\2\2\2\"\u00d7\3\2\2\2$\u00e8\3\2\2\2&\u00f6\3\2\2\2(\u00f8\3\2\2\2"+
		"*\u00fc\3\2\2\2,\u0100\3\2\2\2.\u0102\3\2\2\2\60\u010e\3\2\2\2\62\u0115"+
		"\3\2\2\2\64\u0117\3\2\2\2\66\u011c\3\2\2\28\u0123\3\2\2\2:\u012e\3\2\2"+
		"\2<\u0135\3\2\2\2>\u0137\3\2\2\2@\u013b\3\2\2\2B\u0147\3\2\2\2D\u0153"+
		"\3\2\2\2F\u015b\3\2\2\2H\u0162\3\2\2\2J\u0167\3\2\2\2L\u016d\3\2\2\2N"+
		"\u0173\3\2\2\2P\u0177\3\2\2\2R\u017c\3\2\2\2T\u0180\3\2\2\2V\u0182\3\2"+
		"\2\2X\u018a\3\2\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2"+
		"\2^\3\3\2\2\2_]\3\2\2\2`c\5\6\4\2ac\5\16\b\2b`\3\2\2\2ba\3\2\2\2c\5\3"+
		"\2\2\2de\7\17\2\2ef\5\b\5\2fg\7\n\2\2gh\7\3\2\2hi\5\32\16\2ij\7\13\2\2"+
		"jw\3\2\2\2kl\7\17\2\2lm\5\b\5\2mn\7\n\2\2no\7\20\2\2op\5\n\6\2pw\3\2\2"+
		"\2qr\7\17\2\2rs\5\b\5\2st\7\n\2\2tu\5\f\7\2uw\3\2\2\2vd\3\2\2\2vk\3\2"+
		"\2\2vq\3\2\2\2w\7\3\2\2\2xy\7G\2\2y\t\3\2\2\2z{\7G\2\2{\13\3\2\2\2|}\b"+
		"\7\1\2}~\5\b\5\2~\u0084\3\2\2\2\177\u0080\6\7\2\3\u0080\u0081\7\21\2\2"+
		"\u0081\u0083\5\b\5\2\u0082\177\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\r\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\u008c\5\20\t\2\u0088\u0089\5\20\t\2\u0089\u008a\5\16\b\2\u008a\u008c"+
		"\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008c\17\3\2\2\2\u008d"+
		"\u008e\7\22\2\2\u008e\u0092\5\22\n\2\u008f\u0090\7\22\2\2\u0090\u0092"+
		"\5\30\r\2\u0091\u008d\3\2\2\2\u0091\u008f\3\2\2\2\u0092\21\3\2\2\2\u0093"+
		"\u0094\b\n\1\2\u0094\u0095\7;\2\2\u0095\u0098\5\22\n\2\u0096\u0098\5\24"+
		"\13\2\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u00a1\3\2\2\2\u0099"+
		"\u009a\6\n\3\3\u009a\u009b\7:\2\2\u009b\u00a0\5\24\13\2\u009c\u009d\6"+
		"\n\4\3\u009d\u009e\79\2\2\u009e\u00a0\5\24\13\2\u009f\u0099\3\2\2\2\u009f"+
		"\u009c\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\23\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5\f\7\2\u00a5\u00a6"+
		"\5\26\f\2\u00a6\u00a7\5\f\7\2\u00a7\25\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9"+
		"\27\3\2\2\2\u00aa\u00ab\7\23\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7:\2"+
		"\2\u00ad\u00ae\5\f\7\2\u00ae\31\3\2\2\2\u00af\u00b4\5\34\17\2\u00b0\u00b1"+
		"\5\34\17\2\u00b1\u00b2\5\32\16\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2"+
		"\2\u00b3\u00b0\3\2\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\7\24\2\2\u00b6\u00bd"+
		"\5V,\2\u00b7\u00b8\7\24\2\2\u00b8\u00b9\5V,\2\u00b9\u00ba\7\25\2\2\u00ba"+
		"\u00bb\5\36\20\2\u00bb\u00bd\3\2\2\2\u00bc\u00b5\3\2\2\2\u00bc\u00b7\3"+
		"\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\b\20\1\2\u00bf\u00c0\5 \21\2\u00c0"+
		"\u00c6\3\2\2\2\u00c1\u00c2\6\20\5\3\u00c2\u00c3\79\2\2\u00c3\u00c5\5 "+
		"\21\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\37\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\b\21\1"+
		"\2\u00ca\u00cb\5\"\22\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\6\21\6\3\u00cd"+
		"\u00ce\7:\2\2\u00ce\u00d0\5\"\22\2\u00cf\u00cc\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2!\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d4\u00d8\5$\23\2\u00d5\u00d6\7;\2\2\u00d6\u00d8\5\"\22\2\u00d7"+
		"\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8#\3\2\2\2\u00d9\u00da\7\7\2\2"+
		"\u00da\u00db\5\36\20\2\u00db\u00dc\7\5\2\2\u00dc\u00e9\3\2\2\2\u00dd\u00e9"+
		"\5&\24\2\u00de\u00e9\5,\27\2\u00df\u00e0\7\26\2\2\u00e0\u00e9\5F$\2\u00e1"+
		"\u00e9\5J&\2\u00e2\u00e9\5L\'\2\u00e3\u00e9\5N(\2\u00e4\u00e9\5P)\2\u00e5"+
		"\u00e9\5R*\2\u00e6\u00e9\5T+\2\u00e7\u00e9\5X-\2\u00e8\u00d9\3\2\2\2\u00e8"+
		"\u00dd\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8\u00e1\3\2"+
		"\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e8"+
		"\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9%\3\2\2\2"+
		"\u00ea\u00eb\5(\25\2\u00eb\u00ec\5*\26\2\u00ec\u00f7\3\2\2\2\u00ed\u00ee"+
		"\5(\25\2\u00ee\u00ef\5*\26\2\u00ef\u00f0\7+\2\2\u00f0\u00f1\5*\26\2\u00f1"+
		"\u00f7\3\2\2\2\u00f2\u00f3\7&\2\2\u00f3\u00f4\5(\25\2\u00f4\u00f5\5*\26"+
		"\2\u00f5\u00f7\3\2\2\2\u00f6\u00ea\3\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00f2"+
		"\3\2\2\2\u00f7\'\3\2\2\2\u00f8\u00f9\t\3\2\2\u00f9)\3\2\2\2\u00fa\u00fd"+
		"\7\'\2\2\u00fb\u00fd\7,\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"+\3\2\2\2\u00fe\u0101\5.\30\2\u00ff\u0101\5@!\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101-\3\2\2\2\u0102\u0103\7-\2\2\u0103\u0104\5\60\31\2"+
		"\u0104\u0105\79\2\2\u0105\u0106\7.\2\2\u0106\u0107\5\66\34\2\u0107/\3"+
		"\2\2\2\u0108\u010f\7/\2\2\u0109\u010f\7\60\2\2\u010a\u010b\7\3\2\2\u010b"+
		"\u010c\5\62\32\2\u010c\u010d\7\13\2\2\u010d\u010f\3\2\2\2\u010e\u0108"+
		"\3\2\2\2\u010e\u0109\3\2\2\2\u010e\u010a\3\2\2\2\u010f\61\3\2\2\2\u0110"+
		"\u0116\5\64\33\2\u0111\u0112\5\64\33\2\u0112\u0113\7\6\2\2\u0113\u0114"+
		"\5\62\32\2\u0114\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2\2\2"+
		"\u0116\63\3\2\2\2\u0117\u0118\7\'\2\2\u0118\65\3\2\2\2\u0119\u011d\7\61"+
		"\2\2\u011a\u011d\7\62\2\2\u011b\u011d\58\35\2\u011c\u0119\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d\67\3\2\2\2\u011e\u0124\5:\36"+
		"\2\u011f\u0120\5:\36\2\u0120\u0121\7\6\2\2\u0121\u0122\58\35\2\u0122\u0124"+
		"\3\2\2\2\u0123\u011e\3\2\2\2\u0123\u011f\3\2\2\2\u01249\3\2\2\2\u0125"+
		"\u0126\5> \2\u0126\u0127\7\b\2\2\u0127\u0128\5> \2\u0128\u0129\7\r\2\2"+
		"\u0129\u012f\3\2\2\2\u012a\u012b\7\7\2\2\u012b\u012c\5<\37\2\u012c\u012d"+
		"\7\5\2\2\u012d\u012f\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u012a\3\2\2\2\u012f"+
		";\3\2\2\2\u0130\u0136\5> \2\u0131\u0132\5> \2\u0132\u0133\7\b\2\2\u0133"+
		"\u0134\5<\37\2\u0134\u0136\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2"+
		"\2\2\u0136=\3\2\2\2\u0137\u0138\5\64\33\2\u0138\u0139\7\6\2\2\u0139\u013a"+
		"\7\'\2\2\u013a?\3\2\2\2\u013b\u013c\7\63\2\2\u013c\u013d\7-\2\2\u013d"+
		"\u013e\5B\"\2\u013e\u013f\79\2\2\u013f\u0140\7.\2\2\u0140\u0141\5\66\34"+
		"\2\u0141A\3\2\2\2\u0142\u0148\7\64\2\2\u0143\u0144\7\3\2\2\u0144\u0145"+
		"\5D#\2\u0145\u0146\7\13\2\2\u0146\u0148\3\2\2\2\u0147\u0142\3\2\2\2\u0147"+
		"\u0143\3\2\2\2\u0148C\3\2\2\2\u0149\u014a\5\60\31\2\u014a\u014b\7<\2\2"+
		"\u014b\u014c\5\64\33\2\u014c\u0154\3\2\2\2\u014d\u014e\5\60\31\2\u014e"+
		"\u014f\7<\2\2\u014f\u0150\5\64\33\2\u0150\u0151\7\6\2\2\u0151\u0152\5"+
		"D#\2\u0152\u0154\3\2\2\2\u0153\u0149\3\2\2\2\u0153\u014d\3\2\2\2\u0154"+
		"E\3\2\2\2\u0155\u015c\7\65\2\2\u0156\u015c\7\66\2\2\u0157\u015c\7\67\2"+
		"\2\u0158\u0159\7\67\2\2\u0159\u015a\78\2\2\u015a\u015c\5H%\2\u015b\u0155"+
		"\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015c"+
		"G\3\2\2\2\u015d\u0163\5(\25\2\u015e\u015f\5(\25\2\u015f\u0160\7\6\2\2"+
		"\u0160\u0161\5H%\2\u0161\u0163\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e"+
		"\3\2\2\2\u0163I\3\2\2\2\u0164\u0168\7\27\2\2\u0165\u0168\7\30\2\2\u0166"+
		"\u0168\7\31\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3"+
		"\2\2\2\u0168K\3\2\2\2\u0169\u016a\7\32\2\2\u016a\u016e\7\'\2\2\u016b\u016c"+
		"\7\33\2\2\u016c\u016e\7\'\2\2\u016d\u0169\3\2\2\2\u016d\u016b\3\2\2\2"+
		"\u016eM\3\2\2\2\u016f\u0170\7=\2\2\u0170\u0174\7\'\2\2\u0171\u0172\7>"+
		"\2\2\u0172\u0174\7(\2\2\u0173\u016f\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"O\3\2\2\2\u0175\u0178\7\34\2\2\u0176\u0178\7\35\2\2\u0177\u0175\3\2\2"+
		"\2\u0177\u0176\3\2\2\2\u0178Q\3\2\2\2\u0179\u017d\7\36\2\2\u017a\u017d"+
		"\7\37\2\2\u017b\u017d\7 \2\2\u017c\u0179\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017dS\3\2\2\2\u017e\u0181\7?\2\2\u017f\u0181\7@\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181U\3\2\2\2\u0182\u0183\7G\2\2\u0183"+
		"W\3\2\2\2\u0184\u018b\7A\2\2\u0185\u018b\7B\2\2\u0186\u018b\7C\2\2\u0187"+
		"\u018b\7D\2\2\u0188\u018b\7E\2\2\u0189\u018b\7F\2\2\u018a\u0184\3\2\2"+
		"\2\u018a\u0185\3\2\2\2\u018a\u0186\3\2\2\2\u018a\u0187\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u0189\3\2\2\2\u018bY\3\2\2\2%]bv\u0084\u008b\u0091\u0097"+
		"\u009f\u00a1\u00b3\u00bc\u00c6\u00d1\u00d7\u00e8\u00f6\u00fc\u0100\u010e"+
		"\u0115\u011c\u0123\u012e\u0135\u0147\u0153\u015b\u0162\u0167\u016d\u0173"+
		"\u0177\u017c\u0180\u018a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}