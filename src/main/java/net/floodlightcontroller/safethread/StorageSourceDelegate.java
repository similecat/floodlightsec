package net.floodlightcontroller.safethread;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

import net.floodlightcontroller.safethread.message.ApiRequest;
import net.floodlightcontroller.storage.IPredicate;
import net.floodlightcontroller.storage.IQuery;
import net.floodlightcontroller.storage.IResultSet;
import net.floodlightcontroller.storage.IRowMapper;
import net.floodlightcontroller.storage.IStorageExceptionHandler;
import net.floodlightcontroller.storage.IStorageSourceListener;
import net.floodlightcontroller.storage.IStorageSourceService;
import net.floodlightcontroller.storage.RowOrdering;
import net.floodlightcontroller.storage.StorageSourceNotification;
import net.floodlightcontroller.util.QueueWriter;

public class StorageSourceDelegate extends DelegateBase implements IStorageSourceService {

	public StorageSourceDelegate(long id, FloodlightModuleRunnable app, QueueWriter<ApiRequest> kw) {
		super(id, app, kw);
	}
	
	@Override
	public void setTablePrimaryKeyName(String tableName, String primaryKeyName) {
		apiRequestAsync("setTablePrimaryKeyName",
				Arrays.asList((Object) tableName, (Object) primaryKeyName));
	}

	@Override
	public void createTable(String tableName, Set<String> indexedColumns) {
		apiRequestAsync("createTable",
				Arrays.asList((Object) tableName, (Object) indexedColumns));
	}

	@Override
	public IResultSet executeQuery(IQuery query) {
		Object r = apiRequestSync("executeQuery",
				Arrays.asList((Object)query));
		if (r == null || !(r instanceof IResultSet)) {
			return null;
		}
		else {
			return (IResultSet) r;
		}
	}

	@Override
	public IResultSet executeQuery(String tableName, String[] columnNames,
			IPredicate predicate, RowOrdering ordering) {
		Object r = apiRequestSync("executeQuery",
				Arrays.asList((Object)tableName, (Object)columnNames, predicate, ordering));
		if (r == null || !(r instanceof IResultSet)) {
			return null;
		}
		else {
			return (IResultSet) r;
		}
	}
	
//////////////////////////////////////////////////
//Interface methods that haven't been supported
//////////////////////////////////////////////////

	@Override
	public Set<String> getAllTableNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IQuery createQuery(String tableName, String[] columnNames,
			IPredicate predicate, RowOrdering ordering) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] executeQuery(String tableName, String[] columnNames,
			IPredicate predicate, RowOrdering ordering, IRowMapper rowMapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertRow(String tableName, Map<String, Object> values) {
		apiRequestAsync("insertRow",
				Arrays.asList((Object) tableName, (Object) values));
	}

	@Override
	public void updateRows(String tableName, List<Map<String, Object>> rows) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateMatchingRows(String tableName, IPredicate predicate,
			Map<String, Object> values) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRow(String tableName, Object rowKey,
			Map<String, Object> values) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRow(String tableName, Map<String, Object> values) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRow(String tableName, Object rowKey) {
		apiRequestAsync("deleteRow",
				Arrays.asList((Object) tableName, (Object) rowKey));
	}

	@Override
	public void deleteRows(String tableName, Set<Object> rowKeys) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMatchingRows(String tableName, IPredicate predicate) {
		// TODO Auto-generated method stub

	}

	@Override
	public IResultSet getRow(String tableName, Object rowKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setExceptionHandler(IStorageExceptionHandler exceptionHandler) {
		// TODO Auto-generated method stub

	}

	@Override
	public Future<IResultSet> executeQueryAsync(IQuery query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<IResultSet> executeQueryAsync(String tableName,
			String[] columnNames, IPredicate predicate, RowOrdering ordering) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<Object[]> executeQueryAsync(String tableName,
			String[] columnNames, IPredicate predicate, RowOrdering ordering,
			IRowMapper rowMapper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> insertRowAsync(String tableName, Map<String, Object> values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> updateRowsAsync(String tableName,
			List<Map<String, Object>> rows) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> updateMatchingRowsAsync(String tableName,
			IPredicate predicate, Map<String, Object> values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> updateRowAsync(String tableName, Object rowKey,
			Map<String, Object> values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> updateRowAsync(String tableName, Map<String, Object> values) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> deleteRowAsync(String tableName, Object rowKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> deleteRowsAsync(String tableName, Set<Object> rowKeys) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> deleteMatchingRowsAsync(String tableName,
			IPredicate predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> getRowAsync(String tableName, Object rowKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Future<?> saveAsync(IResultSet resultSet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addListener(String tableName, IStorageSourceListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeListener(String tableName, IStorageSourceListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notifyListeners(List<StorageSourceNotification> notifications) {
		// TODO Auto-generated method stub

	}

}
