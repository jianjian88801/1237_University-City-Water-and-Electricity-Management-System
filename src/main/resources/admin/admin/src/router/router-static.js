import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import baoxiuxinxi from '@/views/modules/baoxiuxinxi/list'
    import shebeipaifa from '@/views/modules/shebeipaifa/list'
    import lingyongshebei from '@/views/modules/lingyongshebei/list'
    import xiaohaobaobiao from '@/views/modules/xiaohaobaobiao/list'
    import weihubaoyang from '@/views/modules/weihubaoyang/list'
    import xiulijihua from '@/views/modules/xiulijihua/list'
    import banzubaobiao from '@/views/modules/banzubaobiao/list'
    import yonghufankui from '@/views/modules/yonghufankui/list'
    import xiaohaoshebei from '@/views/modules/xiaohaoshebei/list'
    import shebeishenqing from '@/views/modules/shebeishenqing/list'
    import dingqixiufu from '@/views/modules/dingqixiufu/list'
    import lingyongbaobiao from '@/views/modules/lingyongbaobiao/list'
    import gerenbaobiao from '@/views/modules/gerenbaobiao/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhuangtaihuibao from '@/views/modules/zhuangtaihuibao/list'
    import shebeixiuli from '@/views/modules/shebeixiuli/list'
    import shebeijiance from '@/views/modules/shebeijiance/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/baoxiuxinxi',
        name: '报修信息',
        component: baoxiuxinxi
      }
      ,{
	path: '/shebeipaifa',
        name: '设备派发',
        component: shebeipaifa
      }
      ,{
	path: '/lingyongshebei',
        name: '领用设备',
        component: lingyongshebei
      }
      ,{
	path: '/xiaohaobaobiao',
        name: '消耗报表',
        component: xiaohaobaobiao
      }
      ,{
	path: '/weihubaoyang',
        name: '维护保养',
        component: weihubaoyang
      }
      ,{
	path: '/xiulijihua',
        name: '修理计划',
        component: xiulijihua
      }
      ,{
	path: '/banzubaobiao',
        name: '班组报表',
        component: banzubaobiao
      }
      ,{
	path: '/yonghufankui',
        name: '用户反馈',
        component: yonghufankui
      }
      ,{
	path: '/xiaohaoshebei',
        name: '消耗设备',
        component: xiaohaoshebei
      }
      ,{
	path: '/shebeishenqing',
        name: '设备申请',
        component: shebeishenqing
      }
      ,{
	path: '/dingqixiufu',
        name: '定期修复',
        component: dingqixiufu
      }
      ,{
	path: '/lingyongbaobiao',
        name: '领用报表',
        component: lingyongbaobiao
      }
      ,{
	path: '/gerenbaobiao',
        name: '个人报表',
        component: gerenbaobiao
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/zhuangtaihuibao',
        name: '状态汇报',
        component: zhuangtaihuibao
      }
      ,{
	path: '/shebeixiuli',
        name: '设备修理',
        component: shebeixiuli
      }
      ,{
	path: '/shebeijiance',
        name: '设备检测',
        component: shebeijiance
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
