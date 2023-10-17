package cn.yoyo.module.aps.infra.repository;

import cn.yoyo.components.biz.infra.repository.CrudBaseRepoMybatisImpl;
import cn.yoyo.module.aps.domain.entity.Device;
import cn.yoyo.module.aps.domain.points.DeviceRepository;
import cn.yoyo.module.aps.infra.repository.mybatis.dto.TDevice;
import cn.yoyo.module.aps.infra.repository.mybatis.dto.TDeviceConvert;
import cn.yoyo.module.aps.infra.repository.mybatis.mapper.TDeviceMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Device 存储层实现。
 *
 * @author three3q
 * @date 2023-08-25
 */
@Component
public class DeviceRepositoryImpl extends CrudBaseRepoMybatisImpl<TDevice, Device>
        implements DeviceRepository {

    protected DeviceRepositoryImpl(TDeviceMapper mapper, TDeviceConvert converter) {
        super(mapper, converter);
    }

    public void whereIn(List ids) {
        // TODO: 2023-10-17 [Henry.Yu] mybatis-plus 示例查询
        /*// 方式一
        QueryChain.of(this.mapper)
                .select(T_DEVICE.ALL_COLUMNS)
                .from(T_DEVICE)
                .where(T_DEVICE.ID.in(ids))
                .list();
        // 方式二
        QueryWrapper q = QueryWrapper.create()
                .where(T_DEVICE.ID.in(ids));
        this.mapper.selectCursorByQuery(q);*/
    }
}
