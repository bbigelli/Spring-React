import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css';

function Navbar() {

return (<header>
    <nav className="container">
        <div className="bigflix-nav-content">
            <h1>BigFlix</h1>
            <a href="https://github.com/bbigelli" target="_blank" rel="noreferrer">
                <div className="bigflix-contact-container">
                    <GithubIcon />
                    <p className="bigflix-contact-link">/bbigelli</p>
                </div>
            </a>
        </div>
    </nav>
</header>
);

}

export default Navbar;
