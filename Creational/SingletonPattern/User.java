package SingletonPattern;

public class User {
    private String name;
    private int age;
    private String email;
    public static class Builder{
        private String name;
        private int age;
        private String email;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;;
            return this;
        }
        public Builder setEmail(String email){
            this.email = email;
            return this;
        }
        public User build(){
            User user = new User();
            user.name = this.name;
            user.age = this.age;
            user.email = this.email;
            return user;
        }
    }
}
