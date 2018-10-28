new Vue({
    el: '#app',
    data: {
        user: {
            username: '',
            password: '',
            age: '',
            sex: '',
            email: '',
            id: ''
        },
        userList: []
    },
    methods: {
        findAll: function () {
            var _this= this;
            axios.post('/user/findAll.do', {
            })
                .then(function (response) {
                    _this.userList=response.data;
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        findById: function (uid) {
            var _this= this;
            axios.get('/user/findById.do?id='+uid)
                .then(function (response) {
                    _this.user=response.data;
                    $("#myModal").modal("show");
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        update: function () {
            var _this= this;
            axios.post('/user/updateUser.do',_this.user)
                .then(function (response) {
                    _this.findAll();
                    console.log(response);
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    },
    created:function () {
        this.findAll();
    }
});