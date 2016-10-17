public String select  
    {  
        String sql = "select * from (表名) where (列名)=(值)";  
        Connection cnn = getConn();//此处为通过自己写的方法getConn()获得连接  
        try  
        {  
            Statement stmt = conn.createStatement();  
            ResultSet rs = stmt.executeQuery(sql);  

            if(rs.next())  
            {  
                int m1 = rs.getInt(1);//或者为rs.getString(1)，根据数据库中列的值类型确定，参数为第一列  
                String m2 = rs.getString(2);  
            }  
            //可以将查找到的值写入类，然后返回相应的对象  
        }  
        catch (SQLException e)  
        {  
            e.printStackTrace();  
        }  
        return (相应的值的变量);  
    }  