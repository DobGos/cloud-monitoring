import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  console.log("Production mode!");
  enableProdMode();
}
else {
    console.log("Dev mode!")
}

platformBrowserDynamic().bootstrapModule(AppModule);
