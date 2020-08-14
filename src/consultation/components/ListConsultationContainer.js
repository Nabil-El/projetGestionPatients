import React, { Component } from "react";
import {connect} from "react-redux";
import {
  GET_CONSULTATIONS,
  // SET_PATIENTS,
  // PUT_PATIENTS,
  // POST_PATIENTS,
  // DELETE_PATIENTS,
  // CANCEL_PATIENT_UPDATE,
  // EDIT_PATIENT,
} from "../actions";

import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Paper from '@material-ui/core/Paper';

class ListConsultationsContainer extends Component {
  /* constructor(props) {
    super(props);
    this.state = {
      consultations: [],
    }
  } */

  componentDidMount() {
    this.props.getConsultations();
    console.log("here we go ",this.props.consultations);
  }

  render() {
    const { fetching, consultations} = this.props
    console.log("this play props",this.props)
    console.log("here", fetching, consultations)
    return (
      (fetching || consultations === undefined)
        ? <div>Loading ...</div>
        : <TableContainer component={Paper}>
          <Table className="table" aria-label="simple table">
            <TableHead className="head">
              <TableRow>
                
                <TableCell align="left">id</TableCell>
                <TableCell>Date</TableCell>
                <TableCell>Description</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>
              {consultations.map((consultations) => (
                <TableRow key={consultations.id}>
                  <TableCell component="th" scope="row">
                    {consultations.nom}
                  </TableCell>
                  <TableCell align="left">{consultations.id}</TableCell>
                  <TableCell align="left">{consultations.Date}</TableCell>
                  <TableCell align="left">{consultations.description}</TableCell>
                </TableRow>
              ))}
            </TableBody>
          </Table>
        </TableContainer>)
  }
}

    /* return (
      <div><form>
  <label>
    Nom :
    <input type="text" name="name" />
  </label>
  <input type="submit" value="Envoyer" />
  <input type="text" name="name" />
  </label>
  <input type="submit" value="Envoyer" />
</form>
    List Patients</div>)
  }
} */

const mapStateTopProps = (state) => {
  console.log("state :",state)
  return {
    consultations: state.consultationReducer.consultations,
    fetching:state.consultationReducer.fetching
  }
}

const mapDispatchToProps = (dispatch) => {
  return {
    getConsultations: () => {
      dispatch({ type: GET_CONSULTATIONS })
    }
  }
} 

export default connect(mapStateTopProps, mapDispatchToProps)(ListConsultationsContainer);
