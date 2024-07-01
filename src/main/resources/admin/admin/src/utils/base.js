const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootrze22/",
            name: "springbootrze22",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootrze22/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "大学城水电管理系统"
        } 
    }
}
export default base
