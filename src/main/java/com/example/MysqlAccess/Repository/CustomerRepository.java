package com.example.MysqlAccess.Repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.MysqlAccess.Entity.Customer;

@Repository
//ここでは、エンティティのクラスとエンティティIDのクラス、 CustomerEntity と String を指定します。
public interface CustomerRepository extends CrudRepository<Customer, String> {
    // データ抽出
	@Query(value="SELECT * "
               + " FROM m_customer;"
            , nativeQuery = true)
    ArrayList<Customer> getAll();
    
    // データ更新
//    @Modifying
//    @Query("UPDATE customer"
//         + " SET c_name = :cName"
//         + " WHERE c_cd = :cCd")
//    public Integer updateData(      // 戻り値は更新件数の数字
//        @Param("cName") String c_name,
//        @Param("cCd") String c_cd
//    );


    // データ挿入

}
