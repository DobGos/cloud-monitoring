import { Routes, RouterModule } from '@angular/router';
import {UsersComponent} from "./users/users.component";

const routes: Routes = [
    {path: 'users',     component: UsersComponent}
];

export const routing = RouterModule.forRoot(routes);