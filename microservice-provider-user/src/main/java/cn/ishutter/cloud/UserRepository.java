package cn.ishutter.cloud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bruce.chan on 2017/4/7.
 */
@Repository
public interface UserRepository  extends JpaRepository<User,Long>{
}
