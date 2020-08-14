import React, { Component } from 'react';
import { Provider } from 'react-redux';
import { Route, BrowserRouter, Switch } from 'react-router-dom';

import HomeComponent from '../home'
import PatientComponent from '../patient'
import ConsultationComponent from '../consultation'

import { getStore } from './store'

const store = getStore();
store.subscribe(() => {
  localStorage.setItem("applicationState", JSON.stringify(store.getState()));
});

class App extends Component {

  render() {
    return (
      <Provider store={store}>
        <BrowserRouter>
          <Switch>
            <Route exact path='/' component={HomeComponent} />
            <Route exact path='/patients' component={PatientComponent} />
            <Route exact path='/consultations' component={ConsultationComponent} />
          </Switch>
        </BrowserRouter>
      </Provider>
    )
  }

}

export default App;
