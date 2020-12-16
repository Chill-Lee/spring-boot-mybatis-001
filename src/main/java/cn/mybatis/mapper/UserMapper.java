package cn.mybatis.mapper;

import cn.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    /**
     * 通过姓名查询人员
     * @param name
     * @return
     */
    User selectByName(String name);

    /**
     * 通过地址查询人员
     * @param address
     * @return
     */
    User selectAllByAddress(String address);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}