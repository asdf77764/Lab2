public int delete()  
{  
    String sql = "delete from (表名) where (列名)=(值)";  
    int i=0;  
    Connection conn = getConn();//此处为通过自己写的方法getConn()获得连接  
    try  
    {  
        Statement stmt = conn.createStatement();  
        i = stmt.executeUpdate(sql);  
    }  
    catch (SQLException e)  
    {  
        e.printStackTrace();  
    }  
    return i;//如果返回的是1，则执行成功;  
}  