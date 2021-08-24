import com.zhang.model.Person
import com.zhang.model.PersonLife

import java.time.LocalDateTime

beans {
    Person(Person) {
        name = 'zxj';
        age = 16;
        hobby = ['a','b'];
        score = [1,3,2];
        birth = LocalDateTime.now();
    }
    PersonLife(PersonLife){
        person = { Person person ->
            name = 'zxj2';
            age = 162;
            hobby = ['a2','b2'];
            score = [1,3,2];
            birth = LocalDateTime.now();
        }
        lifeName = 'yong'
    }
}
